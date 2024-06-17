
package VehcileRentalSystemApp;

public class Motorcycle extends Vehicle {
    private int riderAge;

    public Motorcycle(String brand, String model, double value, int riderAge) {
        super(brand, model, value);
        this.riderAge = riderAge;
    }

    @Override
    public double calculateRentalCost(int rentalDays) {
        double dailyCost = rentalDays > 7 ? 10 : 15;
        return dailyCost * rentalDays;
    }

    @Override
    public double calculateInsuranceCost(int rentalDays) {
        double dailyInsurance = getValue() * 0.0002;
        if (riderAge < 25) {
            dailyInsurance *= 1.2;
        }
        return dailyInsurance * rentalDays;
    }
}