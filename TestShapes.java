package shapes;

public class TestShapes {
	
	public static void main(String [] args) {
		 
		Shape s = new Triangle(5, 12);
		s.setColor("red");
		
		Circle c = new Circle();
		c.setColor("green");
		
		Triangle t = new Triangle(15, 3);
		t.setColor("blue");
		
		/*
		s.displayInfo();
		c.displayInfo();//the displayInfo method in the circle class overrides the one in Shape class
		t.displayInfo();//similarly in triangle as well
		*/
		
		//System.out.println(s.getArea()); -> compile time error as this is invalid
		
		Shape [] shapes = {s, c, t};
		
		for (int i = 0; i<shapes.length; i++) {
			Shape myShape = shapes[i];
			
			myShape.displayInfo();
			System.out.println("The area of this shape is: " + myShape.getArea());
		}
	}

}
