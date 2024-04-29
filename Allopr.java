import java.io.*;
import java.util.*;

class Number{
  boolean primechecker(int n){ // This functions checks whether a number is prime or not returns bool value; 
    int a=n-1;
    while(a>1){
	if(n%a==0){
	  return false;
	}
    }
    return true;

  }
  //--------------------------------------------------
  int factcalc(int n){// this method takes integer and returns factorial of number using recursion, if number is less than 0, the n it will return -1;
	if (n<0){
		return -1;
	}
	else if(n==0 || n==1){
		return 1;
	}
	else{
		return n*factcalc(n-1);
	}

  }//end of method
  //---------------------------------------------------------------------------

  boolean palindrome(int n){// this method takes a number and checks whether it is palindorme or not;
    int s=0,a=n;
    while(a>0){
	s=s*10+a%10;
	a=a/10;
    }

    if(s==n){
	return true;
    }
    else{
	return false;
    }

  }//end of method


//----------------------------------------------------------------------------------------

  int gcd(int m,int n){//this method take input of two number and returns gcd 0f the number;

    int div=m,q=n;
    int rem=div%q;
    while(rem!=0){
	div=q;
	q=rem;
	rem=div%q;
    }
    return q;

  }// end of gcd method

}// End of number class


//-----------------------------------------------------------------------------------------

class Strings{
	String cipher(String s){//takes string and returns cipher text
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str = "";
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if( c>='a' && c<='z') {
				c=(char)(c + n);
				if(c>'z'){
					c=(char)(c-'z'+'a');
				}
			}
			else if( c>='A' && c<='Z'){
				c=(char)(c + n);
				if(c>'Z'){
					c=(char)(c-'Z'+'A');
				}

			}
			str=str+c;
			

		}


		return str;
	}// end of cipher


//----------------------------------------------------------------------------------------------


	String decipher(String s){//takes string and returns decipher text
		System.out.println("Enter the number:");
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		String str = "";
		for(int i=0;i<s.length();i++){
			char c=s.charAt(i);
			if( c>='a' && c<='z') {
				c=(char)(c - n);
				if(c<'a'){
					c=(char)(-'a'+c+'z');
				}
			}
			else if( c>='A' && c<='Z'){
				c=(char)(c - n);
				if(c<'A'){
					c=(char)(c-'A'+'Z');
				}

			}
			str=str+c;
			

		}


		return str;
	}// end of decipher



}//End of string method class


//------------------------------------------------------------------------------


class Arrayd{

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





}//End of array methods class 



//--------------------------------------------------------------------------------------


class Allopr{

  public static void main(String args[]) throws IOException{
	int choice;
	Scanner sc=new Scanner(System.in);
	do{
	  System.out.print("Which kind of method do you want to use:\n1.Number\n2.String\n3.Array\n4.Exit\nEnter choice:");
	  choice=sc.nextInt();
	  switch(choice){
	    case 1:
	      int c;
	      do{
		System.out.println("Number methods/n1.Checking prime number\n2.Factorial\n3.Palindrome checker\n4.GCD\n5.Return\nEnter choice:");
		c=sc.nextInt();
		Number N=new Number();
		switch(c){
		  case 1:
			int n1;
			System.out.println("Enter the number:");
			n1=sc.nextInt();
		        if(N.primechecker(n1)){
			  System.out.println("Prime");
			}
			else{
			  System.out.println("Not prime");
			}
			break;
		  case 2:
			int n2;
			System.out.println("Enter the number:");
			n2=sc.nextInt();
			System.out.println("The Factorial of "+n2+" is:"+N.factcalc(n2));
			break;

		  case 3:
			int n3;
			System.out.println("Enter the number:");
			n3=sc.nextInt();
			if (N.palindrome(n3)){
				System.out.println("Palindrome");
			}
			else{
				System.out.println("Not palindrome");
			}
			break;

		  case 4:
			int n4,m;
			System.out.println("Enter the numbers 1st greater then 2nd smaller:");
			n4=sc.nextInt();
			m=sc.nextInt();
			System.out.println("The gcd of numbers is:"+ N.gcd(n4,m));
			break;
		  case 5:
			break;
		  default:
			System.out.println("Invalid choice");
		}
	  }while (c!=5);//end of loop
		break;
	    case 2:
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		int a[]=new int[10];
		for (int i=0;i<10;i++){
			System.out.print("Enter element "+(i+1)+": ");			
			a[i]=Integer.parseInt(br.readLine());
			System.out.println();
		}
		Arrayd obj= new Arrayd();
		while (true){
			int c1;
			System.out.println("Enter 1 for sum of each element:");
			System.out.println("Enter 2 for sum of even and odd element:");
			System.out.println("Enter 3 for sum of positive and negative element:");
			System.out.println("Enter 4 for count even and odd element:");
			System.out.println("Enter 5 for counting positive and negative element:");
			System.out.println("Enter 6 for counting 2 and 3 digit element:");
			System.out.println("Enter 7 displaying array:");
			System.out.println("Enter 8 to break:");
			c1=Integer.parseInt(br.readLine());
			switch(c1){
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
			if (c1==8){
				break;
			}
		}
		break;
	    case 3: // for string
		int c2;
		do{
		  System.out.println("Enter 1 for cipher\n2 for devipher\n3 for return\nEnter choice:");
		  c2=sc.nextInt();
		  Strings s=new Strings();
		  switch(c2){
			case 1:
				System.out.println("Enter String:");
				String str=sc.next();
				System.out.println("The ciphered text is:"+s.cipher(str));
				break;

			case 2:
				System.out.println("Enter String:");
				String str1=sc.next();
				System.out.println("The ciphered text is:"+s.decipher(str1));
				break;

			case 3:
				break;

			default:

				System.out.println("Invalid choice");

		  }


		}while (c2!=3);

		break;
	    case 4:
		System.out.println("Ending the program");
		break;
	    default:
		System.out.println("Invalid cHoice");


	  }
	
	}while(choice!=4);
        




  }

}// End of main class;