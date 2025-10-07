package Multithreading1;

class ThreadNew extends Thread{
	ThreadNew(String tName, ThreadGroup tgrp){
		super(tgrp, tName);
		start();
	}
	public void run() {
		for(int j=0;j<100;j++) {
			try {
				Thread.sleep(5);
			}catch(Exception e) {
				System.out.println("The exception has been encountered " + e);
			}
		}
		System.out.println(Thread.currentThread().getName()+" thread has finished execution.");
	}
}
public class Pro12 {
	public static void main(String[] args) {
		ThreadGroup tg=new ThreadGroup("The parent group thread.");
		ThreadGroup tg1 = new ThreadGroup(tg, "the child group");
		ThreadNew th1=new ThreadNew("first", tg);
		System.out.println("Starting the first");
		ThreadNew th2 = new ThreadNew("second", tg);  
		System.out.println("Starting the second");
		 
		// checking the number of active thread by invoking the activeCount() method  
		System.out.println("The total number of active threads are: " + tg.activeCount());
		System.out.println("The total number of active thread groups are: " + tg.activeGroupCount());
		int priority = tg.getMaxPriority();  
		  
		System.out.println("The maximum priority of the parent ThreadGroup: " + priority); 
		// printing the parent ThreadGroup   
		// of both child and parent threads  
		System.out.println("The ParentThreadGroup for " + tg.getName() + " is " + tg.getParent().getName());  
		System.out.println("The ParentThreadGroup for " + tg1.getName() + " is " + tg1.getParent().getName());
	}
}
