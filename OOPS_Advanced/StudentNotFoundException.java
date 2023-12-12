package OOPS_Advanced;

public class StudentNotFoundException extends Exception{
	public StudentNotFoundException(String string ){
    super( "Student not found!" );
	}
}