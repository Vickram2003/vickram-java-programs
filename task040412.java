package AllPrograms

abstract class Shape1    
{
public abstract double area();
public abstract double perimeter();
}
class Rectangle1 extends Shape1
{
double length;
double width;
public Rectangle1(int length,int width)
{
	this.length=length;
	this.width=width;
}
	
	public double area() {
	
		return length*width;
	}

	
	public double perimeter() {
		
		return 2*(length+width);
	}
	
}
class Circle1 extends Shape1
{
double radius;
public Circle1(double radius)
{
	this.radius=radius;
}
	
	public double area() {
		
		return Math.PI*Math.pow(radius, 2);
	}


	public double perimeter() {
	
		return 2*Math.PI*radius;
	}
}
class Triangle1 extends Shape1
{
	double base;
	double side1;
	double side2;
	public Triangle1(double base,double side1,double side2)
	{
		this.base=base;
		this.side1=side1;
		this.side2=side2;
	}
	public double area()
	{
		return Math.log(side1)*base/2;
	}
	public double perimeter()
	{
		return base+side1+side2;
	}
}
public class Task040412 {

	public static void main(String[] args) {
		Rectangle1 obj=new Rectangle1(4,4);
		System.out.println("Area of circle: ");
		obj.area();
		System.out.println("Perimeter of circle: ");
		obj.perimeter();
		Circle1 obj1=new Circle1(4);
		System.out.println("Area of circle: ");
		obj1.area();
		System.out.println("Perimeter of circle: ");
		obj.perimeter();

	}

}
