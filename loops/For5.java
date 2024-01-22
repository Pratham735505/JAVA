import java.io.*;
class For5{
    public static void main(String args[])
    throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i=0,s=0;
        System.out.println("Enter a number:");
        int n=Integer.parseInt(br.readLine());
        for(i=n;i>0;i--){
            if(n%i==0){
                s++;
            }
        }
        if (s==2){
        System.out.println(n+" is prime");
        }
        else{
            System.out.println(n+" is not prime");
        }
    }
}