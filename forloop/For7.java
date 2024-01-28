import java.io.*;
class For7{
    public static void main(String args[])
    throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i=0,s=0;
        System.out.println("Enter upto you want to enter:");
        int n=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++){
            s=s+Integer.parseInt(br.readLine());
        }

        System.out.println("The average is: "+(s/i));

    }
}