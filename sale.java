import java.util.Scanner;

public class sale {
    public static void main(String[] args) {
        Scanner ee=new Scanner(System.in);
        System.out.println("Enter the sale made: ");
        int sl=ee.nextInt();
        int cm5=sl*5/100;
        int cm7=sl*7/100;
        boolean com=(sl<=2500)?true:false;
        if(com==true){
            System.out.println("5% of commission: "+cm5);
        }
        else{
            System.out.println("7% of commission: "+cm7);
        }



    }
}
