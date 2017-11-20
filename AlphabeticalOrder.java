import java.util.Scanner;

public class AlphabeticalOrder{
	public static void main(String[] args){
		Scanner in=new Scanner(System.in);

		System.out.print("What's your last name? ");
		String name=in.next();

		if("name".compareTo("Carswell")<0) 
			System.out.println("you don't have to wait long, "+name);
		else if("name".compareTo("Jones")<0) 
			System.out.println("that's not bad, "+name);
		else if("name".compareTo("Smith")<0) 
			System.out.println("looks like a bit of a wait, "+name);
		else if("name".compareTo("Young")<0) 
			System.out.println("it's gonna be a while, "+name);
		else if("name".compareTo("Young")>=0) 
			System.out.println("not going anywhere for a while? "+name);
	}
}