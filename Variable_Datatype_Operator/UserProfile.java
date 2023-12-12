package Variable_Datatype_Operator;

import java.util.Scanner;
import java.time.Year;
public class UserProfile {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter you Name:");
		String name = scan.next();
		System.out.println("Enter you Age:");
		int age = scan.nextInt();
		System.out.println("Enter you Gender:");
		char gender = scan.next().charAt(0);
		System.out.println("Enter you Job Preference:");
		String jobPreference = scan.next();
		System.out.println("Enter you Job Nationality:");
		String nationality = scan.next();
		System.out.println("Enter you Blood Tpye:");
		String bloodType = scan.next();
		int birthYear = Year.now().getValue() - age;
		
		
		System.out.println("User Profile:");
		System.out.println("Name: "+name);
		System.out.println("Age: "+age);
		System.out.println("Birth Year: "+birthYear);
		System.out.println("Gender: "+gender);
		System.out.println("Job Preference: "+jobPreference);
		System.out.println("Nationality: "+nationality);
		System.out.println("Blood Type: "+bloodType);
		scan.close();
	}


}