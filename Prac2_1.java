/*Design a class named Circle containing following attributes and behavior.
        • One double data field named radius. The default value is 1.
        • A no-argument constructor that creates a default circle.
        • A Single argument constructor that creates a Circle with the specified radius.
        • A method named getArea() that returns area of the Circle.
        • A method named getPerimeter() that returns perimeter of it.*/
//Prepared by Prasan_21CE121
import java.util.Scanner;
class circle
{
    double radius=1;
    final double pi=3.14;
    public circle()
    {}
    public circle(double r)
    {
        
        radius=r;
    }
    public double getArea()
    {
        
        return pi*radius*radius;
    }
    public double getperimeter()
    {
        
        return 2*pi*radius;
    }

}
public class Prac2_1{
    public static void main(String[] args) {
        circle c1 = new circle();
        System.out.println("Area is " + c1.getArea() + " Perimeter is " + c1.getperimeter());//take default value of radius
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius of circle:");
        double r=sc.nextDouble();
        circle c2 = new circle(r);
        System.out.printf("Area is " + c2.getArea() + " Perimeter is " + c2.getperimeter());
        System.out.println("\n21CE121_PrasanSavaliya");                                                   
    }
}

