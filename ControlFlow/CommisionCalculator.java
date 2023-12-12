package ControlFlow;

import java.util.Scanner;
public class CommisionCalculator {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long userInput = sc.nextLong();
		if(userInput>=10000) {
			double commission=userInput*0.3;
			System.out.println(commission);
		}
		else if(userInput>=5000 && userInput<=9999) {
			double commission=userInput*0.2;
			System.out.println(commission);
		}
		else if(userInput>=1000 && userInput<=4999) {
			double commission=userInput*0.1;
			System.out.println(commission);
		}
		else {
			System.out.println("N/A");
		}
		sc.close();
	}

}