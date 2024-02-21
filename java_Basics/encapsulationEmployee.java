//Encapsulation
// Employee Class

class Employee {
  private int employee_id;
  private String employee_name;
  private double employee_salary;

  public int getEmployeeId() {
    return employee_id;
  }

  public void setEmployeeId(int employeeId) {
    this.employee_id = employeeId;
  }

  public String getEmployeeName() {
    return employee_name;
  }

  public void setEmployeeName(String employeeName) {
    this.employee_name = employeeName;
  }

  public double getEmployeeSalary() {
    return employee_salary;
  }

  public void setEmployeeSalary(double employeeSalary) {
    this.employee_salary = employeeSalary;
  }

  public String getFormattedSalary() {
    return String.format("$%.2f", employee_salary);
  }
}

public class Main {
  public static void main(String[] args) {
    // Create an instance of Employee
    Employee employee = new Employee();

    // Set values using setter methods
    employee.setEmployeeId(15);
    employee.setEmployeeName("Irfan Saeed");
    employee.setEmployeeSalary(4900.0);

    // Get values using getter methods
    int employeeId = employee.getEmployeeId();
    String employeeName = employee.getEmployeeName();
    String formattedSalary = employee.getFormattedSalary();

    // Print the values
    System.out.println("Employee Details:");
    System.out.println("ID: " + employeeId);
    System.out.println("Name: " + employeeName);
    System.out.println("Salary: " + formattedSalary);
  }
}
