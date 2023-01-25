import java.util.Scanner; // Needing to import this class to be able to read from the keyboard.
public class Time_Calculator {

public static void main(String[] args) {
	// TODO Auto-generated method stub

	// This program convert user input as seconds to years and months and days.
	// It needs input of seconds to convert it to years and month and days


				//Declaring scanner
				Scanner input = new Scanner(System.in);
					
				//Prints a welcome message.
				System.out.println("Welcome to the time calculator");
				System.out.println("----------------------------------------------");
				//Asking User for input
				System.out.println("Please enter the number of seconds: ");
					
				// Variable declarations and Formulas for converting
					
					
				int second = input.nextInt();
					
				// Calculating seconds in years
				int year = second / 31536000;
					
				// Calculating remain seconds in months
				int remainMonth = second % 31536000 ;
					
				// Calculating remain seconds in days
				int remaindDay = remainMonth % 2592000;
					
				// Converting remain seconds for month to number of months
				int month = remainMonth / 2592000;
					
				// Converting remain seconds for day to number of days
				int day = remaindDay / 86400;

				//Display the number of years, months and days
				System.out.println(second + " seconds is approximately " + year + " years, " + month + " months and " + day + " days");
					
				// Closing message for the user
				System.out.println("Thank you for using the program!"); 
					
					
				//Close the Scanner Object
				 input.close();	
					
				}

			}
	
