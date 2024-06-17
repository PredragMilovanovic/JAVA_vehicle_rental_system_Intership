# Vehicle Rental System - Java

## Overview

This project aims to design a simple yet functional vehicle rental system that manages the rental and return processes of different types of vehicles. The system calculates rental and insurance costs based on specific business rules and prints out an invoice for the customer.

## Basic Functionality

- **Vehicle Types**: Available vehicles include motorcycles, cars, and cargo vans.
- **Rental Information**: Required details include the vehicle brand, model, and value. Additional specifics vary by vehicle type:
  - **Cars**: Safety rating (1-5).
  - **Motorcycles**: Rider age.
  - **Cargo Vans**: Driver experience.
- **Rental Period**: Users specify the start and end dates of the rental period.
- **Cost Calculation**: Daily rental and insurance costs are calculated based on vehicle type and business rules.
- **Invoice Generation**: An invoice is automatically generated at the end of the rental period, displaying all relevant details and costs.

## Project Structure

The project is organized into the following components:

- **Main.java**: Entry point of the application where vehicle rentals are initiated.
- **Vehicle.java**: Abstract base class for all vehicle types, containing common properties and methods.
- **Car.java, Motorcycle.java, Van.java**: Concrete implementations of different vehicle types with specific rental and insurance cost calculations.
- **Invoice.java**: Defines the Invoice class responsible for generating and printing rental invoices.

## Installation and Usage

### Prerequisites

- Java Development Kit (JDK) installed on your machine.

### Steps to Run

1. **Clone Repository**: Clone this repository to your local machine:
https://github.com/PredragMilovanovic/JAVA_vehicle_rental_system_Intership
2. **Navigate to Directory**: Navigate to the directory containing the cloned repository:
cd vehicle-rental-system-java
3. **Compile and Run**: Use the following commands to compile and run the application:
javac Main.java
java Main
## Example Output

Below are examples of the generated invoices:

### Invoice 1
XXXXXXXXXXXX
Date: 2024-06-13
Customer Name: John Doe
Rented Vehicle: Mitsubishi Mirage

Reservation start date: 2024-06-03
Reservation end date: 2024-06-13
Reserved rental days: 10 days

Actual return date: 2024-06-13
Actual rental days: 10 days

Rental cost per day: $15.00
Insurance per day: $1.50

Total Rental Cost: $150.00
Total Insurance Cost: $15.00
Total Cost: $165.00
XXXXXXXXXXXX
### Invoice 2
XXXXXXXXXXXX
Date: 2024-06-13
Customer Name: Mary Johnson
Rented Vehicle: Triumph Tiger Sport 660

Reservation start date: 2024-06-03
Reservation end date: 2024-06-13
Reserved rental days: 10 days

Actual return date: 2024-06-13
Actual rental days: 10 days

Rental cost per day: $10.00
Initial insurance per day: $2.00
Insurance addition per day: $0.40
Insurance per day: $2.40

Total Rental Cost: $100.00
Total Insurance Cost: $24.00
Total Cost: $124.00
XXXXXXXXXXXX
### Invoice 3
XXXXXXXXXXXX
Date: 2024-06-13
Customer Name: John Markson
Rented Vehicle: Citroen Jumper

Reservation start date: 2024-06-03
Reservation end date: 2024-06-18
Reserved rental days: 15 days

Actual return date: 2024-06-13
Actual rental days: 10 days

Rental cost per day: $40.00
Initial insurance per day: $6.00
Insurance discount per day: $0.90
Insurance per day: $5.10

Early return discount for rent: $100.00
Early return discount for insurance: $25.50

Total Rental Cost: $500.00
Total Insurance Cost: $51.00
Total Cost: $551.00
XXXXXXXXXXXX
## License

This project is licensed under the MIT License. See the LICENSE file for details.