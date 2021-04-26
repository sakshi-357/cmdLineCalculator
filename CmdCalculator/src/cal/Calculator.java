package cal;

import java.util.Arrays;
import java.util.Scanner;

public class Calculator {

	static Scanner scan = new Scanner(System.in);
    static String answer = null;
    
	public static void main(String[] args) {
        while (true)
        {
            System.out.println("Please enter expression : ");
            answer = scan.next();
            if (answer.equals("")) {
            	System.out.print("Thank you !!");
            	break;
            }    	
            else {
            	myCal(args);
            }
        }
	}
        
	public static void myCal(String[] args)
    {	
			if (args.length != 1) {
				System.out.println("Incorrect input");
				System.exit(1);
			}
			
			double result = 0;
			
			String tokens[] = splitString(args[0]);
			
			switch (tokens[1].charAt(0)) {
				case '+' : 
					result = Double.parseDouble(tokens[0]) + Double.parseDouble(tokens[2]);
					break;
				case '-' : 
					result = Double.parseDouble(tokens[0]) - Double.parseDouble(tokens[2]);
					break;
				case '*' : 
					result = Double.parseDouble(tokens[0]) * Double.parseDouble(tokens[2]);
					break;
				case '/' : 
					result = Double.parseDouble(tokens[0]) / Double.parseDouble(tokens[2]);
					break;
			}
		
			System.out.println(tokens[0] + " " + tokens[1] + " " + tokens[2] + " = " + String.format("%.2f",result));	
	}
	
	public static String[] splitString(String input) {
	    String newString = input.replace(" ", "");
		String tokens[] = newString.split("(?<=[\\(\\)\\+\\-*\\/\\^A-Za-z])|(?=[\\(\\)\\+\\-*\\/\\^A-Za-z])");
		return tokens;
	}

}
