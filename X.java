import java.io.*;
import java.util.*;

class Time{
	int h,m,s;
	public Time(){
		h=0;
		m=0;
		s=0;
	}
	public Time(int x,int y,int z){

		h=x;
		m=y;
		s=z;
	}

	public void sum(Time t1,Time t2){
		int hr=0,mi=0,se=0,rs,rm;

		se=t1.s + t2.s;
		rs=se/60;
		se=se%60;


		mi=t1.m + t2.m+rs;
		rm=mi/60;
		mi=mi%60;

		hr=t1.h + t2.h+rm;
		System.out.println(hr+" "+mi+" "+se);		

	}

}


class X{
	public static void main(String args[]) throws IOException{


		Time one=new Time(10,20,30);
		Time two=new Time(40,50,60);
		Time three= new Time();
		three.sum(one,two);
	}


}