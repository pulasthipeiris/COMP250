import java.util.Arrays;

public class Patient {
	
	//fields 
	
	private String name; //non-static because you want different patients to have different names 
	
	private int age;// different patients, different ages
	private double [] temps; //different temps 
	
	public static double feverTemp = 37; //constant, public because you won't be able to change the value assigned to them 
	
	public Patient(String name, int age) { //constructors must have the same name as the class 
		System.out.println("Creating a new Patient...");
		
		/*
		name = n; //as the constructor is non-static, the reference to name is legal as it is non-static as well
		age = a; 
		*/
		
		/*
		 * name = name; //if you were to put String name, int age in the constructor and try to assign name to name then it will be the field name being assigned to the local variable name, ie. null to name 
		 				* but if you want the local variable to be assigned to the field name you have to use the 'this' keyword
		 * age = age;
		 */
		
		this.name = name; //LHS - attributes/fields, RHS - local variables
		this.age = age;
	}
	
	public Patient(String name, int age, double [] temps) {
		
		System.out.println("Creating a new Patient...");
		
		this.name = name;
		this.age = age; 
		this.temps = temps;
		
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String newName) {
		this.name = newName;
	}
	
	public static void main(String[] args) {
		
		Patient p1 = new Patient("John", 30); 
		
		//as a constructor was made, the default constructor [ Patient() ] cannot be used as the constructor takes precedence 
		//p1.name = "John";
		
		System.out.println(p1.name + ", " + p1.age); 
		
		double [] lennyTemps = {0,1,2};
		double [] johnTemps = {0,1,2};
		
		System.out.println(Arrays.equals(lennyTemps, johnTemps));
			
		Patient p2 = new Patient("Lenny", 21, lennyTemps);
		
		System.out.println(p2.name + ", " + p2.age + ", " + Arrays.toString(p2.temps)); 
		
		/*
		*for (int i=0; i<p2.temps.length; i++) {
		*	System.out.println(p2.temps[i]);       //you can print out the array elements one by one through the loop or use Array.toString() 
		*}
		*/
	}
}
