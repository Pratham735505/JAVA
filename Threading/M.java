import java.util.*;

class X extends Thread{

	@Override
	public void run(){
try{
		for(int i=1;i<=10;i++){
			System.out.println("2*"+i+"="+(2*i));
			Thread.sleep(2000);
		}
		}catch(Exception E){
			System.out.println(E);
		}

	}




}


class Y extends Thread{

	@Override
	public void run(){
		try{
		for(int i=1;i<=10;i++){
			System.out.println("3*"+i+"="+(3*i));
			Thread.sleep(1000);
		}
		}catch(Exception E){
			System.out.println(E);
		}

	}




}




class M{

	public static void main(String[] args){
		X obj=new X();
		Y obj1=new Y();
		obj.start();
		try{

			obj.join();
		}		
		catch(Exception E){
			System.out.println(E);
		}
		obj1.start();


	}




}