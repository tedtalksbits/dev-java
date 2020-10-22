
public class OOPDriver2 {

	public static void main(String[] args) {
		
		OOP tedaneCircle = new OOP(9.0, "Pink");
		OOP otherCircle = new OOP(1.11, "Teal");
		
		System.out.println("Tedane circle color is " + tedaneCircle.getColor());
		System.out.println("Tedane circle radius is " + tedaneCircle.getRadius());
		System.out.println("Tedane circle area is " + tedaneCircle.findArea() +"\n");
		
		System.out.println("other circle color is " + otherCircle.getColor());
		System.out.println("other circle radius is " + otherCircle.getRadius());
		System.out.println("other circle area is " + otherCircle.findArea() +"\n");
		
//		call findCirc method
		System.out.println("other circle circumference is " + otherCircle.findCirc());
		
//		toString method
		System.out.println(tedaneCircle.toString());
	}
}
