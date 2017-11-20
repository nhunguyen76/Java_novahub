public class CompareToChallenge{
	public static void main(String[] args){
		System.out.print("Comparing \"axe\" with \"dog\" produces ");
		int i = "axe".compareTo("dog");
		System.out.println(i);

		System.out.print("Comparing \"cat\" with \"dog\" produces ");
		i = "cat".compareTo("dog");
		System.out.println(i);

		System.out.print("Comparing \"bird\" with \"fish\" produces ");
		i = "bird".compareTo("fish");
		System.out.println(i);

		System.out.print("Comparing \"dog\" with \"fish\" produces ");
		i = "dog".compareTo("fish");
		System.out.println(i);

		System.out.print("Comparing \"coffee\" with \"latte\" produces ");
		i = "coffee".compareTo("latte");
		System.out.println(i);

		System.out.print("Comparing \"clock\" with \"clock\" produces ");
		i = "clock".compareTo("clock");
		System.out.println(i);

		System.out.print("Comparing \"latte\" with \"latte\" produces ");
		i = "latte".compareTo("latte");
		System.out.println(i);

		System.out.print("Comparing \"applebee's\" with \"apple\" produces ");
		System.out.println( "applebee's".compareTo("apple") );

		System.out.print("Comparing \"house\" with \"home\" produces ");
		System.out.println( "house".compareTo("home") );

		System.out.print("Comparing \"willing\" with \"will\" produces ");
		System.out.println( "willing".compareTo("will") );

		System.out.print("Comparing \"vn\" with \"thailand\" produces ");
		System.out.println( "vn".compareTo("thailand") );

		System.out.print("Comparing \"bmw\" with \"audi\" produces ");
		System.out.println( "bmw".compareTo("audi") );
	}
}