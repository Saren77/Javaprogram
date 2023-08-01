import java.util.Scanner;

public class adding {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Length and breadth");
        int a=sc.nextInt(),b=sc.nextInt(),c;
        c=a*b;
        System.out.println("area of rectangle:" +c);
    }
}
