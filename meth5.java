import java.util.Scanner;

public class meth5 {
    int isPalindrome(int num)
    {
        int a,n=0;
        while(num!=0)
        {
            n=n*10;
            a=num%10;
            n=n+a;
            num/=10; 
        }
        return n;
    }  
    public static void main(String[] args) 
    {
        meth5 obj=new meth5();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer:");
        int a=sc.nextInt();   
        if(obj.isPalindrome(a)==a)
            System.out.println(a+" is a Palindrome Number");
        else
            System.out.println(a+" is not a Palindrome Number");
    } 
}

