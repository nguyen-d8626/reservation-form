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
		
		Scanner input = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		name = input.nextLine();
		System.out.println("Please enter your year of birth: ");
		year = input.nextInt();
		
		System.out.println("Hello "+name +".\nBy now, you are "+ReturnAge(year) +" years old.");
		
		
	}
	
	public static int ReturnAge(int yr) {
		int currentYear = Year.now().getValue();
		int age = currentYear - yr;
		if (age>=19) {
			System.out.println("Please proceed to a new reservation");
		}
		else {
			System.out.println("Sorry, we cannot serve you this year. We are looking foward to serve you in "+ (19-age) +" year(s)!");
		}
		return age;
	}
	

}
