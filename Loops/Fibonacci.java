package Loops;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No of Terms:");
		int n = sc.nextInt();
		System.out.println("Fibonacci series till "+n+" terms");
		int i=1, firstTerm=0,secondTerm=1,nextTerm;
		do {
			System.out.println(firstTerm);
			nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			i++;
		}while(i<=n);
		sc.close();
	}

}
