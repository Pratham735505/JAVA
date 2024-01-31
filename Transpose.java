import java.io.*;
import java.util.*;

class Trans{

	int a[][]=new int[100][100];
	int x,y,i,j;

	public Trans(){
		for(i=0;i<100;i++){
			for(j=0;j<100;j++){
				a[i][j]=0;
			}
		}
	}

	public Trans(int m,int n){

		x=m;
		y=n;
		a=new int[x][y];

	}

	public void input(){
		Scanner sc=new Scanner(System.in);
		for(i=0;i<x;i++){
			for(j=0;j<y;j++){
				a[i][j]=sc.nextInt();
			}
		}

	}

	public void show(Trans T){
		for(i=0;i<T.x;i++){

			for(j=0;j<T.y;j++){
				a[i][j]=T.a[j][i];

			}

		}

		for(i=0;i<T.x;i++){

			for(j=0;j<T.y;j++){
				System.out.print(a[i][j]);
	

			}
			System.out.println();

		}
	}

}


class Transpose{

	public static void main(String args[]) throws IOException{
		Trans P=new Trans();
		Trans Q=new Trans(3,3);
		Q.input();
		P.show(Q);
	}

}