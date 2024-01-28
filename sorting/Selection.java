import java.io.*;
import java.util.*;

public class Selection {
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
		for (int j=i+1;j<n;j++){
			if(arr[i]>arr[j]){
				int temp;
				temp=arr[i];
				arr[i]=arr[j];
				arr[j]=temp;
			}
		}
        }
	System.out.println("Sorted Array is:");
	for(int i=0;i<n;i++){
	System.out.println(arr[i]);		
	}
    }
}
