import java.util.Scanner;

//this is question thirty six
public class agee {
    public static void main(String[] args) {
        Scanner dd= new Scanner(System.in);
        System.out.println("Enter the age: ");
        int aa=dd.nextInt();
        String st="You are an adult";
        String mt="You are minor";
        String y=aa>=18?st:mt;
        System.out.println(y);

    }
}
