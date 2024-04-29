import java.io.*;
import java.util.*;
class CurrentThreadExp extends Thread   
{     
    public void run()   
    {    try{
	for(int i=0;i<10;i++){
		System.out.println(i);
		Thread.sleep(2000);


	}
	}catch(Exception e){
		System.out.println();
	}
	System.out.println("Priority of first run="+Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName()); 
    	System.out.println(Thread.currentThread().isAlive());
    }
}

class Methods{
	public static void main(String args[]){
		
		

	//public static Thread currentThread()

		CurrentThreadExp thread1=new CurrentThreadExp();     
	        CurrentThreadExp thread2=new CurrentThreadExp(); 
System.out.println("Name of thread1: "+thread1.getName());   
        System.out.println("Id of thread1: "+thread1.getId());   
thread1.setName("hehe");    
System.out.println("Priority of first run="+thread1.getPriority());
 thread1.setPriority(5); 
System.out.println(thread1.isAlive()); 
        	thread1.start();
 thread1.setPriority(1);
		try{

			thread1.join();
		}catch(Exception e){
		System.out.println();
		}
System.out.println(thread1.isAlive());
System.out.println(thread2.isAlive());
System.out.println("Priority of first run="+thread2.getPriority());
 thread2.setPriority(Thread.MAX_PRIORITY);
     thread2.setName("hehe2");
System.out.println("Name of thread2: "+thread2.getName());   
        System.out.println("Id of thread2: "+thread2.getId());   
	        thread2.start();   
	 thread2.setPriority(5);	
System.out.println(thread2.isAlive());
	}

}