import java.io.*;
import java.util.*;
class JavaDestroyExp extends Thread
{
	JavaDestroyExp(String threadname, ThreadGroup tg)
	{
		super(tg, threadname);// inherited parameterised constructor
		start();
	}
	public void run()
	{
		for (int i = 0; i < 2; i++)
	{
		try
		{
			Thread.sleep(10);
		}
		catch (InterruptedException ex) {
			System.out.println("Exception encounterted");}
			}
		System.out.println(Thread.currentThread().getName() +" finished executing");
	}
}
class CurrentThreadExp extends Thread   
{     
    public void run()   
    {    try{
	for(int i=0;i<10;i++){
		System.out.println(i+" "+Thread.currentThread().getName());
		if(Thread.currentThread().isDaemon()){

			System.out.println("daemon thread");
		}
		Thread.sleep(2000);


	}
	}catch(Exception e){
		System.out.println(e);
	}
	System.out.println("Priority of first run="+Thread.currentThread().getPriority());
        System.out.println(Thread.currentThread().getName()); 
        System.out.println(Thread.currentThread());
    	System.out.println(Thread.currentThread().isAlive());
    }
}

class Functions{
    public static void main(String[] args)throws IOException, InterruptedException, IllegalThreadStateException{
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int choice;
        CurrentThreadExp t1=new CurrentThreadExp();
        CurrentThreadExp t2=new CurrentThreadExp();
        do{
            System.out.println("1. public void start()");
            System.out.println("2. public void run()");
            System.out.println("3. public static void sleep()");
            System.out.println("4. public static Thread currentThread()");
            System.out.println("5. public void join()");
            System.out.println("6. public final int getPriority()");
            System.out.println("7. public final void setPriority()");
            System.out.println("8. public final String getName()");
            System.out.println("9. public final void setName()");
            System.out.println("10. public long getId()");
            System.out.println("11. public final boolean isAlive()");
            System.out.println("12. public static void yield()");
            System.out.println("13. public final void suspend()");
            System.out.println("14. public final void resume()");
            System.out.println("15. public final void stop()");
            System.out.println("16. public void destroy()");
            System.out.println("17. public final boolean isDaemon()");
            System.out.println("18. public final void setDaemon(boolean on)");
            System.out.println("19. public void interrupt()");
            System.out.println("20. public boolean isInterrupted()");
            System.out.println("21. public static boolean interrupted()");
            System.out.println("22. public static int activeCount()");
            System.out.println("23. public final void checkAccess()");
            System.out.println("24. public static boolean holdsLock(Object obj)");
            choice = Integer.parseInt(br.readLine());
            switch(choice){
                case 1:
                t1.start(); //calls automatic overridden run function
                t2.start();
                break;
                case 2:
                break;
                case 3:
                t1.start();
                Thread.currentThread().sleep(2872);
                t2.start();
                break;
                case 4:
                System.out.println(Thread.currentThread());
                break;
                case 5:
                t1.start();
                try{
                    t1.join();
                }catch(Exception e){
                    System.out.println(e);
                }
                t2.start();
                break;
                case 6:
                System.out.println(t1.getPriority());
                System.out.println(t2.getPriority());
                t1.start();
                t2.start();
                break;
                case 7:
                t2.setPriority(2);
                t1.setPriority(10);
                t2.start();
                t1.start();

                break;
                case 8:
                System.out.println(t1.getName());
                System.out.println(t2.getName());
                break;
                case 9:
                t1.setName("hehe1");
                t2.setName("hehe2");
                System.out.println(t1.getName());
                System.out.println(t2.getName());
                break;
                case 10:
                t1.getId();
                t2.getId();
                break;
                case 11:
                System.out.println("before starting thread isAlive: "+t1.isAlive());
                t1.start();
                System.out.println("after starting thread isAlive: "+t1.isAlive());
                break;
                case 12:
                t1.start();
		t1.yield();// stops current thread and starts new thread temporarily;
                t2.start();
                for (int i=0; i<3; i++)
                    {   
                    
                    System.out.println(Thread.currentThread().getName() + " in control");
                    }
                break;
                case 13:
                t1.start();
                t1.suspend();
                t2.start();
                
                break;
                case 14:
		CurrentThreadExp t4=new CurrentThreadExp();
                t1.start();
                t2.start();
                t2.suspend();
                t4.start();
        //        t2.resume();
                break;
                case 15:
                CurrentThreadExp t3=new CurrentThreadExp();
                t1.start();
                t2.start();
                t3.stop();
                System.out.println("Thread thread3 is stopped");
                break;
                case 16:
                ThreadGroup g1 = new ThreadGroup("Parent thread");
                ThreadGroup g2 = new ThreadGroup(g1, "child thread");
                JavaDestroyExp thread1 = new JavaDestroyExp("Thread-1", g1);
                JavaDestroyExp thread2 = new JavaDestroyExp("Thread-2", g1);
                thread1.join();
                thread2.join();
                g2.destroy();
                System.out.println(g2.getName() + " destroyed");
                g1.destroy();
                System.out.println(g1.getName() + " destroyed");
                break;
                case 17:

		t1.start();
		t2.setDaemon(true);
		t2.start();
                break;
                case 18:
                break;
                case 19:
                break;
                case 20:
                break;
                case 21:
                break;
                case 22:
                break;
                case 23:
                break;
                case 24:
                break;
                case 25:
                System.out.println("Exiting ");
                break;
                default:
                System.out.println("Invalid CHoice");
            }
        }while(choice!=10);
    }
}
