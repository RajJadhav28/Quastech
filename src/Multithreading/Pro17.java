package Multithreading;

public class Pro17 extends Thread{
	Pro17(String tName, ThreadGroup tgrp){
		super(tgrp, tName);
			start();
	}
	public void run() {
		for(int j=0;j<=1000;j++) {
			try {
				Thread.sleep(5);
			}catch(InterruptedException e) {
				System.out.println("The execption has been encountered"+e);
			}
		}
		System.out.println(Thread.currentThread().getName() + " thread has finished executing");
	}
	public static void main(String[] args) throws InterruptedException {
		ThreadGroup tg=new ThreadGroup("The parent group of thread");
		ThreadGroup tg1 = new ThreadGroup(tg, "the child group");
		
		Pro17 th1=new Pro17("first",tg);
		System.out.println("Starting the first.");
		
		Pro17 th2=new Pro17("second", tg);
		System.out.println("Starting the second.");
		th1.join();
		th2.join();
		int priority=tg.getMaxPriority();
		System.out.println("The maximum priority of the parent ThreadGroup: " + priority); 
		tg1.destroy();
		System.out.println(tg1.getName()+" is destroyed");
		
		tg.destroy();  
		System.out.println(tg.getName() + " is destroyed."); 
		
//		System.out.println("The total number of active threads:"+tg.activeCount());
//		System.out.println("The total number of active thread groups are:"+tg.activeGroupCount());
	}
}
