package shapes;

public class TestShapes {
	
	public static void main(String [] args) {
		 
		Shape s = new Shape();
		
		s.setColor("red");
		
		System.out.println(s.getColor());
		
		Circle c = new Circle();
		
		System.out.println(c.getArea());
	}

}
