/*
 * Create a new data type Person:
	
	Every person has a year of birth (int) and a year of death (int). These should be both private
	fields.
	
	Add a constructor that creates a Person given two integers as input representing the year of birth
	and the year of death respectively. If the second input is smaller than the first one, then the
	constructor should raise and IllegalArgumentException.
	
	Add public get methods for both fields.
 */


public class Person {
	
	private int birthYear; //a person's year of birth 
	private int deathYear; //a person's year of death
	
	public Person(int birthYear, int deathYear) { //constructor taking two integers (birthYear and deathYear) as input parameters
		
		this.birthYear = birthYear; //assigning input parameter to field birthYear
		this.deathYear = deathYear; //assigning input parameter to field deathYear
		
		if (this.deathYear < this.birthYear) { //if the deathYear is less than the birthYear throw an exception
			
			throw new IllegalArgumentException("Year of death cannot be before year of birth"); //throws exception
		}
	}
	
	public int getbirthYear() { //get method to return birthYear
		return birthYear;
	}
	
	public int getdeathYear() { //get method to return deathYear
		return deathYear;
	}

}
