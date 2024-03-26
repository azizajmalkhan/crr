class Test extends Thread
{
	public void run()
	{
		for(int i =0;i<=10;i++)
		{
			System.out.println(i);
		}	
	}
}	
class ThreadEx1
{
	public static void main(String[] args)
	{
		Test obj= new test();
         	obj.start();

	}
}
	