class MyRunnable implements Runnable
{
    public void run()
    {
        for(int i=0;i<=10;i++){
            System.out.println("Child THread = " +i);
        }
    }
}
public class ThreadRunnableInter
{
    public static void main(String[] args)
    {
        MyRunnable obj =new MyRunnable();
        Thread t = new Thread(obj);  /*In Runnable class start() method is not there that's
  why create Thread class Object passing Runnable object Then on Thread class object call start() method */
        t.start();
        for(int i =0;i<=10;i++)
        {
            System.out.println("Main Thread = " + i);
        }
    }
}