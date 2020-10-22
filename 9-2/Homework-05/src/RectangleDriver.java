
public class RectangleDriver {

	public static void main(String[] args) {
		
		Rectangle Small = new Rectangle (2.3, 1.2, "Small Guy");
		Rectangle BFR = new Rectangle (200.45, 500, "BFR");
		Rectangle Medium = new Rectangle (100.85, 80, "Medium");
		
		System.out.println(Small.toString());
		System.out.println(BFR.toString());
		System.out.println(Medium.toString());
		
		if (Small.findArea() > BFR.findArea() && Small.findArea() > Medium.findArea()) {
			System.out.println("Biggest Area: " + Small.getName());
		}
		else if(BFR.findArea() > Medium.findArea() && BFR.findArea() > Small.findArea()) {
			System.out.println("Biggest Area: " + BFR.getName());
		}
		else {
			System.out.println("Biggest Area: " + Medium.getName());
		}
		
	}

}
