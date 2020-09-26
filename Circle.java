package shapes;

public class Circle extends Shape{
	//field 
	private double radius = 5; 
	
	//other methods
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
	
	public void displayInfo() {
		System.out.println("This is a " + this.getColor() + " circle");
	}
}
