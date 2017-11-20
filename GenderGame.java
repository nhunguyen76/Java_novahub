import java.util.Scanner;

public class GenderGame{
	public static void main(String[] args){
		Scanner input=new Scanner (System.in);

		String res="";
		System.out.print("What is your gender (M or F): ");
		String gender=input.next();
		System.out.print("First name : ");
		String fristName=input.next();
		System.out.print("Last name : ");
		String lastName=input.next();
		System.out.print("Age : ");
		int age=input.nextInt();

		if(gender.equals("F")){
			if(age>=20){
				System.out.print("Are you married, "+fristName+" (y or n)? ");
		    String married=input.next();
		    if(married.equals("y")) res="Mrs.";
		    else res="Ms.";
			}
			
		}
		else if(gender.equals("M") && age>=20){
			 res="Mr";
		}
		else res=fristName;

		System.out.println("Then I shall call you "+res+" "+lastName);
		


	}
}