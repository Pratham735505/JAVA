import java.io.*;
import java.util.*;

class Pattern2{
	public static void main(String args[]) throws IOException{
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter number:");
	   int n= sc.nextInt();
	   for(int i=1;i<=n;i++){
//-----------------------------Upper half
		for(int j=1;j<=n-i+1;j++){
			System.out.print(j);
		}
		for(int j=1;j<i;j++){
			System.out.print(" ");
		}
		for(int j=1;j<i;j++){
			System.out.print(" ");
		}
		
                for(int j=n-i+1;j>0;j--){
			System.out.print(j);
		}
		System.out.println();
	   }
//-------------------------------------loop for inverted triangle----------------------
		

	  for(int i=2;i<=n;i++){
//-----------------------------1st quadrant-----------------------------------

		for(int j=1;j<=i;j++){
			System.out.print(j);
		}
		for(int j=n-i;j>0;j--){
			System.out.print(" ");
		}
//-----------------------2nd quad----------------------------------
                for(int j=1;j<=n-i;j++){
			System.out.print(" ");
		}
		for(int j=i;j>0;j--){
			System.out.print(j);
		}	
		System.out.println();
	   }
	}

}