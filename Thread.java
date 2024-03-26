public class Mythread extends Thread
{
	public void run()
	{
		for(int i =0; i<=10; i++)
		{
			System.out.println(" Child Thread = "+ i );
		}
	}
}
public class Thread
{
	public static void main(String[] args)
	{
		Mythread obj = new Mythread();
		obj.start();
		for(int i = 0;i<=10;i++)
		{
			System.out.println("main thread = "+ i);
		}
	}
}