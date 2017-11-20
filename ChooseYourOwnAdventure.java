import java.util.Scanner;
public class ChooseYourOwnAdventure{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);

		System.out.println("WELCOME TO MICHELL\'S TINY ADVENTURE"); 

		System.out.println("You are in a creepy house! Would you like to go upstairs or into the kitchen ?");
		System.out.print(">");
		String r1=input.next();

		if(r1.equals("kitchen")){
			System.out.println("\nThere is a long countertop with dirty dishes everywhere. Off to one side there is, as you'd expect, a refrigerator. You may open the refrigerator or look in a cabinet ");
			System.out.print(">");
			String r2=input.next();
			
			if(r2.equals("refrigerator")){
				System.out.println("Inside the refrigerator you see food and stuff.It looks pretty nasty. Would you like to eat some of the food?yes or no");
				System.out.print(">");
				String r3=input.next();

				if(r3.equals("no")){
					System.out.println("You die of Starvation... eventually");
				}
				else if(r3.equals("yes")){
					System.out.print("Well, then I you ll never know what was in there. Thanks for playing, I am tired of making nested if statements");
				}
				}
			else if(r2.equals("cabinet")){
				System.out.println("Inside the cabinet you see food and stuff.It looks pretty nasty. Would you like to eat some of the food?(yes or no");
				System.out.print(">");
				String r3=input.next();
				System.out.print("I am tired of making nested if statements");	
			}
			}
		else if(r1.equals("upstairs")){
				System.out.println("upstairs you see a hallway. At the end of the hallway is the master bedroom.There is also a bathroom off the hallway. Where would you like to go? ");
				System.out.print(">");
				String r2=input.next();
				if(r2.equals("bathroom")){
					System.out.println("Would you like to open the door? (yes or not)");
					System.out.print(">");
					String r3=input.next();

					System.out.print("Well, then I you will never know	what was in there. Thanks for playing, I am tired of making nested if statements");
				}
				else if(r2.equals("bedroom")){
					System.out.println("Would you like to open the door? (yes or not)");
					System.out.print(">");
					String r3=input.next();

					System.out.print("Well, then I you will never know	what was in there. Thanks for playing, I am tired of making nested if statements");
				}
				}
			}
		}
		
