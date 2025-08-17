package Multithreading;
//ThreadPool
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Pro15 implements Runnable{
	private String message;
	public Pro15(String s) {
		this.message=s;
	}
	public void run() {
		System.out.println(Thread.currentThread().getName()+"(Start)message="+message);
		processmessage();//call processmessage method that sleeps the thread for 2 seconds 
		System.out.println(Thread.currentThread().getName()+"(End)");
	}
	private void processmessage() {
		try {
			Thread.sleep(2000);
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ExecutorService executor=  Executors.newFixedThreadPool(5);
		for (int i = 0; i < 10; i++) {  
            Runnable worker = new Pro15("" + i);  
            executor.execute(worker);//calling execute method of ExecutorService  
          }  
        executor.shutdown();  
        while (!executor.isTerminated()) {   }  
  
        System.out.println("Finished all threads");  
    
	}
}
