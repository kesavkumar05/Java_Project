package Variable_Datatype_Operator;

import java.lang.Math;
import java.util.Scanner;
public class Variablename_Typecasting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the diameter of circle:");
		int diameter = sc.nextInt();
		double radius = diameter/2.0;
		double area = Math.PI * Math.pow(radius, 2);
		double perimeter = 2 * Math.PI * radius;
		System.out.println("Area of circle: "+area);
		System.out.println("Perimeter of circle: "+perimeter);
		sc.close();
	}
}