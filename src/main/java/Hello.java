

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

	private static void Aufgabe1()
	{
	  System.out.println(sayHelloTravis()+"!");
	  System.out.println(DateTools.dayOfTheWeek(5, 9, 2017));
	  
	  for (int i = 1; i <= 12; ++i)
	  {
	    System.out.println(i + " has " + DateTools.daysPerMonth(i, 2017) + " days");
	  }
	  

	  System.out.println(DateTools.dayOfTheYear(2, 2, 2017) + " is der tag");
	  System.out.println(DateTools.daysTillXmas(25, 12, 2017) + " tage bis weihnachten");
	}
	
	private static void Aufgabe2()
	{
	  // CastingTools.printChars();
	  System.out.println(CastingTools.stringToInt("444"));
	}
	
	private static boolean containsPattern(char[] chars, char[] pattern)
	{
	  return chars.toString().contains(pattern.toString());
	}
	
	private static long convertBinaryToDecimal(String binaryNumber)
	{
	  int decimal = 0;
	  
	  for (int i = 0; i < binaryNumber.length(); ++i)
	  {
	    decimal += Integer.valueOf(binaryNumber.charAt(i) - '0') * Math.pow(2, ((binaryNumber.length() - i) - 1));
	  }
	  
	  return decimal;
	}
	
	/**
	 * Main method
	 * @param args not used
	 */
	public static void main(String[] args)
	{
	  // Aufgabe2();
	  
	  System.out.println(convertBinaryToDecimal("1100"));
	}

}
