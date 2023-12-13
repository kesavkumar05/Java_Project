package OOPS_Advanced;

public class CourseNotFoundException extends Exception {

    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public CourseNotFoundException() {
        super("Course not found!!");
    }
}