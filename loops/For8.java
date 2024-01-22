import java.io.*;
class For8{
    public static void main(String args[])
    throws IOException{
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int i=0,s=0;
        System.out.println("The even number between 100 and 1 are:");
        for(i=1;i<=100;i++){
            if (i%2==0){
                System.out.println(i);
            }
        }
    }
}