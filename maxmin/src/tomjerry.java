import java.util.Scanner;

public class tomjerry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        int a = sc.nextInt();
        if (a % 2 == 0 && a > 10 && a < 25) {
            System.out.println(" IS TOM ");
        } else if (a % 2 != 0 && a > 10 && a < 25) {

            System.out.println(" IS JERRY ");
        }
        else {
            System.out.println(" TOM AND JERRY ");
        }
                }
            }
