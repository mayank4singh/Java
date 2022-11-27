import java.util.Scanner;

//this is fifth question of case/conditionals
public class URL {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the website");
        String website=sc.nextLine();
        if(website.endsWith(".org")){
            System.out.println("This is a organizational website");
        }
        else if(website.endsWith(".com")){
            System.out.println("This is a commercial website");
        }
        else if(website.endsWith(".in")){
            System.out.println("This is an Indian website");
        }
        else{
            System.out.println("This is an Invalid choice");
        }
        
    }
}
