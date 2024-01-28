import java.io.*;
import java.util.*;

class Pattern3{
	public static void main(String args[]) throws IOException{
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter number:");
	   int n= sc.nextInt();
	   for(int i=1;i<=n;i++){
//-----------------------------1st quadrant
		for(int j=1;j<=n-i+1;j++){
			
			if(j==n-i+1)
			System.out.print("1");
			else
			System.out.print(" ");
		}
		for(int j=1;j<i;j++){
			System.out.print(" ");
		}
//-----------------------2nd quad
                for(int j=1;j<i;j++){
			System.out.print(" ");
			if(j==i-1)
			System.out.print("1");
		}
		System.out.println();
	   }
//-------------------------------------loop for inverted triangle----------------------
		

	  for(int i=2;i<=n;i++){
//-----------------------------1st quadrant-----------------------------------
		for(int j=2;j<=i;j++){
			System.out.print(" ");
			if(j==i)
			System.out.print("1");
			
		}
		for(int j=1;j<=n-i;j++)
			System.out.print(" ");
		for(int j=1;j<=n-i;j++){
			System.out.print(" ");
			if(j==n-i){
			System.out.print("1");
			}
		}
		System.out.println();
	   }
	}

}