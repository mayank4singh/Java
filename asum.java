public class asum {
    public static void main(String[] args) { 
            double [] a = new double [] {1.5, 2.6, 3.9, 4.3, 5.2};  
            double sum = 0;  
            for (int i = 0; i < a.length; i++) {  
               sum = sum + a[i];  
            }  
            System.out.println("Sum of all the elements of an array: " + sum);  
    }
    
}
