import java.util.Scanner;

//this is question twenty eight
public class secode {
    public static void main(String[] args) {
        Scanner ss=new Scanner(System.in);
        System.out.println("Enter se code for Male(M/m) or Female(F/f)");
        char st=ss.next().charAt(0);
        if(st=='M' || st=='m'){
            System.out.println("Given se code is Male ");
        }
        else if(st=='F' || st=='f'){
            System.out.println("Given se code is Female");
        }
        else{
            System.out.println("Wrong code");
        }

        
    }
}
