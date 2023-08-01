import java.util.Scanner;
public class area {
    public static void main(String[] args) {
        float s, area,perimeter;
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Side Length of Square: ");
        s = scan.nextFloat();

        area = s * s;
        System.out.println("area =" +area);

        perimeter = 4*s;
        System.out.println("\nPerimeter = " +perimeter);
    }
}
