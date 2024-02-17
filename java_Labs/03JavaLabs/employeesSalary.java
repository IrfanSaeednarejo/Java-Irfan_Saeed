
class Employee
{
    String firstName, lastName, CNIC;
    Employee(){}
    Employee(String firstName, String lastName, String CNIC)
    {
        this.firstName = firstName;
        this.lastName = lastName;
        this.CNIC = CNIC;
    }
    void setFirstName(String firstName)
    {
        this.firstName = firstName;
    }
    void setLastName(String lastName)
    {
        this.lastName = lastName;
    }
    void setCNIC(String CNIC)
    {
        this.CNIC = CNIC;
    }
    String getFirstName()
    {
        return firstName;
    }
    String getLastName()
    {
        return lastName;
    }
    String getCNIC()
    {
        return CNIC;
    }
    public String toString()
    {
        return "Name : "+firstName + " " + lastName + "\nCNIC : " +CNIC;
    }
    public double earning()
    {
        return 0.00;
    }

}
class SalariedEmployeed extends Employee
{
    double weeklySalary;

    void setWeeklySalary(double weeklySalary)
    {
        if(weeklySalary < 0 )
        {
            System.out.println("Please enter salary greater than zero");
        }
        else
        {
        this.weeklySalary = weeklySalary;
        }
    }
    double getWeeklySalary()
    {
        return weeklySalary;
    }
    SalariedEmployeed(){super();}
    SalariedEmployeed(String fname,String lname, String CNIC,double weeklySalary)
    {
        super(fname,lname,CNIC);
        this.weeklySalary = weeklySalary;
    }
    public String toString()
    {
        return "\nSalariedEmployeed\n" + super.toString();
    }
    public double earning()
    {
        return weeklySalary;
    }
}
class HourlyEmployee extends Employee
{
    double wage, hours;
    void setWage(double wage)
    {
        if(wage<0)
        {
            System.out.println("Please enter the wage greater than zero");
        }
        else
        this.wage = wage;
    }
    void setHours(double hours)
    {
        if(hours<0)
        {
            System.out.println("Enter hours greater than zero");
        }
        this.hours = hours;
    }
    double getHours()
    {
        return hours;
    }
    double getWage()
    {
        return wage;
    }
    HourlyEmployee(){super();}
    HourlyEmployee(String fname, String lname, String CNIC, double hours, double wage)
    {
        super(fname, lname, CNIC);
        this.hours = hours;
        this.wage = wage;
    }
    public String toString()
    {
        return "\nHourly Employee\n"+ super.toString();
    }
    public double earning()
    {
        if(hours<=40)
        {
            return wage * hours;
        }
        else
        {
            return 40 * wage + (hours-40) * wage * 1.5;
        }
    }

}
class CommissionEmployee extends Employee
{
    double grossSales, comissionRate;
    void setGrossSales(double grossSales)
    {
        this.grossSales = grossSales;
    }
    void setCommissionRate(double comissionRate)
    {
        this.comissionRate = comissionRate;
    }
    double getGrossSales()
    {
        return grossSales;
    }
    double getCommisionRate()
    {
        return comissionRate;
    }
    CommissionEmployee (){super();}
    CommissionEmployee (String fname, String lname, String CNIC, double grossSales, double comissionRate)
    {
        super(fname, lname, CNIC);
        this.grossSales = grossSales;
        this.comissionRate = comissionRate;
    }
    public String toString()
    {
        return "Commissioned Employee : "+ super.toString();
    }
    public double earning()
    {
        return grossSales * comissionRate ;
    }
}
class BasePlusCommission extends CommissionEmployee
{
    double baseSalary;
    void setBaseSalary(double baseSalary)
    {
        if(baseSalary < 0 )
        {
            System.out.println("Enter base salary greater than zero");
        }
        else
        {
            this.baseSalary = baseSalary;
        }
    }
    double getBaseSalary()
    {
        return baseSalary;
    }
    BasePlusCommission (){super();}
    BasePlusCommission (String fname, String lname, String CNIC, double grossSales, double comissionRate, double baseSalary)
    {
        super(fname, lname, CNIC, grossSales, comissionRate);
        this.baseSalary = baseSalary;
    }
    public String toString()
    {
        return "\nBase plus Commission employee\n"  + super.toString();
    }
    public double earnings()
    {
        return baseSalary + super.earning();
    }
}
public class Task1
{
    public static void main(String[] args)
    {
        Employee firstEmployee = new SalariedEmployeed("Irfan" ,"Saeed","111-11-1111", 780.00 );
        Employee secondEmployee = new CommissionEmployee("Kousar" ,"Saeed",
                "222-22-2222", 15000, 0.07 );
        Employee thirdEmployee = new BasePlusCommission("Aamir", "Hussain", "333-33-3333", 8000 , 0.07 , 400 );

        Employee fourthEmployee = new HourlyEmployee( "Rashid" , "Soomro", "444-44-4444" , 13.5 , 60 );
        // polymorphism: calling toString() and earning() on Employee’s reference
        System.out.println(firstEmployee);
        System.out.println(firstEmployee.earning());
        System.out.println(secondEmployee);
        System.out.println(secondEmployee.earning());
        System.out.println(thirdEmployee);
        // performing downcasting to access & raise base salary
        BasePlusCommission currentEmployee =
                (BasePlusCommission) thirdEmployee;
        double oldBaseSalary = currentEmployee.getBaseSalary();
        System.out.println( "old base salary: " + oldBaseSalary) ;
        currentEmployee.setBaseSalary(1.10 * oldBaseSalary);
        System.out.println("new base salary with 10% increase is:"+ currentEmployee.getBaseSalary());
        System.out.println(thirdEmployee.earning() );
        System.out.println(fourthEmployee);
        System.out.println(fourthEmployee.earning() );

    }
}
