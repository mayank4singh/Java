import java.util.Scanner;

import javax.print.attribute.standard.Media;

public class words {
    public static void main(String[] args) {
        //this is question twenty six
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. of words to be send");
        int a=sc.nextInt();
       if(a<=10)
        {
            double ch=a*7.5;
            System.out.println("Total charge to send: "+ch);
        }
        else{
            int total_words=a-10;
            double total_charge=(total_words*1.5)+ 75;
            System.out.println("total charge to send: "+total_charge);

        }

    }
}
