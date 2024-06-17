
package VehcileRentalSystemApp;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Mitsubishi", "Mirage", 15000, 3);
        Vehicle motorcycle = new Motorcycle("Triumph", "Tiger Sport 660", 10000, 20);
        Vehicle van = new Van("Citroen", "Jumper", 20000, 8);

        Invoice carInvoice = new Invoice("John Doe", car, LocalDate.of(2024, 6, 3), LocalDate.of(2024, 6, 13), LocalDate.of(2024, 6, 13));
        carInvoice.printInvoice();

        System.out.println();

        Invoice motorcycleInvoice = new Invoice("Mary Johnson", motorcycle, LocalDate.of(2024, 6, 3), LocalDate.of(2024, 6, 13), LocalDate.of(2024, 6, 13));
        motorcycleInvoice.printInvoice();

        System.out.println();

        Invoice vanInvoice = new Invoice("John Markson", van, LocalDate.of(2024, 6, 3), LocalDate.of(2024, 6, 18), LocalDate.of(2024, 6, 13));
        vanInvoice.printInvoice();
    }
}