import java.util.Random;
import java.util.Scanner;

public class FirstLessons {

	public static void main(String[] args) {
		//Use of the Class Random
		
		Random generator = new Random();	
		int i = generator.nextInt(10);
		System.out.println(i);
		
		i = generator.nextInt(10);
		System.out.println(i);
		
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
		
		//Some new math
		Scanner input = new Scanner(System.in);	
		System.out.println("Enter Circle Radius : ");
		double radius = input.nextDouble();
		
		double circ = 2 * Math.PI * radius;
		double area = Math.PI * radius * radius;
				
		System.out.printf("Circumfrences : %f: Area %f \n", circ, area);

	}

}
