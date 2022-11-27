import java.util.Scanner;
//this is question forty one

public class RepeatPositive {
    public static void main(String[] args) {
        int a;
        do
        {
        System.out.println("Enter any integer");
        Scanner pos=new Scanner(System.in);
        a=pos.nextInt();
        System.out.println("Positive number");
        }
        while(a>0);
        System.out.println("Negative number");
    }
}
