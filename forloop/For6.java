import java.io.*;
class For6{
    public static void main(String args[])
    throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i=0,j;
        System.out.println("Enter a number:");
        int n=Integer.parseInt(br.readLine());
        for(i=0;i<n;i++){
            for(j=0;j<i;j++){
                System.out.print("*");
            }
           System.out.println(""); 
        }

    }
}