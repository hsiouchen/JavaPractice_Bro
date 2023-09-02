import java.util.Calendar;
import java.util.Timer;
import java.util.TimerTask;

public class Main {
	
	// Timer = 		A facility for threads to schedule tasks
	//				for future execution in a background thread
	
	// TimerTask = 	A task that can be scheduled for one-time
	//				or repeated execution by a Timer

	public static void main(String[] args) {

		Timer timer = new Timer();
		
		// Happy New Year 2024
		TimerTask task = new TimerTask() {

			int counter = 10;
			@Override
			public void run() {
				//System.out.println("Task is complete :)");
				if(counter >0) {
					System.out.println(counter + " seconds.");
					counter--;
				}
				else {
					System.out.println("Happy New Year!");
					timer.cancel();
				}				
			}
			
		};
		//timer.schedule(task, 1000);
		
		Calendar date = Calendar.getInstance();
		date.set(Calendar.YEAR, 2023);
		date.set(Calendar.MONTH, Calendar.DECEMBER);
		date.set(Calendar.DAY_OF_MONTH, 31);
		date.set(Calendar.HOUR_OF_DAY, 23);
		date.set(Calendar.MINUTE, 59);
		date.set(Calendar.SECOND, 50);
		date.set(Calendar.MILLISECOND, 0);
		
		//timer.schedule(task, date.getTime());
		
		timer.scheduleAtFixedRate(task, date.getTime(), 1000);  // delay 0 sec. and repeat 1000 minsec.
		
	}

}
