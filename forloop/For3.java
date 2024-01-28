import java.io.*;
class For3{
    public static void main(String args[])
    throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i=0,s=1;
        System.out.println("Enter a number:");
        int n=Integer.parseInt(br.readLine());
        for(i=n;i>0;i--){
            s=s*i;
        }

        System.out.println("The factorial of "+n+" is "+ s);

    }
}