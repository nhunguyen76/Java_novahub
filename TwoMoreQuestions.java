import java.util.Scanner;

public class TwoMoreQuestions{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		String val_3="";

		System.out.println("TWO MORE QUESTIONS,BABY");
		System.out.println("Think of somthing and I'll try to guess it");

		System.out.print("\n Question 1) Does it stay inside or outside or both? ");
		String val_1=input.next();

		System.out.println("\n Question 2) Is it alive? ");
		String val_2=input.next();

		if(val_1.equals("inside") && val_2.equals("yes")) val_3="houseplant";
		if(val_1.equals("inside") && val_2.equals("no")) val_3="shower curtain";
		if(val_1.equals("outside") && val_2.equals("yes")) val_3="bison";
		if(val_1.equals("outside") && val_2.equals("no")) val_3="billboard";
		if(val_1.equals("both") && val_2.equals("yes")) val_3="dog";
		if(val_1.equals("both") && val_2.equals("no")) val_3="cell phone";
		System.out.println("\n is a "+val_3);

}
}