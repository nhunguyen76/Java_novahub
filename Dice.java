import java.util.Random;

public class Dice{
	public static void main(String[] args){
		Random r= new Random();

		System.out.println("HERE COMES THE DICE!");

		int num1=r.nextInt(6) + 1;
		int num2=r.nextInt(6) + 1;
		System.out.print("\n Roll #1: "+num1);
		System.out.print("\n Roll #2: "+num2);
		System.out.println("\n The total is "+(num1+num2));

	}
}