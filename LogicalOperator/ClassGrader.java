package LogicalOperator;

import java.util.Scanner;

public class ClassGrader {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the student's grade: ");
        int grade = sc.nextInt();

        if (grade <= 0 || grade > 10) {
            System.out.println("Invalid grade entered. Enter Again.");
        } 
        else if (grade <= 3) {
            System.out.println("Grade: Failed");
        } 
        else if (grade <= 5) {
            System.out.println("Grade: Insufficient");
        } 
        else if (grade <= 8) {
            System.out.println("Grade: Good");
        } 
        else if (grade == 10) {
            System.out.println("Grade: Excellent");
        } 
        else {
            System.out.println("Grade: Good");
        }
        sc.close();
    }
}