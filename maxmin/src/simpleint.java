import java.util.Scanner;

public class simpleint {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter the amount");
        int p=sc.nextInt();
        System.out.println("Enter the rate of interest");
        int r=sc.nextInt();
        System.out.println("Enter time duration");
        int t=sc.nextInt();
        int si;
         si = (p * r * t) / 100;
        System.out.println("Simple interest:"+si);

    }
}
