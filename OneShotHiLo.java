import java.util.Scanner;
import java.util.Random;

public class OneShotHiLo{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);
		Random r=new Random();
		int ranNum=1 + r.nextInt(10);

		System.out.println("I'm thinking of a number between 1-100. Try to guess it");
		int num= in.nextInt();

		

		if(num<ranNum) System.out.println("Sorry, you are too low. I was thinking of "+ranNum);
		else if(num==ranNum) System.out.println("You guessed it! What are the odds ");
		else System.out.println("Sorry, you are too high. I was thinking of "+ranNum);
	}
}