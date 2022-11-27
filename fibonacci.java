import java.util.Scanner;

public class fibonacci {
    //this is question forty two
    public static void main(String[] args) {
        Scanner cc=new Scanner(System.in);
        System.out.println("Enter a number");
        int a=cc.nextInt();
        int b;
        System.out.println("fibonacci series " + a + "terms");
        int i=0;
        int j=1;
        for (b=0;b<=a;++b)  { 
        int c = i+j;
        System.out.println( +c);
        i=j;
        j=c;
    }
}
}