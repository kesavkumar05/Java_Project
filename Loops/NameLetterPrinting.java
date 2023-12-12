package Loops;

import java.util.Scanner;
public class NameLetterPrinting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Name:");
		String name = sc.nextLine();
		System.out.println("Printing each letter of Given Name:");
		for(int i=0;i<name.length();i++) {
			char letter=name.charAt(i);
			System.out.println("Letter at Position "+i+": "+letter);
		}
		sc.close();
	}

}