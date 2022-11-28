import java.util.Scanner;

public class strspaces {
    public static void main(String[] args) {
        String a ;    
        char ch = '-'; 
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the sentence");
        a=sc.nextLine();       
        a= a.replace(' ', ch);    
        System.out.println("String after replacing spaces with given sentence: ");    
        System.out.println(a);    
    }
}
