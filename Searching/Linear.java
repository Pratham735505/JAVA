import java.io.*;
import java.util.*;

public class Linear{
    public static void main(String args[]) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of elements in array:");
        int n = sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
		System.out.print("Enter element "+(i+1)+":");
		arr[i]=sc.nextInt();
		System.out.println();
	}
       
	while(true){
		System.out.print("Enter which element you want to find:");
		int x=sc.nextInt(),f=0;
		for(int i=0;i<n;i++){
			if(x==arr[i]){
				System.out.println("Element found at index "+i);
				f=1;
			}
		}
		if (f==0){
			System.out.println("Element not found");
		}
		System.out.print("Press any key to continue, 1 for break:");
		char y=sc.next().charAt(0);
		if(y=='1'){
		break;
		}
	}
    }
}
