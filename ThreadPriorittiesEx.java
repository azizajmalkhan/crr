class Thread1 extends Thread
{
    public void run()
    {
        Thread t1 = Thread.currentThread();
        int p = t1.getPriority();
        System.out.println("Priority of Thread_1 = " +p);

        for(int i=0;i<=10;i++)
        {
            System.out.println("Child Thread_1 = " +i);
        }
    }
}
class Thread2 extends Thread
{
    public void run()
    {
        Thread t2=Thread.currentThread();
        int p2 = t2.getPriority();
        System.out.println("Priority of Thread_2 = " +p2 );

        for(int i=0;i<=10;i++)
        {
            System.out.println("Child Thread_2 = " +i);
        }
    }
}

public class ThreadPriorittiesEx
{
    public static void main(String[] args)
    {
        Thread1 obj1 = new Thread1();
        Thread2 obj2 = new Thread2();
        obj1.setPriority(8);
        obj2.setPriority(10);
        obj1.start();
        obj2.start();
    }
}