import org.junit.Test;
import static org.junit.Assert.assertEquals;
import java.beans.Transient;
public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, This is Arithmetic Calculator");
    }

        public static int add (int a, int b){
            return a+b;
        }

        public static int subtract(int a, int b){
            return a-b;
        }

        public static int multiply(int a, int b){
            return a*b;
        }

        public static int divide(int a, int b){
            if(b==0){
                throw new IllegalArgumentException("Cannot divide by zero");
            }
            return a/b;
        }
    
        @Test
        public void testAdd(){
            assertEquals(5,add(2,3));
            assertEquals(-1, add(-2, 1));
            assertEquals(0, add(0, 0));  
        }
        @Test
        public void testSubtract(){
            assertEquals(-1,subtract(2,3));
            assertEquals(1, subtract(4, 3));
            assertEquals(5, subtract(8, 3));
        }
        @Test
        public void testMultiply(){
            assertEquals(6,multiply(2,3));
            assertEquals(-15, multiply(5, -3));
            assertEquals(0, multiply(0, 0));
        }
        @Test
        public void testDivide(){
            assertEquals(2,divide(4,2));
            assertEquals(1, divide(9,9));
            
        }

        @Test(expected = IllegalArgumentException.class)
        public void testDivideByZero() {
           assertEquals(0, divide(1,0));
        }
}
