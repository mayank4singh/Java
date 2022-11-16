import java.util.Scanner;

public class operator {
    public static void main(String[] args) {
        //this is question twenty
        Scanner fr=new Scanner(System.in);
       
        int a=fr.nextInt();
        int b=fr.nextInt();
        System.out.println("enter two integers "+a + " and "+ +b);


        //this is for addition
        int c=a+b;
        System.out.println(+a +"+"+ +b + "="+ +c);
        //this is for subtraction
        int d=a-b;
        System.out.println(+a+ "-"+b+ "="+ +d);
        //this is for multiplication
        int e=a*b;
        System.out.println(+a+ "*"+b+ "="+ +e);
        //this is for division
        int f=a/b;
        System.out.println(+a+ "/"+b+ "="+ +f);
        //this is for mod
        int g=a%b;
        System.out.println(+a+ "%"+b+ "="+ +g);



    }
}
