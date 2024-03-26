import java.io.*;
public class ExceptionEx1
{
	public static void main(String[] args)
	{
		try
		{
		    FileReader fr = new FileReader("abc.txt");
		    System.out.println("Reading From file");
      		}
		catch(FileNotFoundException e)
		{
		    System.out.println("check file is there or not");
		}
		System.out.println("Rest of the program");
	}
}