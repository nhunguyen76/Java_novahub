import java.util.Scanner;

public class BMICategories{
	public static void main(String[] args){
		Scanner input=new Scanner(System.in);
		float height,weight;
		String result="";

		System.out.print("Your height in m : ");
		height=input.nextFloat();

		System.out.print("Your weight in kg : ");
		weight=input.nextFloat();

		float bmi=weight/(height*height);

		System.out.println("Your BMI is "+ bmi);

		if(bmi<18.5) result="underweight";
		if(bmi>=18.5 && bmi<=24.9) result="nomal weight";
		if(bmi>=25.0 && bmi<=29.9) result="overweight";
		if(bmi>=30.0) result="obese";
		System.out.println("BMI Category: "+result);

		System.out.println("----------------");
		System.out.print("Your height in inches : ");
		height=input.nextFloat();
		height*=0.0254f;

		System.out.print("Your weight in pounds : ");
		weight=input.nextFloat();
		weight*=0.453592f;

		bmi=weight/(height*height);

		System.out.println("Your BMI is "+ bmi);

		if(bmi<15.0) result="very severely underweight";
		if(bmi>=15.0 && bmi<=16.0) result="severely underweight ";
		if(bmi>=16.1 && bmi<=18.4) result="underweight ";
		if(bmi>=18.5 && bmi<=24.9) result="nomal weight";
		if(bmi>=25.0 && bmi<=29.9) result="overweight";
		if(bmi>=30.0 && bmi<=34.9) result="moderately obese";
		if(bmi>=35.0 && bmi<=39.9) result="severely obese ";
		if(bmi>=40.0) result="very severely (or morbidly) obese ";
		System.out.println("BMI Category: "+result);

	}
}