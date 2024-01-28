import java.io.*;
import java.util.*;

class Inp2{
	static int a[]=new int[50],n;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	public static void main(String args[]) throws IOException
	{
		int choice;
		do {
		System.out.print("Enter how many elements you want to enter(less than 50):");
		n = Integer.parseInt(br.readLine());
		}while(n>=50);
		for (int i=0;i<50;i++){
			if(i<n){
	
				System.out.print("Enter element "+(i+1)+":");	
				a[i]=Integer.parseInt(br.readLine());
				System.out.println();

			}
			else{
				a[i]=Integer.MIN_VALUE;
			}
		}
		Inp2 obj= new Inp2();
		do{
			System.out.println("Enter 1 for inserting an element to a particular position:");
			System.out.println("Enter 2 deleting an element from a particular position:");
			System.out.println("Enter 3 for finding subset:");
			System.out.println("Enter 4 for appending an element:");
			System.out.println("Enter 5 Extend():");
			System.out.println("Enter 6 for remove():");
			System.out.println("Enter 7 displaying array:");
			System.out.println("Enter 8 to end:");
			choice=Integer.parseInt(br.readLine());
			switch(choice){
				case 1:
					if(n<50){
						int c;
						do{
							System.out.print("Enter at which position do you want to insert an element(less than "+(n-1)+"):");
							c= Integer.parseInt(br.readLine());
						}while(c>n || c<=0);
						System.out.print("Enter the element you want to insert:");
						int e=Integer.parseInt(br.readLine());
						obj.insert(c,e);
					}
					else{
						System.out.println("List is full");
					}
					break;
				case 2:
					int c;
					do{
						System.out.print("Enter which position of element do you want to delete(less than "+(n-1)+"):");
						c= Integer.parseInt(br.readLine());
					}while(c>n || c<=0);
					obj.delete(c);
					break;
				case 3:
					int e=obj.subset();
					if (e==-1){
						System.out.println("Not found");
					}
					else{
						System.out.println("Found at index "+e);
					}
					break;
				case 4:
					System.out.println("Enter the element which you want to append:");
					
					a[n]=Integer.parseInt(br.readLine());
					n++;
					obj.display();
					break;
				case 5:
					System.out.print("Enter the size of array:");
					int s=Integer.parseInt(br.readLine());
					int sub[]=new int[s];
					for (int i=0;i<s;i++){
						System.out.println("Enter element of array"+(i+1)+" : ");
						sub[i]=Integer.parseInt(br.readLine());
					}
					obj.extend(sub,s);
					obj.display();
					break;
				case 6:
					System.out.println("Enter the element you want to remove:");
					int f=Integer.parseInt(br.readLine());
					obj.remove(f);
					obj.display();

					break;
				case 7: 
					obj.display();
					break;
				case 8:
					break;
				default:
					System.out.println("Invalid Choice");
			}
		}while(choice!=8);

	}// End of main

//------------------------------------------------------------------------------------------
	void display(){
		System.out.println("The elements of array are:");
		for (int i=0;i<n;i++){
			System.out.println(a[i]);
		}
	}// end of display()
	
//---------------------------------------------------
	void insert(int c,int e) {
		
//--------------------------------
		int temp;
		temp=a[c];
		a[c]=e;
		int temp2;		
		for(int i=c+1;i<=n;i++){
			temp2=a[i];
			a[i]=temp;
			temp=temp2;
		}
		n++;
		Inp2 obj= new Inp2();
		obj.display();
	}// end of insert
//--------------------------------------------------------------------------------------
	void delete(int c){
		
		for(int i=c;i<n;i++){
			a[i]=a[i+1];
		}
		n--;
		Inp2 obj= new Inp2();
		obj.display();


		
	}//end of delete

//--------------------------------------------------------------------------------------


	int subset() throws IOException{
		System.out.print("Enter the size of subarray:");
		int s=Integer.parseInt(br.readLine());
		int sub[]=new int[s];
		if (s>n){
			return -1;
		}
		for (int i=0;i<s;i++){
			System.out.println("Enter element of sub array"+(i+1)+": ");
			sub[i]=Integer.parseInt(br.readLine());
		}
		int d,f=1,temp;
		for(int i=0;i<n;i++){
			d=i;
			temp=d;
			for(int j=0;j<s;j++){
				if(a[d]==sub[j] &&d<n){
					d++;
					f=1;
					if (j==s-1){
						return temp;
					}
				}
				else{
					f=0;
					break;
				}
			}
		}
		return -1;

	}//end of subset
//-----------------------------------------------------
	void extend(int sub[],int s){
		int d=0;
		for(int i=n;i<n+s;i++){
			a[i]=sub[d++];
			
		}
		n=n+s;
	}//end of extend()
//---------------------------------------------------------------------------

	void remove(int e){
		int f=0;
		for (int i=0;i<n;i++){
			if(f==1){
				a[i]=a[i+1];
			}

			else if(a[i]==e){
				f=1;
				a[i]=a[i+1];
			}
		}
		if(f==0){
			System.out.println("Element not found");
		}
		else{
		n--;
		}
	}//end of remove()
}//end of class
