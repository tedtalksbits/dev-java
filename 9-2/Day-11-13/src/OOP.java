//***** this is the BLUEPRINT class - it has NO MAIN ******//
//	circle example	

public class OOP {
	
//	declare instance variables
//	characteristics
	private double radius;
	private String color;
	
//	declare constructor method (used to build the objects)
	public OOP( double r, String c) {
		
		radius = r; 
		color = c;
	}
	
//	getter methods
	public double getRadius() {
		return radius;
	}
	public String getColor() {
		return color;
	}
/********************* INSTANCE METHODS ***********************************/
//	find area
	public double findArea() {
		
		return Math.PI * Math.pow(radius, 2);
	}
	
//	find circumference 
	public double findCirc() {
		
		return 2 * Math.PI * radius;
	}
	
//	output method
	public String toString() {
		
		return "Circle with a color of " + color + " has an area of " + findArea();
	}
}
