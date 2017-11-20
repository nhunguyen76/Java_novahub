import java.util.Scanner;

public class TheWorstNumber{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);

		System.out.print("TEH WORST NUMBER GESSING GAME EVER!!!!");
		System.out.print("I'M THINKING OF A NUMBER FROM 1-10. TRY TO GUESS! ");
		int num=in.nextInt();
		int num_secret=7;

		if(num==num_secret) 
			System.out.println("Wooh, u wrong, I win, it was "+num_secret);
		else System.out.println("LOL, u got it, i cant believe u guest it was "+num_secret);
	}
}