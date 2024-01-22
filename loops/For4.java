import java.io.*;
class For4{
    public static void main(String args[])
    throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i=0,s=0;
        System.out.println("Enter a number:");
        int n=Integer.parseInt(br.readLine());
        for(i=n;i!=0;i=i/10){
            s=s*10+(i%10);
        }

        System.out.println("Reverse of number is: "+ s);

    }
}