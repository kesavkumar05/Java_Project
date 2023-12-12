package Functions;

public class CalculatorBrain {
 	public static int add(int a, int b) {
        return a+b;
    }

    public static int subtract(int a, int b) {
        return a-b;
    }

    public static int multiply(int a, int b) {
        return a*b;
    }

    public static int divide(int a, int b) {
        return a/b;
    }
    
    public static double squareRoot(double d) {
    	return Math.sqrt(d);
    }
    
    public static double power(double base, double power) {
    	return Math.pow(base, power);
    }

public static void main(String[] args) {
	// TODO Auto-generated method stub
	int result;
	result = add(5,15);
	System.out.println("Addition Result: "+result);
	
	result = subtract(20,15);
	System.out.println("Subtraction Result: "+result);
	
	result = multiply(30,15);
	System.out.println("Multiplication Result: "+result);
	
	result = divide(5,15);
	System.out.println("Division Result: "+result);
	
	double squareRootResult = squareRoot(25);
	System.out.println("Square Root: "+squareRootResult);
	
	double powerResult = power(2, 5);
	System.out.println("Power: "+powerResult);
}
}

