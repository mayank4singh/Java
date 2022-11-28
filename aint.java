import java.util.Scanner;

public class aint {
    public static void main(String[] args) {
            int[] a = {1, 2, 3, 4, 6, 7, 8};
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter an integer");
            int b=sc.nextInt();
            for(int i=0;i<a.length;i++)
               if(b ==a[i])
               {
                  System.out.println("Array contains the given element");
               }
               else{
                   System.out.println("Array does not contains the given element");
               }
    
    
}
}
