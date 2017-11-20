import java.util.Scanner;
import java.util.Random;

public class ANumberGuessingGame{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Random r=new Random();

		System.out.println("I'm thinking of a number from 1 to 10");
		System.out.print("Your guess: ");
		int num= in.nextInt();

		int ranNum=1 + r.nextInt(10);

		if(num==ranNum) System.out.println("That is right! My secret number was "+num);
		else System.out.println("Sorry, but I was really thinking of "+ranNum);

	}
}