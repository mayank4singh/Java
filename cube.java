import java.util.Scanner;

public class cube {
    public static void main(String[] args) {
        //this is question twenty four
        Scanner dd=new Scanner(System.in);
        System.out.println("enter an integer: ");
        int a=dd.nextInt();
        if(a<5)
        {
            int cube=a*a*a;
            System.out.println("Cube of "+a+ " is "+cube);
        }
        else
        {
            int sq=a*a;
            System.out.println("Square of "+a+ " is "+sq);
        }

    }
}
