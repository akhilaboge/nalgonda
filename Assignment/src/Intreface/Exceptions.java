package Intreface;

public class Exceptions {

	public static void main(String[] args) {
		int b=50;
		
		/*System.out.println("Program is started");
		System.out.println("Program is in progress");
		try
		{
		System.out.println(a/0);
		}
		catch(Exception e)
		{
			System.out.println("This is catch block");
		}
		System.out.println("Program is completed");
		System.out.println("Program is exited");
		System.out.println("Program is started");
		System.out.println("Program is in progress")*/;
		/*int a[]=null;
		try
		{
		System.out.println(a.length);
		}
		catch(Exception e)
		{
			System.out.println("This is catch block");
		}
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");*/
		System.out.println("Program is started");
		System.out.println("Program is in progress");
		String s="abc";
		try
		{
		int i=Integer.parseInt(s);
		}
		catch(Exception e)
		{
			System.out.println("This is catch block");
		}
		
		System.out.println("Program is completed");
		System.out.println("Program is exited");
		


	}

}
