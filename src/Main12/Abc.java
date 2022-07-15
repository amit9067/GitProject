package Main12;

public class Abc {

	public static void main(String[] args) {
		try
		{
			int a=10;
		    int b=a/0;
		    System.out.println(b);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
finally
{
	System.out.println("finally block");
}

	}

}
