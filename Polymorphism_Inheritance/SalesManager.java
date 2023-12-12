package Polymorphism_Inheritance;

public class SalesManager extends Employee {
    private int teamSales;

    public SalesManager(String name, int age, int yearsWorked, double salary, int daysWorked, int vacationDaysTaken, int teamSales) {
        super(name, age, yearsWorked, salary, daysWorked, vacationDaysTaken);
        this.teamSales = teamSales;
    }

    public int calculateCommission() {
        return (int) (0.03 * teamSales);
    }
}
