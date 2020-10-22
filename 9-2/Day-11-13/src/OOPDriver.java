
public class OOPDriver {

	public static void main(String[] args) {
		
		
		OOP mycircle = new OOP(1.5, "Blue");
		OOP yourcircle = new OOP(2.5, "Pink");
		
		System.out.println("Radius of mycirlce is " + mycircle.getRadius());
		System.out.println("Radius of yourcircle is " + yourcircle.getRadius());
		
		//access find area 
		System.out.println("Area of mycircle is " + mycircle.findArea());
		System.out.println("Area of yourcirlce is " + yourcircle.findArea());
		
		

	}

}
