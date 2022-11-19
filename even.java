import java.util.Scanner;

//this is question thirty seven
public class even {
    public static void main(String[] args) {
        Scanner pp=new Scanner(System.in);
        System.out.println("Enter an integer: ");
        int ev=pp.nextInt();
        String eve="Integer is even";
        String odd="Integer is odd";
        String a=(ev%2==0)?eve:odd;
        System.out.println(a);
    }
    
}
