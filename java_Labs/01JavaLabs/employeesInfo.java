import java.util.Scanner;
class EmployeeInfo
{
    double salary;
    int noOfhrsWorkDay;
    void getinfo(double salary, int noOfhrsWorkDay)
    {
        this.salary = salary;
        this.noOfhrsWorkDay = noOfhrsWorkDay;

    }
    void Addsalary()
    {
        if(salary<500)
            salary=salary+10;

    }
    void Addwork()
    {
        if(noOfhrsWorkDay>6)
           salary+=5;
    }

void FinalSalary()
{
    System.out.println("The final salary is : "+salary);
    System.out.println("work hour per day : "+noOfhrsWorkDay);
}


}
public class Info
{
    public static void main(String[] args)
    {
        Scanner input=new Scanner(System.in);
        System.out.print("Enter the salary of the employee : ");
        double salary=input.nextDouble();
        System.out.print("Enter the number of hours worked on the day : ");
        int noOfhrsWorkDay=input.nextInt();
        EmployeeInfo emp=new EmployeeInfo();
        emp.getinfo(salary,noOfhrsWorkDay);
        emp.Addsalary();
        emp.Addwork();
        emp.FinalSalary();


    }
}
