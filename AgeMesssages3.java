import java.util.Scanner;

public class AgeMesssages3{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		System.out.print("Your name: ");
		String name=input.next();

		System.out.print("Your age: ");
		int age=input.nextInt();

		if(age<16){
			System.out.println("You can't drive, "+name);
		}
		else if(age==16 && age==17){
			System.out.println("You can drive but not vote, "+name);
		}
		else if(age>=18 && age<25){
			System.out.println("You can vote but not rent a car, "+name);
		}
		else if(age>=25) {
			System.out.println("You can do pretty much anything, "+name);

		}
	}
}