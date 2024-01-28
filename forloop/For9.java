import java.io.*;
class For9{
    public static void main(String args[])
    throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i=0,s=1;
        System.out.println("Enter a number:");
        int n1=Integer.parseInt(br.readLine());
        int n2=Integer.parseInt(br.readLine());
        for(i=1;i<=n2;i++){
            s=s*n1;
        }

        System.out.println(s);

    }
}