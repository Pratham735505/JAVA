import java.io.*;
import java.util.*;

class Inparr{
	public static void main(String args[]) throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        	System.out.print("Enter the number of cities> ");
		int n=Integer.parseInt(br.readLine());
		int min[]=new int[n];
		int max[]=new int[n];		
		String city[]=new String[n];
		
		for(int i=0;i<n;i++){
			System.out.print("Enter the name of city");
			city[i]=br.readLine();
			System.out.println();
		}

		for(int i=0;i<n;i++){
			System.out.print();
			city[i]=br.readLine();
			System.out.println();
		}
		
			
	}//End of main
}//End of class