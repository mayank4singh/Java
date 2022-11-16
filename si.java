import java.util.Scanner;

public class si {
    public static void main(String[] args) {
        //this is question nineteen
        Scanner sc=new Scanner(System.in);
        System.out.println("enter principal amount");
        int p=sc.nextInt();
        Scanner op=new Scanner(System.in);
        System.out.println("enter rate");
        double r=op.nextDouble();
        Scanner kj=new Scanner(System.in);
        System.out.println("enter time");
        double t=kj.nextDouble();
        double SI=p*r*t / 100;
        System.out.println("Simple intrest is "+SI);


    }
    
}
