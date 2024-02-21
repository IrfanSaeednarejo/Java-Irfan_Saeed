import java.util.ArrayList;
import java.util.List;

class Student {
  private int student_id;
  private String student_name;
  private List < Double > grades;

  public int getStudent_id() {
    return student_id;
  }

  public void setStudent_id(int student_id) {
    this.student_id = student_id;
  }

  public String getStudent_name() {
    return student_name;
  }

  public void setStudent_name(String student_name) {
    this.student_name = student_name;
  }

  public List < Double > getGrades() {
    return grades;
  }

  public void addGrade(double grade) {
    if (grades == null) {
      grades = new ArrayList < > ();
    }
    grades.add(grade);
  }
}


public class Main {
  public static void main(String[] args) {
    // Create an instance of Student
    Student student = new Student();

    // Set the values using the setter methods
    student.setStudent_id(1);
    student.setStudent_name("Nadia Hyakinthos");

    // Add grades using the addGrade() method
    student.addGrade(92.5);
    student.addGrade(89.0);
    student.addGrade(90.3);

    // Get the values using the getter methods
    int student_id = student.getStudent_id();
    String student_name = student.getStudent_name();
    List < Double > grades = student.getGrades();

    // Print the values
    System.out.println("Student ID: " + student_id);
    System.out.println("Student Name: " + student_name);
    System.out.println("Grades: " + grades);
  }
}
