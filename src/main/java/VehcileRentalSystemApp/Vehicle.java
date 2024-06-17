
package VehcileRentalSystemApp;

public abstract class Vehicle {
    private String brand;
    private String model;
    private double value;

    protected Vehicle(String brand, String model, double value) {
        this.brand = brand;
        this.model = model;
        this.value = value;
    }

    public abstract double calculateRentalCost(int rentalDays);
    public abstract double calculateInsuranceCost(int rentalDays);

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getValue() {
        return value;
    }
}