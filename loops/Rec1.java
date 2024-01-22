import java.io.*;
import java.util.*;

class Rec1{
     
	public static void main(String args[]) throws IOException{
	   Scanner sc=new Scanner(System.in);
	   System.out.print("Enter number:");
	   int n= sc.nextInt();
	   Rec(n,1);
           low(n,1);
	}
static void Rec(int n,int i){
		if (n>=i){
		for(int j=n-i;j>=0;j--){
			System.out.print(" ");
		}
		for(int j=1;j<=i;j++){
			System.out.print(j);
		}
//-----------------------2nd quad
                for(int j=i-1;j>0;j--){
			System.out.print(j);
		}
		System.out.println();
	   Rec(n,++i);
         }
		else
		return;
	}

}

static void low(int n,int i){
	if(n>=i){
		for(int j=0;j<=i;j++){
			System.out.print(" ");
		}
		for(int j=1;j<=n-i;j++){
			System.out.print(j);
		}
//-----------------------2nd quad----------------------------------
                for(int j=n-1-i;j>0;j--){
			System.out.print(j);
		}
		System.out.println();
		low(n,++i);
        }
	

}