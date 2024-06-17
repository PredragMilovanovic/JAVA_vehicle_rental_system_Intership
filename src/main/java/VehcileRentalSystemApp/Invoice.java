
package VehcileRentalSystemApp;

import java.time.LocalDate;

public class Invoice {
    private String customerName;
    private Vehicle rentedVehicle;
    private LocalDate startDate;
    private LocalDate endDate;
    private LocalDate actualReturnDate;

    public Invoice(String customerName, Vehicle rentedVehicle, LocalDate startDate, LocalDate endDate, LocalDate actualReturnDate) {
        this.customerName = customerName;
        this.rentedVehicle = rentedVehicle;
        this.startDate = startDate;
        this.endDate = endDate;
        this.actualReturnDate = actualReturnDate;
    }

    public void printInvoice() {
        double rentalCost = calculateTotalRentalCost();
        double insuranceCost = rentedVehicle.calculateInsuranceCost(getActualRentalDays());
        double totalCost = rentalCost + insuranceCost;

        System.out.println("XXXXXXXXXXXX");
        System.out.println("Date: " + actualReturnDate);
        System.out.println("Customer Name: " + customerName);
        System.out.println("Rented Vehicle: " + rentedVehicle.getBrand() + " " + rentedVehicle.getModel() + "\n");

        System.out.println("Reservation start date: " + startDate);
        System.out.println("Reservation end date: " + endDate);
        System.out.println("Reserved rental days: " + getRentalDays() + " days\n");

        System.out.println("Actual return date: " + actualReturnDate);
        System.out.println("Actual rental days: " + getActualRentalDays() + " days\n");

        System.out.printf("Rental cost per day: $%.2f%n", rentedVehicle.calculateRentalCost(getRentalDays()) / getRentalDays());

        if (rentedVehicle instanceof Car) {
            System.out.printf("Insurance per day: $%.2f%n\n", insuranceCost / getActualRentalDays());
        } else if (rentedVehicle instanceof Motorcycle) {
            Motorcycle motorcycle = (Motorcycle) rentedVehicle;
            double initialInsuranceForMotor = motorcycle.getValue() * 0.0002;
            System.out.printf("Initial insurance per day: $%.2f%n", initialInsuranceForMotor);
            double insuranceAdditionPerDay = (insuranceCost / getActualRentalDays()) - initialInsuranceForMotor;
            System.out.printf("Insurance addition per day: $%.2f%n", insuranceAdditionPerDay);
            System.out.printf("Insurance per day: $%.2f%n\n", insuranceCost / getActualRentalDays());
        } else if (rentedVehicle instanceof Van) {
            Van van = (Van) rentedVehicle;
            double initialInsuranceForVan = van.getValue() * 0.0003;
            System.out.printf("Initial insurance per day: $%.2f%n", initialInsuranceForVan);
            double insuranceDiscountPerDay = initialInsuranceForVan - (insuranceCost / getActualRentalDays());
            System.out.printf("Insurance discount per day: $%.2f%n", insuranceDiscountPerDay);
            System.out.printf("Insurance per day: $%.2f%n\n", insuranceCost / getActualRentalDays());
        }

        if (getActualRentalDays() < getRentalDays()) {
            System.out.printf("Early return discount for rent: $%.2f%n", calculateDiscountedCost());
            System.out.printf("Early return discount for insurance: $%.2f%n\n", rentedVehicle.calculateInsuranceCost(getRentalDays() - getActualRentalDays()));
        }

        System.out.printf("Total Rental Cost: $%.2f%n", rentalCost);
        System.out.printf("Total Insurance Cost: $%.2f%n", insuranceCost);
        System.out.printf("Total Cost: $%.2f%n", totalCost);

        System.out.println("XXXXXXXXXXXX");
    }

    private double calculateTotalRentalCost() {
        if (getActualRentalDays() == getRentalDays()) {
            return rentedVehicle.calculateRentalCost(getActualRentalDays());
        } else {
            double fullCost = rentedVehicle.calculateRentalCost(getActualRentalDays());
            double dailyCost = getRentalDays() > 7 ? 40 : 50;
            double halfCost = dailyCost * (getRentalDays() - getActualRentalDays()) / 2;
            return fullCost + halfCost;
        }
    }

    private double calculateDiscountedCost() {
        double dailyCost = getRentalDays() > 7 ? 40 : 50;
        return dailyCost * (getRentalDays() - getActualRentalDays()) / 2;
    }

    public int getRentalDays() {
        return (int) java.time.temporal.ChronoUnit.DAYS.between(startDate, endDate);
    }

    public int getActualRentalDays() {
        return (int) java.time.temporal.ChronoUnit.DAYS.between(startDate, actualReturnDate);
    }
}