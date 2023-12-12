package OOPS_Fundamentals;

import java.util.ArrayList;
import java.util.List;

class Student {
    String firstName;
    String lastName;
    int registration;
    int grade;
    int year;

    public Student(String firstName, String lastName, int registration, int grade, int year) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = grade;
        this.year = year;
    }

    public Student(String firstName, String lastName, int registration) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.registration = registration;
        this.grade = 0;
        this.year = 1;
    }

    public Student() {
        this.firstName = "";
        this.lastName = "";
        this.registration = 0;
        this.grade = 0;
        this.year = 1;
    }

    public void printFullName() {
        System.out.println(firstName + " " + lastName);
    }

    public boolean isApproved() {
        return grade >= 60;
    }

    public int changeYearIfApproved() {
        if (isApproved()) {
            year++;
            System.out.println("Congratulations, " + firstName + " " + lastName + ", you have been approved and moved to year " + year);
        }
        return year;
    }
}

class Course {
    String courseName;
    String professorName;
    int year;
    List<Student> students = new ArrayList<>();

    public Course(String courseName, String professorName, int year) {
        this.courseName = courseName;
        this.professorName = professorName;
        this.year = year;
    }

    public void enroll(Student student) {
        students.add(student);
    }

    public void enroll(Student[] students) {
        for (Student student : students) {
            enroll(student);
        }
    }

    public void unEnroll(Student student) {
        students.remove(student);
    }

    public int countStudents() {
        return students.size();
    }

    public int bestGrade() {
        int maxGrade = 0;
        for (Student student : students) {
            if (student.grade > maxGrade) {
                maxGrade = student.grade;
            }
        }
        return maxGrade;
    }
}

public class SchoolSystemProject {
    public static void main(String[] args) {
    	Student student1 = new Student("Kesav Kumar", "JayaKumar", 001, 88, 1);
        Student student2 = new Student("Vinoth", "Sanjay", 002, 80, 2);
        Student student3 = new Student("Vignesh", "Kumar", 003, 75, 3);
        Student student4 = new Student("Gokul", "Sridhar", 004, 55, 4);
        

        Course course = new Course("Java Full Stack Developer", "James", 2023);

        course.enroll(student1);
        course.enroll(student2);
        course.enroll(student3);
        course.unEnroll(student4);
        System.out.println(student4.firstName + " " + student4.lastName + ", removed from course.");
        
        
        student1.changeYearIfApproved();
        student2.changeYearIfApproved();
        student3.changeYearIfApproved();
        System.out.println("**************************************************************************************");
        

        System.out.println("Enrolled students in " + course.courseName + ":");
        System.out.println("**************************************************************************************");
        for (Student student : course.students) {
            student.printFullName();
        }
        System.out.println("**************************************************************************************");
        System.out.println("Total enrolled students: " + course.countStudents());
        System.out.println("Best grade in the course: " + course.bestGrade());

        Student[] newStudents = {new Student("Ravi", "Velu", 789), new Student("Gautham", "Menon", 901)};
        course.enroll(newStudents);
        
        System.out.println("**************************************************************************************");
        System.out.println("Updated enrolled students:");
        for (Student student : course.students) {
            student.printFullName();
        }
    }
}
