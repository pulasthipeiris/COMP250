public class Census { //Pre-condition: Assuming that everyone existed in the range of years
	
	/*
	 * Algorithm 
	 * create an array of [(endYear - startYear) + 1 + 1] elements (the number of total years in the range), where first index (0) = startYear 
	 * for each person object in people array, increment 1 at the index-year equivalent of their birth year, decrement 1 at the index-year equivalent of death year
	 * loop through this array and get the index/year with the highest total 
	 * as we are taking the first year of range to be the reference point the highest year would be the highest total + the first year of range
	 */
	
	public static int highestYear ( Person[] people, int startYear, int endYear) { // method taking array of Person objects, 
																				   //start year and end year for range (start year to end year) 
		
		 int[] countArray = getCountArray(people, startYear, endYear); //creates array based on array made in getCountArray method
		 int highestYear = getHighestYear(countArray); // assigns the year in which maximum number of people were alive using the getHighesYear method 
	     return highestYear + startYear; //getHighestYear returns an integer from 0 to (endYear - startYear), the reference point is startYear
	  
	}
	
	public static int[] getCountArray(Person[] people, int startYear, int endYear) { //getCountArray method that returns an array 
																				     //of total (births-deaths) for each year 
		
		int [] countArray = new int[endYear - startYear + 2 ]; // initializes countArray with number of years INCLUDING startYear and endYear 
		
		for(int i = 0; i < people.length; i++) { //loops through the array and goes through each element
			
			int born = people[i].getbirthYear() - startYear; // born is the year in which the person at index i was born 
				countArray[born]++; //increments 1 at the index that corresponds to that year. For example for range (2000 - 2020), 2008 is index at 8 
			
			 int died = people[i].getdeathYear() - startYear; // born is the year in which the person at index i was born 
	            countArray[died + 1]--; //decrements 1 at the index that corresponds to that year. For example for range (2000 - 2020), 2008 is index at 8 
		}
		
		return countArray; //returns array 
		
	}
	
	public static int getHighestYear(int [] array) { //getHighestYear method that returns the year in which the highest number of people were alive
		
		int livingCounter = 0, highestYear = 0, highestLiving = 0 ; //initializing variables needed
		
		for (int newYear = 0 ; newYear < array.length; newYear ++ ) { // where newYear is taking the startYear as 0 
			
			livingCounter = livingCounter + array[newYear]; //totals the number of people alive, adding together the yearly(births-deaths)
			
			if(livingCounter > highestLiving) { //if the living counter (total = births-deaths of each year) is greater than the highest living
				
				//example test cases - range -> 2000 - 2050
				//2000 - 2 people total 
				//2001 - 4 people total
				//2002 - -1 people total
			
				highestYear = newYear; //then assign that index/year to be the highest year as it is greater than the previous total
				highestLiving = livingCounter; //highest living would be equal to the highest living counter
											   // if the living counter decreases in a certain year, then the highest year would be the year before that
											   // until the living counter rises higher than the current living counter 
				
			}
		} 
		
		return highestYear; //returns the year in which most people were alive
		
	}

}


