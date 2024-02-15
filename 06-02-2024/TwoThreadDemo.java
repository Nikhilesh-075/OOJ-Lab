class MessageThread extends Thread{
	private final String message;
    	private final long interval;
    	MessageThread(String message, long interval){
        	this.message = message;
        	this.interval = interval;
    	}
    	public void run(){
        	try{
            		while(true){
                		System.out.println(message);
                		Thread.sleep(interval);
            		}
        	}
		catch(InterruptedException e){
            		System.out.println(Thread.currentThread().getName()+" interrupted.");
        	}
    	}
}

public class TwoThreadDemo{
    	public static void main(String[] args){
        	DisplayMessageThread thread1=new DisplayMessageThread("BMS College of Engineering", 10000);
       		DisplayMessageThread thread2=new DisplayMessageThread("CSE", 2000);
        	thread1.setName("Thread 1");
        	thread2.setName("Thread 2");
        	thread1.start();
        	thread2.start();
        	try{
            		Thread.sleep(20000);
        	}
		catch(InterruptedException e){
            		System.out.println("Main thread interrupted.");
        	}
        	thread1.interrupt();
       		thread2.interrupt();
        	System.out.println("Main thread exiting.");
    	}
}