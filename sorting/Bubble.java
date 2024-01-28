import java.io.*;
import java.util.*;

public class Bubble {
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
       
	for(int i=0;i<n;i++){
		for (int j=0;j<n-1;j++){
			if(arr[j]>arr[j+1]){
				int temp;
				temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
			}
		}
        }
	System.out.println("Sorted Array is:");
	for(int i=0;i<n;i++){
	System.out.println(arr[i]);		
	}
    }
}
