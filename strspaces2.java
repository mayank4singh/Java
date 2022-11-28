import java.util.Scanner;

public class strspaces2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String a=sc.nextLine();
        int i, count=0;
        for(i=0;i< a.length();i++){
            char c=a.charAt(i);
            if(c==' ')
            count++;
        }
        System.out.println(count);
    }
}
