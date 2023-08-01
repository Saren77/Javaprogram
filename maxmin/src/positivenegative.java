import java.util.Scanner;

public class positivenegative {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter numbers");
        int a = sc.nextInt();
        if (a>0) {
            System.out.println("A is positive");
        } else if (a<0) {
            System.out.println("A is negative");
        }
        else {
            System.out.println("A is zero");
        }
        {

        }
    }
}
