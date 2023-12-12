package Polymorphism_Inheritance;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Creating an Employee
        Employee employee = new Employee("John Doe", 35, 10, 50000, 250, 10);
        // Creating a SalesRep
        SalesRep salesRep = new SalesRep("Alice Smith", 28, 5, 60000, 200, 8, 20);
        // Creating a SalesManager
        SalesManager salesManager = new SalesManager("Bob Johnson", 45, 15, 80000, 300, 15, 500000);

        // Demonstrating Employee methods
        System.out.println("Time to Retirement: " + employee.timeToRetirement() + " years");
        System.out.println("Vacation Time Left: " + employee.vacationTimeLeft() + " days");
        System.out.println("Bonus: $" + employee.calculateBonus());

        // Demonstrating SalesRep methods
        System.out.println("SalesRep Commission: $" + salesRep.calculateCommission());

        // Demonstrating SalesManager methods
        System.out.println("SalesManager Commission: $" + salesManager.calculateCommission());

       
	}

}
