import java.util.Random;
import java.util.Scanner;

public class FirstLessons {

	public static void main(String[] args) {
		/*
		//Use of the Class Random
		
		Random generator = new Random();	
		int i = generator.nextInt(10);
		System.out.println(i);
		
		i = generator.nextInt(10);
		System.out.println(i);
		
		//Making a random number generator that feeds into an if-else statement
		
		Random x = new Random();
		int y = x.nextInt(4);
		System.out.println(y);
		
		if (y == 0)
		{
			System.out.println("Only 0. That's not enough!");
		}
		else if (y == 1)
		{
			System.out.println("Only 1. That's not enough!");
		}
		else if (y == 2)
		{
			System.out.println("2 points! You passed!");
		}
		else if (y == 3)
		{
			System.out.println("3 points, perfect!");
		}
		else
		{
			System.out.println("Somehow the random number generator has gone askew! Has it gained counsciousness and thus autonomy?!");
		}
		
		 
		//Reversing a String
		
		String forward = "This is a test!";
		StringBuilder sb = new StringBuilder();
		sb.append(forward);
		String reverse = sb.reverse().toString();
		
		//reverse() is supposed to return a string value,
		//... but sb isn't a String, it's a StringBuilder.
		//Using .toString fixes the problem, changing the...
		//... outcome to a String.
		
		System.out.println(forward);
		System.out.println(reverse);
		
 
		
		//Using Stringbuilder and Reverse method to take in user data and output the reverse of this data
		
		System.out.println("Please enter something");
		
		Scanner input = new Scanner(System.in);
		String answer = input.nextLine();
		StringBuilder build = new StringBuilder();
		build.append(answer);
		String revAnswer = build.reverse().toString();
		
		System.out.println("Here is your data...");
		System.out.println(answer);
		
		System.out.println("And here is the reverse of your data!");
		System.out.println(revAnswer);
		
		
		
		//Some new math
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter Circle Radius : ");
		double radius = input.nextDouble();
		
		double circ = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
				
		System.out.printf("Circumfrences : %f: Area %f \n", circ, area);
*/
		
	}

}
