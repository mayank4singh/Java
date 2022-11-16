import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class average {
    public static void main(String[] args) {
        //this is question thirty two
        Scanner dd=new Scanner(System.in);
        System.out.println("Enter marks in subject1: ");
        int sub1=dd.nextInt();
        System.out.println("Enter marks in subject2: ");
        int sub2=dd.nextInt();
        System.out.println("Enter marks in subject3: ");
        int sub3=dd.nextInt();
        int avg=(sub1+sub2+sub3)/3;
        if(avg>60)
        {
            System.out.println("FIRST DIVISION");
        }
        else if(avg>45 && avg<=60)
        {
            System.out.println("SECOND DIVISION");
        }
        else if(avg>33 && avg<=45)
        {
            System.out.println("THIRD DIVISION");
        }
        else {
            System.out.println("FAIL");
        }
        }
    }

