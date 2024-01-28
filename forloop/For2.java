import java.io.*;
class For2{
    public static void main(String args[])
    throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i=0,s;
        System.out.println("Enter a positive integer:");
        int n=Integer.parseInt(br.readLine());
        System.out.println("The table of "+n+"is");
        for(i=1;i<=10;i++){
            s=i*n;
            System.out.println(n+"*"+i+"="+s);
        }

        

    }
}