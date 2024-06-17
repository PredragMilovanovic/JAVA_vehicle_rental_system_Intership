
package VehcileRentalSystemApp;

public class Car extends Vehicle {
    private int safetyRating;

    public Car(String brand, String model, double value, int safetyRating) {
        super(brand, model, value);
        this.safetyRating = safetyRating;
    }

    @Override
    public double calculateRentalCost(int rentalDays) {
        double dailyCost = rentalDays > 7 ? 15 : 20;
        return dailyCost * rentalDays;
    }

    @Override
    public double calculateInsuranceCost(int rentalDays) {
        double dailyInsurance = getValue() * 0.0001;
        if (safetyRating >= 4) {
            dailyInsurance *= 0.9;
        }
        return dailyInsurance * rentalDays;
    }
}