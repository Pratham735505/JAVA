import java.io.*;
import java.util.*;

public class Binary{
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

//-----------------------------------------------------------------

	int low=0,high=n-1;
	int mid;
	System.out.print("Enter which element you want to find:");
	int x=sc.nextInt();
	while(low<=high){
		mid=(high+low)/2;
		if(arr[mid]==x){
			System.out.println("Element found");
			break;
		}
		else if(arr[mid]>x){
			high=mid-1;
		}
		else if(arr[mid]<x){
			low=mid+1;
		}
	}
	if(low>high){
		System.out.println("Element not found");
	}
    }
}
