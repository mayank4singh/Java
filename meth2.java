import java.util.Scanner;

//This is second question of method assignment
public class meth2 {
    boolean isEven( int T)
    {
        boolean c=false;
    if(T%2==0){
        c=true;
    }
    else{
        c=false;
    }
    return c;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter an integer number:");
        int a=sc.nextInt();
        meth2 obj=new meth2();
        if(obj.isEven(a)==true)
            System.out.println(a+" is an Even Number");
        else
            System.out.println(a+" is an Odd Number");
        
    }
}
