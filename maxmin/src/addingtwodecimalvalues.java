import java.util.Scanner;

public class addingtwodecimalvalues {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter two decimal values");
        float a=sc.nextFloat(),b=sc.nextFloat(),c;
        c=a+b;
        System.out.println("Sum of two decimal values are:"+c);
    }
}
