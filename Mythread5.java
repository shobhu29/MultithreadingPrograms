
public class Mythread5 extends Thread {
	int count;
	public void run()
		{	
			
			for(int i=0;i<5;i++)
			{
				System.out.println(Thread.currentThread().getName() + " " + (++count) );
						
			}
			

		}
		
	public static void main(String[] args) {
		
		Mythread5 my = new Mythread5();
		
		Thread t1 = new Thread(my,"First");
		Thread t2 = new Thread(my,"Second");
		Thread t3 = new Thread(my,"Third");
		
		t1.start();
		try{
			t1.sleep(200);
			}catch(InterruptedException ie){
				ie.printStackTrace();
			}
		t2.start();
		try{
			t2.sleep(200);
			}catch(InterruptedException ie){
					ie.printStackTrace();
			}
		
		t3.start();
		try{
			t3.sleep(200);
			}catch(InterruptedException ie){
					ie.printStackTrace();
			}
		
		
	}

}
