import java.time.Year;
import java.util.*;


/**
 * 
 */

/**
 * @author uyenm
 *
 */
public class myApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String name;
		int year;
		int numOfPeople;
		int timeSlot;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		name = input.nextLine();
		System.out.println("Please enter your year of birth: ");
		year = input.nextInt();
		
		System.out.println("Hello "+name +"!");
		if (ReturnAge(year)>=19) {
			System.out.println("Please proceed to a new reservation");
			//proceed to reservation
			Scanner userInput = new Scanner (System.in);
			
			//accept number of people
			System.out.println("Enter the number of people in your party (minimum: 1, maximum: 20): ");
		
			while (true) {
				//check if it is a number
				try {
					numOfPeople = userInput.nextInt();
					
					//check if the number is in the proper range
					if (numOfPeople<=20&&numOfPeople>=1) {
						break;
					}
					else {
						System.out.println("Enter the number of people again: ");
					}
					
				}
				catch (InputMismatchException e) {
					System.out.println("Please re-enter your number of people: ");
					userInput.nextLine();
				}
				
			}
		
			//provide time slot 
			System.out.println("Please choose enter the number according to the desired time slot:"+
								"\n1 - 6PM \t2 - 7PM \t3 - 8PM \t4 - 9PM");
			
			while (true) {
				//check if it is a number
				try {
					timeSlot = userInput.nextInt();
					
					//check if the number is in the proper range
					if (timeSlot==1||timeSlot==2||timeSlot==3||timeSlot==4) {
						break;
					}
					else {
						System.out.println("Enter the number again: \n1 - 6PM \t2 - 7PM \t3 - 8PM \t4 - 9PM");
					}
					
				}
				catch (InputMismatchException e) {
					System.out.println("Please re-enter your number for your time slot: ");
					userInput.nextLine();
				}
				
			}
			CreateReservation (name, numOfPeople, timeSlot);
		}
		else {
			System.out.println("Sorry, we cannot serve you this year. We are looking foward to serve you in "+ (19-ReturnAge(year)) +" year(s)!");
		}
		
	}
	
	public static int ReturnAge(int yr) {
		int currentYear = Year.now().getValue();
		int age = currentYear - yr;
		return age;
	}
	
	public static void CreateReservation(String name, int numOfPeo, int time) {
		int exactTime = time + 5;
		
		System.out.println(name + ", your table for " + numOfPeo + " people has been successfully booked for " + exactTime +" p.m. tonight.");
	}

}
