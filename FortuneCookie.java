import java.util.Random;

public class FortuneCookie{
	public static void main(String[] args){
		
		Random r=new Random();

		System.out.println("Fortune cookie says: Stick with your wife");

		int num1=1 + r.nextInt(54); 

		int num2=1 + r.nextInt(54); 
		while(num1==num2) num2=1 + r.nextInt(54);

		int num3=1 + r.nextInt(54); 
		while(num3==num2 || num3==num1) num3=1 + r.nextInt(54);

		int num4=1 + r.nextInt(54); 
		while(num4==num1 || num4==num2 || num4==num3) num4=1 + r.nextInt(54);

		int num5=1 + r.nextInt(54); 
		while(num5==num1 || num5==num2 || num5==num3 || num5==num4) num5=1 + r.nextInt(54);

		int num6=1 + r.nextInt(54); 
		while(num6==num1 || num6==num2 || num6==num3 ||num6==num4 || num6==num5) num6=1 + r.nextInt(54);
	
		System.out.println("\t" +num1+" - "+num2+" - "+num3+" - "+num4+" - "+num5+" - "+num6);
	}
}