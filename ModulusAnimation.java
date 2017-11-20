public class ModulusAnimation
{
	public static void main( String[] args ) throws Exception
	{
		for ( int i=0; i<42; i++ )
		{
			if ( i%21 == 0 )
				System.out.print(" Mr. Mitchell is cool.\r");
			else if(i%21 == 1)
				System.out.print("l. Mr. Mitchell is coo\r");
			else if(i%21 == 2)
				System.out.print("ol. Mr. Mitchell is co\r");
			else if(i%21 == 3)
				System.out.print("ool. Mr. Mitchell is c\r");
			else if(i%21 == 4)
				System.out.print("cool. Mr. Mitchell is \r");
			else if(i%21 == 5)
				System.out.print(" cool. Mr. Mitchell is\r");
			else if(i%21 == 6)
				System.out.print("s cool. Mr. Mitchell i\r");
			else if(i%21 == 7)
				System.out.print("is cool. Mr. Mitchell \r");
			else if(i%21 == 8)
				System.out.print(" is cool. Mr. Mitchell\r");
			else if(i%21 == 9)
				System.out.print("l is cool. Mr. Mitchel\r");
			else if(i%21 == 10)
				System.out.print("ll is cool. Mr. Mitche\r");
			else if(i%21 == 11)
				System.out.print("ell is cool. Mr. Mitch\r");
			else if(i%21 == 12)
				System.out.print("hell is cool. Mr. Mitc\r");
			else if(i%21 == 13)
				System.out.print("chell is cool. Mr. Mit\r");
			else if(i%21 == 14)
				System.out.print("tchell is cool. Mr. Mi\r");
			else if(i%21 == 15)
				System.out.print("itchell is cool. Mr. M\r");
			else if(i%21 == 16)
				System.out.print("Mitchell is cool. Mr. \r");
			else if(i%21 == 17)
				System.out.print(" Mitchell is cool. Mr.\r");
			else if(i%21 == 18)
				System.out.print(". Mitchell is cool. Mr\r");
			else if(i%21 == 19)
				System.out.print("r. Mitchell is cool. M\r");
			else if(i%21 == 20)
				System.out.print("Mr. Mitchell is cool.\r");
			Thread.sleep(200);
		}
		
	}
}
