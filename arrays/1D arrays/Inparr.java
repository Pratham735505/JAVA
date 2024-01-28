import java.io.*;
import java.util.*;

class Inparr{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        	int n = Integer.parseInt(br.readLine());
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = Integer.parseInt(br.readLine());
		}
		for (int i = 0; i < n; i++) {
			System.out.print(a[i]);
		}
		System.out.println("Enter rows in matrix> ");
		int x = Integer.parseInt(br.readLine());
		System.out.println("Enter columns in matrix> ");
		int y = Integer.parseInt(br.readLine());
		int arr[][] = new int[x][y];
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print("Enter the element at row " + i + " column " + j + " >");
				arr[i][j] = Integer.parseInt(br.readLine());
				System.out.println();
			}
		}

		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				System.out.print("Element at row " + i + " column " + j + " >");
				System.out.println(arr[i][j]);
			}
		}
		
	}//End of main
}//End of class