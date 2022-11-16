import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class commission {
    public static void main(String[] args) {
        //this is question twenty five
        Scanner cm=new Scanner(System.in);
        System.out.println("enter commission made by salesman: ");
        int a=cm.nextInt();
        if(a<=25000)
        {
            int com=a*5/100;
            System.out.println("commission is "+com);
        }
        else{
            int co=a*7/100;
            System.out.println("commission is "+co);

        }
        
    }
}
