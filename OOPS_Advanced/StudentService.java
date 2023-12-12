package OOPS_Advanced;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import FinalProject.model.Student;

public class StudentService
{
    HashMap<String, Course> courseList = new HashMap<>();

    HashMap<String, Student> students = new HashMap<>();

    HashMap<String, List<Course>> coursesEnrolledByStudents = new HashMap<>();


    public StudentService()
    {
        courseList.put( "Math", new Course( "Math", 10, "Aurelio Baldor" ) );
        courseList.put( "Physics", new Course( "Physics", 10, "Albert Einstein" ) );
        courseList.put( "Art", new Course( "Art", 10, "Pablo Picasso" ) );
        courseList.put( "History", new Course( "History", 10, "Sima Qian" ) );
        courseList.put( "Biology", new Course( "Biology", 10, "Charles Darwin" ) );
    }

    public void enrollStudents(String courseName, String studentID) throws CourseNotFoundException, StudentNotFoundException {
        Course course = courseList.get(courseName);

        if (course == null) {
            throw new CourseNotFoundException("Course not found: " + courseName);
        }

        if (!students.containsKey(studentID)) {
            throw new StudentNotFoundException("Student not found: " + studentID);
        }

        if (!coursesEnrolledByStudents.containsKey(studentID)) {
            coursesEnrolledByStudents.put(studentID, new ArrayList<>());
        }
        coursesEnrolledByStudents.get(studentID).add(course);
    }

    public void unEnrollStudents( String courseName, String studentID )
    {
        Course course = courseList.get( courseName );

        if ( coursesEnrolledByStudents.containsKey( studentID ) )
        {
            coursesEnrolledByStudents.get( studentID ).remove( course );
        }
    }

    public void showEnrolledStudents(String courseId){
        //TODO implement using collections loops
    	System.out.println("Students enrolled in " + courseId + ":");
        for (Map.Entry<String, List<Course>> entry : coursesEnrolledByStudents.entrySet()) {
            String studentID = entry.getKey();
            List<Course> enrolledCourses = entry.getValue();

            for (Course course : enrolledCourses) {
                String name;
				if (course.getCourseName().equals(name)) {
                    System.out.println("Student ID: " + studentID);
                    break;
                }
            }
        }
    }

    
    
    
    public void showAllCourses(){
        //TODO implement using collections loops
    	System.out.println("List of all courses:");
        for (Course course : courseList.values()) {
            System.out.println(course.getCourseId() + " - " + course.getCourseId() +
                    " (ProfessorName: " + course.getProfessorName() + ")");
        }
    }
}