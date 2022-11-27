public class meth4 {
    boolean isPrime(int a)
{
    for(int i = 2; i < a; i++)
{
    if(a % i == 0)
        {
            return false;
        }
    }
    
    return true;
}
    public static void main(String[] args) {
        meth4 obj=new meth4();
        System.out.println("Prime numbers between 1 and 500 is:"); 
        for (int i=1;i<=500;i++) {  
           if (obj.isPrime(i)==true) 
               System.out.println(i);

        
    }
}
}
