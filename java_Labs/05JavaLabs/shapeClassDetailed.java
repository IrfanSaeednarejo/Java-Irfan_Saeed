class Shape
{
    String color;
    Shape(){};
    Shape(String color)
    { 
        this.color = color;
    }
    double getArea()
    {
        return 0;
    }
    void display()
    {
        System.out.println("Color: " + color);
    }
 

}
class Circle extends Shape
{
    private int radius;
    Circle(int radius,String color)
    {

        super(color);
        this.radius = radius;
    }
    double getArea()
    {
        double res = Math.PI * (Math.pow(radius,2));
        return res;
    }
    void display()
    {
        super.display();
    }
}
class Rectangle extends Shape
{
    private double width, height;
    Rectangle(double width,double height,String color)
    {
        super(color);
        this.width = width;
        this.height = height;
    }
    double getArea()
    {
        double res = width * height;
        return res;
    }
    void display()
    {
        super.display();
    }

}
public class Task3
{
    public static void main(String[] args)
    {
        Circle c1 = new Circle(9,"Indigo");
        System.out.println("Radius of circle is : " + c1.getArea());
        c1.display();
        Rectangle r = new Rectangle(8,7,"Royal Blue");
        System.out.println("Area of Rectangle is : " + r.getArea());
        r.display();
    }
}
