package threads;

class PrintData{
	//void multiplication(int n)//method is not synchronized
   synchronized void multiplication(int n)//method is synchronized
   {
	   for(int i=1;i<=10;i++) {
		   System.out.println(n+" * "+i+" = "+n*i);
	   try {
		   Thread.sleep(400);
	   }
	   catch(InterruptedException e)
	   {
		   System.out.println(e.getMessage());
	   }
   }//end of for loop
  }//end of Synchronization
}	
class Thread1 extends Thread
{
	PrintData t;
    public Thread1(PrintData t) {
    	this.t=t;
    }
    public void run() {
    	t.multiplication(5);
    }
}
class Thread2 extends Thread{
	PrintData t;
	public Thread2(PrintData t)
	{
		this.t=t;
	}
	public void run() {
		t.multiplication(100);
	}
}
public class SyncDemo {
	public static void main(String[] args) {
		PrintData pd = new PrintData();
		
	//	Thread t1 = new Thread1(pd);
	//	Thread t2 = new Thread2(pd);
		
		//anonymous class
		//using anonymous class we can reduce size of the code
		Thread t1 = new Thread() {
			public void run() {
				pd.multiplication(5);
			}
		};
		Thread t2 = new Thread() {
			public void run() {
				pd.multiplication(100);
			}
		};
		t1.start();
		t2.start();
		
	}

}
