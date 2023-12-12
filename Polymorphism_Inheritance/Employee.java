package Polymorphism_Inheritance;

public class Employee {

	public String name;
    public int age;
    public int yearsWorked;
    public double salary;
    public int daysWorked;
    public int vacationDaysTaken;

    public Employee(String name, int age, int yearsWorked, double salary, int daysWorked, int vacationDaysTaken) {
        this.name = name;
        this.age = age;
        this.yearsWorked = yearsWorked;
        this.salary = salary;
        this.daysWorked = daysWorked;
        this.vacationDaysTaken = vacationDaysTaken;
    }

    public int timeToRetirement() {
        return Math.min(60 - age, 40 - yearsWorked);
    }

    public int vacationTimeLeft() {
        return (int) ((daysWorked / 360.0) * (30 - vacationDaysTaken));
    }

    public int calculateBonus() {
        return (int) (2.2 * salary);
    }

	public String login(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
}
    
    