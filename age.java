import java.util.Scanner;

public class age {
    public static void main(String[] args) {
        //this is question twenty one  
        Scanner gk=new Scanner(System.in);
        System.out.println("enter the age of person");
        int a=gk.nextInt();
        if(a>=18)
        {
            System.out.println("you are an adult");
        }
        else{
            System.out.println("you are minor");
        }


    }
}
