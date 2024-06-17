
package VehcileRentalSystemApp;

public class Van extends Vehicle {
    private int driverExperience;

    public Van(String brand, String model, double value, int driverExperience) {
        super(brand, model, value);
        this.driverExperience = driverExperience;
    }

    @Override
    public double calculateRentalCost(int rentalDays) {
        double dailyCost = rentalDays > 7 ? 40 : 50;
        return dailyCost * rentalDays;
    }

    @Override
    public double calculateInsuranceCost(int rentalDays) {
        double dailyInsurance = getValue() * 0.0003;
        if (driverExperience > 5) {
            dailyInsurance *= 0.85;
        }
        return dailyInsurance * rentalDays;
    }
}