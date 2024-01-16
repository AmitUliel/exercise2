package Amit_Paz_exercise_2.calculator_execise_2;

/**
 * Hello world!
 *
 */
public class App 
{
	public static String numberToChar(int number)
	{
		if(number < 1)
			return "Error";
		
		else if( 1 <= number && number <= 49 )
			return "F";
		
		else if( 50 <= number && number <= 59 )
			return "E";
		
		else if( 60 <= number && number <= 69 )
			return "D";
		
		else if( 70 <= number && number <= 79 )
			return "C";
		
		else if( 80 <= number && number <= 89 )
			return "B";
		
		else if( 90 <= number && number <= 100 )
			return "A";
		
		else if( 100 < number )
			return "Error";
		
		return "Error"; // it won't get here
	}
}
