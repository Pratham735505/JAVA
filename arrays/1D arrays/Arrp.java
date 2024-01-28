import java.io.*;
import java.util.*;

class Arrp{
	public static void main(String args[]) throws IOException
	{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a[]=new int[10];
		for (int i=0;i<10;i++){
			System.out.print("Enter element "+(i+1)+": ");			
			a[i]=Integer.parseInt(br.readLine());
			System.out.println();
		}
		Arrp obj= new Arrp();
		while (true){
			int choice;
			System.out.println("Enter 1 for sum of each element:");
			System.out.println("Enter 2 for sum of even and odd element:");
			System.out.println("Enter 3 for sum of positive and negative element:");
			System.out.println("Enter 4 for count even and odd element:");
			System.out.println("Enter 5 for counting positive and negative element:");
			System.out.println("Enter 6 for counting 2 and 3 digit element:");
			System.out.println("Enter 7 displaying array:");
			System.out.println("Enter 8 to break:");
			choice=Integer.parseInt(br.readLine());
			switch(choice){
				case 1:
					obj.sum(a,10);
					break;
				case 2:
					obj.seo(a,10);
					break;
				case 3:
					obj.spn(a,10);
					break;
				case 4:
					obj.ceo(a,10);
					break;
				case 5:
					obj.cpn(a,10);
					break;
				case 6:
					obj.count(a,10);
					break;
				case 7:
					obj.display(a,10);
					break;
				case 8:
					break;
				default:
					System.out.println("Invalid Choice");
			}
			if (choice==8){
				break;
			}
		}//end of while

	}// End of main

	void sum(int a[],int n){
		int s=0;
		System.out.println("The sum elements of array is:");
		for (int i=0;i<n;i++){
			s=s+a[i];
		}
		System.out.println(s);
	}//end of sum


	void display(int a[],int n){
		System.out.println("The elements of array are:");
		for (int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}// end of display()


	void seo(int a[],int n){ //sum even odd
		int e=0,o=0;
		for (int i=0;i<n;i++){
			if (a[i]%2==0){
				e=e+a[i];
			}
			else{
				o=o+a[i];
			}
		}
		System.out.println("The sum of even numbers is: "+e);
		System.out.println("The sum of odd numbers is: "+o);
	}//end of seo

	void spn(int a[],int n){ //sum positive negative
		int p=0,ne=0;
		for (int i=0;i<n;i++){
			if (a[i]>=0){
				p=p+a[i];
			}
			else{
				ne=ne+a[i];
			}
		}
		System.out.println("The sum of positive numbers is: "+ p);
		System.out.println("The sum of negative numbers is: "+ ne);
	}//end of spn

	void cpn(int a[],int n){ //count positive negative
		int p=0,ne=0;
		for (int i=0;i<n;i++){
			if (a[i]>=0){
				p=p+1;
			}
			else{
				ne=ne+1;
			}
		}
		System.out.println("The number of positive numbers is: "+ p);
		System.out.println("The number of negative numbers is: "+ ne);
	}//end of cpn

	void ceo(int a[],int n){ //count even odd
		int e=0,o=0;
		for (int i=0;i<n;i++){
			if (a[i]%2==0){
				e=e+1;
			}
			else{
				o=o+1;
			}
		}
		System.out.println("The number of even numbers is: "+e);
		System.out.println("The number of odd numbers is: "+o);
	}//end of ceo

	void count(int a[],int n){ //counting two three
		int tw=0,th=0;
		for (int i=0;i<n;i++){
			int temp=a[i],c=0;
			while(temp>0){
				c++;
				temp=temp/10;
			}
			if (c==2){
				tw++;
			}
			if(c==3){
				th++;
			}
		}
		System.out.println("The number of two-digit elements are: "+tw);
		System.out.println("The number of three digit elements are: "+th);
	}//end of count


}//end of class
