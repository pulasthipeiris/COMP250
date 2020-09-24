
public class TestPerson {

	public static void main(String[] args) {
		
		Person p1 = new Person(2020, 2050);
		Person p2 = new Person(2022, 2030);
		Person p3 = new Person(2040, 2060);
		Person p4 = new Person(2030, 2035);
		Person p5 = new Person(2020, 2060);
		
		//should return 2030
		
		Person [] myArray = {p1, p2, p3, p4, p5};
		
		System.out.println(Census.highestYear(myArray, 2020, 2080));
	}

}
//interval scheduling, sort