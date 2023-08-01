import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int A = 0,B = 1,C;
        System.out.print(A+" ");
        System.out.print(B+" ");
        for(int i=1;i<=n;i++) {
            C = A + B;
            System.out.print(C+" ");
            A = B;
            B = C;
        }
    }
}
