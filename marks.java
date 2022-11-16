import java.util.Scanner;

public class marks {
    public static void main(String[] args) {
        //this is question twenty two
        Scanner sc=new Scanner(System.in);
        System.out.println("enter marks of first subject: ");
        int a=sc.nextInt();
        System.out.println("enter marks of second subject: ");
        int b=sc.nextInt();
        System.out.println("enter marks of third subject: ");
        int c=sc.nextInt();
        int avg=(a+b+c)/3;
        if(avg>=33)
        {
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }

    }
}
