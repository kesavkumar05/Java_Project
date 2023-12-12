package OOPS_Advanced;

public class Course
{
    public String name;
    
    public String id;

    public int credits;

    public String professorName;

    public Course( String name, int credits, String professorName )
    {
        this.name = name;
        this.id = id;
        this.credits = credits;
        this.professorName = professorName;
    }

	public String getCourseId() {
		// TODO Auto-generated method stub
		return id;
	}

	public String getProfessorName() {
		// TODO Auto-generated method stub
		return professorName;
	}

	public String getCourseName() {
		// TODO Auto-generated method stub
		return name;
	}
}
