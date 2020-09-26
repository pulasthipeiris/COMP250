package shapes;

public class Circle extends Shape{
	//field 
	private double radius; 
	
	//other methods
	public double getRadius() {
		return this.radius;
	}
	
	public double getArea() {
		return this.radius * this.radius * Math.PI;
	}
	
}
