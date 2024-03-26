class Thread1 extends Thread
{
   public void run()
   {
      for(int i=1;i<=10;i++) 
      {
         try {
            Thread.sleep(1000);
         } catch(InterruptedException e){}

         System.out.println("child thread : " + i);
      }
   }
}

public class JoinSleepExample
{
   public static void main(String[] args) throws InterruptedException
   {
      Thread1 t1 = new Thread1();
      t1.start();

      t1.join();

      for(int i=1;i<=10;i++) {
         System.out.println("main thread : " + i);
      }
   }
}