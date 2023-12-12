package Polymorphism_Inheritance;

class SalesRep extends Employee {
	    public int salesMade;

	    public SalesRep(String name, int age, int yearsWorked, double salary, int daysWorked, int vacationDaysTaken, int salesMade) {
	        super(name, age, yearsWorked, salary, daysWorked, vacationDaysTaken);
	        this.salesMade = salesMade;
	    }

	    public int calculateCommission() {
	        return (int) (0.1 * salesMade);
	    }
}


