
public class Rectangle {
//	declare instance variables
//	characteristics
	private double length;
	private double width;
	private String name;
	
	
//	instance methods 
	public Rectangle(double l, double w, String n) {
		
		length = l;
		width = w;
		name = n;
		
	}
	
//	getter methods
	public double getLength() {
		return length;
	}
	public double getWidth() {
		return width;
	}
	public String getName() {
		return name;
	}
	
//	instance methods 
	public double findArea() {
		return width * length;
	}
	
	public double findPerimeter() {
		return 2 * length + (2 * width);
	}
	
//	output toString
	public String toString() {
		return "Rectangle with the name of " 
				+name+ ", has a width of " 
				+getWidth()+ " and Lenght of " 
				+ getLength() +"\n Perimeter = " 
				+ findPerimeter() + "\n Area = "
				+ findArea() + "\n";
	}
	
	
}
