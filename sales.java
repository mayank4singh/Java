import java.util.Scanner;

public class sales {
    public static void main(String[] args) {
        //this is question thirty three
        Scanner ff=new Scanner(System.in);
        System.out.println("Enter sales made by salesman: ");
        int i=ff.nextInt();
        if(i<=25000)
        {
            double com=i*5/100;
            System.out.println("5% of sale "+com);
        }
        else if(i<=50000 && i>25001)
        {
            double cm=i*7/100;
            System.out.println("7% of sale "+cm);
        }
        else if(i<=75000 && i>50001)
        {
            double c=i*8/100;
            System.out.println("8% of sale "+c);
        }
        else{
            double cmo=i*10/100;
            System.out.println("10% of sale "+cmo);
        }
    }
}
