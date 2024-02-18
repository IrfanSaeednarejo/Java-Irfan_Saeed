class person
{
    private String fname,lname;
    person(){};
    person(String fname,String lname)
    {
        this.fname = fname;
        this.lname = lname;
    }
    void setFname(String fname)
    {
        this.fname = fname;
    }
    void setLname(String lname)
    {
        this.lname = lname;
    }
    String getFname()
    {
        return fname;
    }
    String getLname()
    {
        return lname;
    }
    void display()
    {
        System.out.println("First name: " + fname+" Last name: " + lname);
    }
}
class Student extends person
{
    private String teacherName;
    private String course;
    private int id ;

    Student(String teacherName, String course, int id, String fname, String lname)
    {
        super(fname,lname);
        this.teacherName = teacherName;
        this.course = course;
        this.id = id;
    }
    void displayDetails()
    {
        super.display();
        System.out.print("id : "+id+" course : "+course+"TeacherName : "+teacherName);
    }
}
class Teacher extends person
{
    private String subname;
    private double salary;
    Teacher(String fname, String lname,String subname, double salary)
    {
        super(fname, lname);
        this.subname = subname;
        this.salary = salary;
    }
    void TeacaherDetails()
    {
        super.display();
        System.out.print(" Subject Name : " + subname+" Salary : " + salary);

    }
}

public class Task1
{
    public static void main(String[] args)
    {
        Student s1 = new Student("DrGM", "Object-Oriented Programming",107,"Irfan Saeed","Narejo");
        Student s2 = new Student("DrGM", "Object-Oriented Programming",108,"Aamir","Hussain");
        Teacher t1 = new Teacher("Kousar", "Saeed", "Object-Oriented Programming",94557.98 );
        Teacher t2 = new Teacher("Tayyab", "Bhutto", "Object-Oriented Programming",52645.98 );
        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
        System.out.println();
        t1.TeacaherDetails();
        System.out.println();
        t2.TeacaherDetails();

    }
}
