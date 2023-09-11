
public class Main {

	/*
 	multithreading
 	--------------	 	
 			Process of execution multiple threads simultaneously
 			Helps maximum utilization of CPU
 			Threads are independent, they don't affect the execution of other threads.
 			
 			An exception is one thread will not interrupt other threads
 			useful for serving multiple clients, multiplayer games, 
 													or other mutually independent tasks
	*/
	
	public static void main(String[] args) throws InterruptedException {
		
		// either way
		// 1). Create a subclass of Thread
		MyThread thread1 = new MyThread();
		
		// or
		
		// 2). implement Runnable interface and pass instance as an argument to Thread()
		MyRunnable runnable1 = new MyRunnable();		
		Thread thread2 = new Thread(runnable1);

		/*
		// 1. 
		thread1.start();
		thread2.start();
		// 2.
		System.out.println( 1/0 );
		*/		
		
		/*
		// 3. 
		thread1.setDaemon(true);
		thread2.setDaemon(true);
		
		thread1.start();
		thread2.start();
		
		// 3-1.
		System.out.println( 1/0 );
		*/
		
		/*
		// 4.
		thread1.start();
		thread1.join();
		thread2.start();
		*/
		
		/*
		// 5.
		thread1.start();
		
		thread1.join(3000);		// calling thread (ex.main) wait until the specified thread dies 
								// or for x millisecond
		thread2.start();
		*/
		
	}

}
