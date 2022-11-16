import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class pos {
    public static void main(String[] args) {
        //this is question twenty seven
        Scanner dd=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int i=dd.nextInt();
        if(i>0)
        {
            System.out.println(+i+ " is positive integer");
        }
        else if(i<0)
        {
            System.out.println(+i+ " is negative integer");
        }
        else
        {
            System.out.println(+i+ " is zero");
        }
        }

    }

