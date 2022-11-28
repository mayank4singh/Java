import java.util.Scanner;

public class pass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter marks of first subject: ");
        int a=sc.nextInt();
        System.out.println("Enter marks of second subject: ");
        int b=sc.nextInt();
        System.out.println("Enter marks of third subject: ");
        int c=sc.nextInt();
        System.out.println("Enter total marks of subject: ");
        int d=sc.nextInt();
        double pa=a*100/d;
        double pb=b*100/d;
        double pc=c*100/d;
        double avg=(a+b+c/3);
        if(avg>=40 && a>=33 && b>=33 && c>=33){
            System.out.println("PASS");
        }
        else{
            System.out.println("FAIL ");
        }
    }
}
