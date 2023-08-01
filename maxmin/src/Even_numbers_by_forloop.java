import java.util.Scanner;

public class Even_numbers_by_forloop {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter N number");
        int N = sc.nextInt(),i;
        for (i=1;i<=N;i++) {
            if (i%2==0) {
                System.out.println(i+"");
            }
        }
    }
}
