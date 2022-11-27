import java.util.Scanner;

public class meth3 {
    boolean isVowel(char c){
        boolean a=false;
        if(c=='a' || c=='e' || c=='i' || c=='o'|| c=='u' || c=='A')
        {
            a=true;
        }
        else
        {
            a=false;
        }
        return a;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a character");
        String ch=sc.nextLine();
        ch=ch.toLowerCase();
        meth3 obj=new meth3();
        char c;int count=0;
        for(int i=0;i<ch.length();i++)
        {
            c=ch.charAt(i);
            if(obj.isVowel(c)==true)
             count++;
        }
        System.out.println("Total no. of vowels :"+ ch +" is :"+count);
        
    }
}
