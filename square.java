import java.util.Scanner;

public class square {
    public static void main(String[] args) {
        //this is question sixteen
        Scanner ma=new Scanner(System.in);
        System.out.println("enter an integer");
        int a =ma.nextInt();
        //to find the square
        int sq=a*a;
        System.out.println("square of "+a + " is " + +sq);
        //to find the cube
        int cub=a*a*a;
        System.out.println("cube of "+a + " is "+cub);

    }
}
