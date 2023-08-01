import java.util.Scanner;

public class subject {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        double[] marks = new double[5];

        for (int i = 0; i < 5; i++)
            marks[i] = input.nextDouble();

        double sum = 0;
        for (double mark : marks) {
            sum += mark;
        }

        double average = sum / marks.length;

        System.out.println("The average marks of the student is: " + average);
    }
}

