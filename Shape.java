package shapes;

public abstract class Shape {
	
	//fields
	private String color;
	
	public Shape() {
		this.color = "red";
	}
	
	//get, set methods
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String c) {
		this.color = c;
	}
	
	public void displayInfo() {
		System.out.println("This is a " + this.getColor() + " shape");
	}
	
	public abstract double getArea();
}


