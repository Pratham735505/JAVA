import java.io.*;
import java.util.*;

class NPGC{
	static protected int contact;
	static Scanner sc=new Scanner(System.in);
	static protected String name=new String();
	static protected String dob=new String();
	static protected String city=new String();
	static protected String school=new String();  
	public void input(){
		System.out.println("Enter name:");
		this.name=sc.next();
		System.out.println("Enter dob:");
		this.dob=sc.next();
		System.out.println("Enter city:");
		this.city=sc.next();
		System.out.println("Enter school:");
		this.school=sc.next();
		System.out.println("Enter contact:");
		this.contact=sc.nextInt();

	}

//------------------------------------------------------------------------------------

}//end of class

//-----------------------------------------------------------------------------------------
class BCA extends NPGC{
	static String subject=new String();
	static int sem;
	static int stuid;
	static int cgpa;
	static Scanner sc=new Scanner(System.in);
	public void input(){
		super.input();
		System.out.println("Enter Subjects:");
		subject=sc.next();
		System.out.println("Enter id:");
		stuid =sc.nextInt();
		System.out.println("Enter cgpa:");
		cgpa=sc.nextInt();
	}

	public void display(){
		System.out.println(super.name+"\n"+super.dob+"\n"+super.city+"\n"+super.school+"\n"+sem+"\n"+stuid+"\n"+cgpa+"\n"+subject);
	}
}//end of class
//-----------------------------------------------------------------------------------------
class BBA extends NPGC{
static String subject=new String();
	static int sem;
	static int stuid;
	static int cgpa;
	static Scanner sc=new Scanner(System.in);
	public void input(){
		super.input();
		System.out.println("Enter Subjects:");
		subject=sc.next();
		System.out.println("Enter id:");
		stuid =sc.nextInt();
		System.out.println("Enter cgpa:");
		cgpa=sc.nextInt();
	}

	public void display(){
		System.out.println(super.name+"\n"+super.dob+"\n"+super.city+"\n"+super.school+"\n"+sem+"\n"+stuid+"\n"+cgpa+"\n"+subject);}

}//end of class

//-----------------------------------------------------------------------------------------
class BCom extends NPGC{
static String subject=new String();
	static int sem;
	static int stuid;
	static int cgpa;
	static Scanner sc=new Scanner(System.in);
	public void input(){
		super.input();
		System.out.println("Enter name:");
		super.name=sc.next();
		System.out.println("Enter dob:");
		super.dob=sc.next();
		System.out.println("Enter city:");
		super.city=sc.next();
		System.out.println("Enter school:");
		super.school=sc.next();
		System.out.println("Enter contact:");
		super.contact=sc.nextInt();
		System.out.println("Enter Subjects:");
		subject=sc.next();
		System.out.println("Enter id:");
		stuid =sc.nextInt();
		System.out.println("Enter cgpa:");
		cgpa=sc.nextInt();
	}

	public void display(){
		System.out.println(super.name+"\n"+super.dob+"\n"+super.city+"\n"+super.school+"\n"+sem+"\n"+stuid+"\n"+cgpa+"\n"+subject);
       }
}//end of class


//-----------------------------------------------------------------------------------------
class Info{
    public static void main(String args[]) {
	BCA obj[]=new BCA[2];
	for(int i=0;i<2;i++){
		obj[i]=new BCA();
		obj[i].input();
	}
	for(int i=0;i<2;i++){
		obj[i].display();
	}

	
    }
}

