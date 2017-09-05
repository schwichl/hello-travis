

/**
 * A class containing a main method which prints "Hello Travis!"
 * @author Johannes Drönner
 *
 */
public class Hello {
	
	/**
	 * A static method returning "Hello Travis!".
	 * @return "Hello Travis!"
	 */
	static public String sayHelloTravis() {
		return "Hello Travis xd";
	}; 

	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
		System.out.println(sayHelloTravis()+"!");
		System.out.println(DateTools.dayOfTheWeek(5, 9, 2017));
		
		if (false)
		{
  		for (int i = 1; i <= 12; ++i)
  		{
  		  System.out.println(i + " has " + DateTools.daysPerMonth(i, 2017) + " days");
  		}
		}

    System.out.println(DateTools.dayOfTheYear(2, 2, 2017) + " is der tag");
    System.out.println(DateTools.daysTillXmas(25, 12, 2017) + " tage bis weihnachten");
	}

}
