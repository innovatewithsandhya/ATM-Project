import java.util.Scanner;

public class Power {
    public static void main(String [] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the Base: ");
        double a = sc.nextDouble();
        System.out.println("Enter the exponent: ");
        double b = sc.nextDouble();
        double result = Math.pow(a,b);
        System.out.println(a+"^"+b+"="+ result);
    }

}
