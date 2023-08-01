import java.util.Scanner;

public class switchcasecharacters {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter characters");
        char ch=sc.next().charAt(0);
        switch(ch) {
            case 'A','E','I','O','U':
                System.out.println("CAPITAL VOWEL");
            case 'a','e','i','o','u':
                System.out.println("small vowel");
            default:
                System.out.println("Nor Capital or small");
        }

    }
}
