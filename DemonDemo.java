package threads;

public class DemonDemo extends Thread{
      public void run()
      {
    	  //checking if the thread is demon or not
    	  if(Thread.currentThread().isDaemon()) {
    		  System.out.println("Demon thread");
    	  }
    	  else {
    		  System.out.println("User thread");
    	  }
      }
	public static void main(String[] args) {
		DemonDemo d1 = new DemonDemo();
		DemonDemo d2 = new DemonDemo();
		DemonDemo d3 = new DemonDemo();
       //setting demon to be true
		d1.setDaemon(true);
		d1.start();
		d2.start();
		d3.start();
	}

}
