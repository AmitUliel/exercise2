package Amit_Paz_exercise_2.calculator_execise_2;

/**
 * Israel Amit Uliel 319050423
 * Paz Abitbul 315663963
 */
public class App 
{
	public static String numberToChar(int number)
	{
		if(number < 1)
			return "Error";
		
		if( 1 <= number && number <= 49 )
			return "F";
		
		if( 50 <= number && number <= 59 )
			return "E";
		
		if( 60 <= number && number <= 69 )
			return "D";
		
		if( 70 <= number && number <= 79 )
			return "C";
		
		if( 80 <= number && number <= 89 )
			return "B";
		
		if( 90 <= number && number <= 100 )
			return "A";
		
		if( 100 < number )
			return "Error";
		
		return "Error"; // it won't get here
	}
}
