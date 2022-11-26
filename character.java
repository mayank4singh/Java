import java.util.Scanner;

public class character {
    public static void main(String[] args) {
        Scanner obj=new Scanner(System.in);
        System.out.println("Enter any character");
        char i= obj.nextLine().charAt(0);
        if(i>='A' && i<='Z'){
            System.out.println("The character is captial alphabet");
        }
        else if(i>='a' && i<='z'){
            System.out.println("The character is small letters");
        }
        else{
            System.out.println("The character is digit or any other special character");
        }
    }
}
