import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

//this is second question of case/conditionals
public class tax {
    public static void main(String[] args) {
        Scanner ta=new Scanner(System.in);
        System.out.println("Enter the employee income ");
        int a=ta.nextInt();
        if(a<250000){
            System.out.println("No tax below 2.5 lakhs");
        }
        else if(a>=250000 && a<500000){
            float taxPaid=a*5/100;
            System.out.println("Tax paid is 5% = "+taxPaid);
        }
        else if(a>=500000 && a<1000000){
            float taxPaid=a*20/100;
            System.out.println("Tax paid is 20% = "+taxPaid);
        }
        else {
            float taxPaid=a*30/100;
            System.out.println("Tax paid is 30% = "+taxPaid);
        }
    }
    
}
