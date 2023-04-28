package threads;

public class JoinExample extends Thread{
	public void run() {
		for(int i=1;i<=4;i++) {
			try {
				Thread.sleep(500);//500 miliseconds
			}
			catch(InterruptedException e){
				System.out.println(e.getMessage());
			}
			System.out.println(i+" "+Thread.currentThread().getName());
		}
	}
	public static void main(String[] args) {
		JoinExample j1 = new JoinExample();
		JoinExample j2 = new JoinExample();
		JoinExample j3 = new JoinExample();
        
	j1.setName("Thread 1");
	j2.setName("Thread 2");
	j3.setName("Thread 3");
	
	j1.start();
	try {
		j1.join();//it will create j1 thread continously
	}
	catch(Exception e)//originally it will throw inturepted exception
	{
		System.out.println(e.getMessage());
	}
	j2.start();
	/*try {
		j2.join();
	}
	catch(Exception e) {
		System.out.println(e.getMessage());
	}*/
	j3.start();
}

}
