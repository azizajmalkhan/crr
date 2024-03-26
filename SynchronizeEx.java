class BookMyShow
{
   int availableTickets = 1;

   public void bookTicket(int wantedTickets)
   {
      String str = Thread.currentThread().getName();
      System.out.println(str + " is trying to book the ticket");

      synchronized(This)
      {
         if(wantedTickets <= availableTickets)
         {
            System.out.println(wantedTickets + " is alloted to " + str);

            System.out.println("printing the tickets...");
          
            try {
              Thread.sleep(500);
            }catch(InterruptedException e){}

            availableTickets = availableTickets - wantedTickets;
        }
        else
        {
           System.out.println("tickets sold out");
        }
      } 

      System.out.println("available tickets : " + availableTickets);
   }
}

class Thread1 extends Thread
{
   BookMyShow bms;

   public Thread1(BookMyShow bms) {
     this.bms = bms;
   }

   public void run() {
      bms.bookTicket(1);
   }
}

class Thread2 extends Thread
{
   BookMyShow bms;

   public Thread2(BookMyShow bms) {
     this.bms = bms;
   }

   public void run() {
      bms.bookTicket(1);
   }
}

public class SyncExample
{
   public static void main(String[] args)
   {
      BookMyShow bms = new BookMyShow();

      Thread1 t1 = new Thread1(bms);
      Thread2 t2 = new Thread2(bms);

      t1.setName("first person");
      t2.setName("second person");

      t1.start();
      t2.start(); 
   }
}
