package Functions;

import java.util.Scanner;
public class PrintingName {
	private static void printNameLength(String name) {
        System.out.println("The length of the name: " + name + "is: " + name.length());
    }

    private static void printNameCharacters(String name) {
        char[] characters = name.toCharArray();
        for (int i = 0; i < characters.length; i++) {
            System.out.print(characters[i] + " ");
        }
        System.out.println();
    }

    private static void printFullName(String firstName, String lastName) {
        System.out.println("Full name: " + firstName + " " + lastName);
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        System.out.print("Enter your first name: ");
        String firstName = sc.nextLine();

        System.out.print("Enter your last name: ");
        String lastName = sc.nextLine();

        printNameLength(firstName);
        printNameCharacters(firstName);

        printFullName(firstName, lastName);
        sc.close();

	}

}