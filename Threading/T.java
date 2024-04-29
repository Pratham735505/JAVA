import java.util.*;

class X extends Thread{
	Scanner sc=new Scanner(System.in);
	@Override
	public void run(){
try{
		System.out.println("Enter start and end:");
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++){	
				int num=i;
				int originalNum, remainder, result = 0, n = 0;
        			originalNum = num;

        // Count number of digits
       				 while (originalNum != 0) {
            				originalNum /= 10;
            				++n;
        			}

			        originalNum = num;

        // Calculate Armstrong value
		        while (originalNum != 0) {
		            remainder = originalNum % 10;
		            result += Math.pow(remainder, n);
		            originalNum /= 10;
		        }

		        if(result == num){
			System.out.println("Armstrong "+i);
			}
			Thread.sleep(2000);
		}
		}catch(Exception E){
			System.out.println(E);
		}
	}
}


class Y extends Thread{
	Scanner sc=new Scanner(System.in);
	@Override
	public void run(){
		try{
		System.out.println("Enter start and end:");
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++){
			int num=i,f=0;
			if (num <= 1) {
				f=1;
      		 	}
	        	for (int j = 2; j <= Math.sqrt(num); i++) {
         	   		if (num % j == 0) {
				f=1;
                		break;
            	    		}
        		}
			if(f==0)
        		System.out.println("Prime "+i);
			Thread.sleep(1000);
		}
		}catch(Exception E){
			System.out.println(E);
		}
	}
}

class Z extends Thread{
	Scanner sc=new Scanner(System.in);
	@Override
	public void run(){
		try{
		System.out.println("Enter start and end:");
		int start=sc.nextInt();
		int end=sc.nextInt();
		for(int i=start;i<=end;i++){
			int num=i;
			int reversedNum = 0, remainder, originalNum;
   			originalNum = i;

        		while (num != 0) {
           			remainder = num % 10;
		            	reversedNum = reversedNum * 10 + remainder;
				num /= 10;
        		}

        		if (originalNum == reversedNum){
				System.out.println("Palindrome is:"+originalNum);
			}
			Thread.sleep(1000);
		}
		}catch(Exception E){
			System.out.println(E);
		}
	}
}




class T{

	public static void main(String[] args){
		X obj=new X();
		Y obj1=new Y();
		Z obj2= new Z();
		obj.start();
		obj1.start();
		obj2.start();
	}
}