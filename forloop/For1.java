import java.io.*;
class For1{
    public static void main(String args[])
    throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i=0,s=0;
        System.out.println("Enter upto sum is needed:");
        int n=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++){
            s=s+i;
        }

        System.out.println(s);

    }
}