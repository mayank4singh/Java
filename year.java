import java.util.Scanner;

//this is fourth question of case/conditionals
public class year {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a year");
        int Y=sc.nextInt();
        if(Y%4==0 || Y%400==0){
            System.out.println("Entered year is a leap year");
        }
        else{
            System.out.println("Entered year is not a leap year");
        }
        
    }
}
