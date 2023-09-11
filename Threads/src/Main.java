
public class Main {
	
	/*
   	thread
   	------
   
		A thread of execution in a program (kind of like a virtual CPU)
   		The JVM allows an application to have multiple threads running concurrently
   			 
 		Each thread can execute parts of you code in parallel with the main thread
 		Each thread has a priority.
 			
 		Threads with higher priority are executed in preference compared to threads with a lower priority
 
  		The Java Virtual Machine continues to execute threads until either of the following occurs 
  			1. The exit method of class Runtime has been called
  			2. All user threads have died
  			
 		When a JVM starts up, there is a thread which calls the main method
 		This thread is called "main"
 	
 		Daemon thread is a low priority thread that runs in background to perform tasks such as garbage collection
 	                       ------------
 		JVM terminates itself when all user threads (non-daemon threads) finish their execution
 	
	*/

	public static void main(String[] args) throws InterruptedException {

		/*
		System.out.println(Thread.activeCount());	// 1		
		System.out.println(Thread.currentThread().getName());	// main
		
		Thread.currentThread().setName("First thread method");
		System.out.println(Thread.currentThread().getName());	// main
		
		System.out.println(Thread.currentThread().getPriority());
		System.out.println(Thread.currentThread());
		
		Thread.currentThread().setPriority(10);		// 10 high priority and 1 is the lower priority
		System.out.println(Thread.currentThread().getPriority());		
		
		System.out.println(Thread.currentThread().isAlive());
		*/
		
		/*
		for (int i = 3; i > 0; i--) {
			System.out.println(i);
			Thread.sleep(1000);
		}
		
		System.out.println("Done");
		*/
		
		/*
		MyThread mythread1 = new MyThread();
		mythread1.start();
		
		mythread1.setPriority(1);
		System.out.println(mythread1.getName());	// Thread-0
		
		System.out.println(mythread1.isAlive());	// false
		
		System.out.println();
		mythread1.setName("Mythread");
		mythread1.run();
		System.out.println(mythread1.getName());	// Mythread
		System.out.println(mythread1.isAlive());	// true
			
		System.out.println(mythread1.getPriority());
		*/	

		MyThread mythread2 = new MyThread();
		mythread2.setDaemon(true);		
		
		System.out.println(mythread2.isDaemon());	// false
		
		mythread2.start();
		/*
		System.out.println(mythread2.getName());	// Thread-1
		System.out.println(mythread2.getPriority());
		
		System.out.println();
		System.out.println(Thread.activeCount());
		
		System.out.println(mythread2.isDaemon());	// false
		*/
		
	}

}
