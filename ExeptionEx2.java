import java.io.*;
public class ExeptionEx2
{
	try
	{
		int a= 10/0;
		System.out.println(a);
	}
	catch(Arithmetic Exception e)
	{
		System.out.println("Check denominator");	
	}
}