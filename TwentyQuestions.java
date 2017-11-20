import java.util.Scanner;

public class TwentyQuestions{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		String val_3="";

		System.out.println("TWO QUESTIONS!");
		System.out.println("Think of an object, and I'll try to guess it");

		System.out.println("\n Question 1) Is it animal, vetgetable, or mineral?");
		System.out.print("> ");
		String val_1=input.next();

		System.out.println("\n Question 2) Is it bigger than a breadbox?");
		System.out.print("> ");
		String val_2=input.next();

		if(val_1.equals("animal")){
			if(val_2.equals("yes")) val_3="moose";
			else if(val_2.equals("no")) {
				val_3="squirrel";
			}
		}
		else if(val_1.equals("vegetable")){
			if(val_2.equals("yes")) val_3="watermelon";
			if(val_2.equals("no")) val_3="carrot";
		}
		else if(val_1.equals("mineral")){
			if(val_2.equals("yes")) val_3="paper clip";
			if(val_2.equals("no")) val_3="Camaro";
		} 

		System.out.println("My guess is that you are thinking of a "+val_3);
		System.out.println("I would ask you if I'm right, but I don't actually care");
	}
}