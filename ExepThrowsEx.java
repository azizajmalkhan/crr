import java.io.*;
public class ExepThrowsEx
{
	public static void main(String[] args)throws FileNotFoundException
	{
		FileReader fr = new FileReader("jump.txt");
		System.out.println("Hello File Reader");
	}
}