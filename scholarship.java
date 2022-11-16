import java.util.Scanner;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane.SystemMenuBar;

public class scholarship {
    public static void main(String[] args) {
        //this is question thirty one
        Scanner ma=new Scanner(System.in);
        System.out.println("Enter annual family income ");
        int in=ma.nextInt();
        System.out.println("Enter age of a person: ");
        int age=ma.nextInt();
        if(in>=100000 && in<=200000)
        {
            if(age>=18 && age<=24)
            {
                System.out.println("Eligible for scholarship");
            }
        }
        else
        {
            System.out.println("Not eligible for scholarship");
        }
    }
}
