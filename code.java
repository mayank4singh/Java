import java.util.Scanner;

public class code {
    public static void main(String[] args) {
        //this is question twenty nine
        Scanner dd=new Scanner(System.in);
        System.out.println("Enter any code in integer ");
        int i=dd.nextInt();
        if(i==5 || i==7 || i==11 || i==24)
        {
            System.out.println("Right code");
        }
        else{
            System.out.println("Wrong code");
        }
        //this is question thirty
        if(i>=5&&i<=24)
        {
            System.out.println("Right code");
        }
        else
        {
            System.out.println("Wrong code");
        }
    }
}
