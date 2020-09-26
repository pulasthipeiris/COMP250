package shapes;

public class Triangle extends Shape{

	//fields
	private double base; 
	private double height;
	
	public Triangle(double b, double h) {
		this.base = b;
		this.height = h;
	}
	
	public double getArea() {
		return (this.base * this.height) /2;
	}
	
	public void displayInfo() {
		System.out.println("This is a " + this.getColor() + " triangle");
	}
}
