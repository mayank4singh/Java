import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner rr=new Scanner(System.in);
        System.out.println("Enter an interger from 1-3");
        int wd=rr.nextInt();
        switch(wd){
            case 1:System.out.println("ONE");
            break;
            case 2:System.out.println("TWO");
            break;
            case 3:System.out.println("THREE");
            break;
            default:System.out.println("OUT OF RANGE");
        }
    }
}
