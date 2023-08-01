import java.util.Scanner;

public class circle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius"+"\n"+"Enter the side osf square");
        int area;
        int r= sc.nextInt(),s= sc.nextInt();
        double pie=3.14,a,c;
        area=s*s;
        a=pie*r*r;
        c=2*pie*r;
        System.out.println("area of square:"+area+"\n"+"area of circle:"+a+"\n"+"circumference of a circle:"+c);
    }
}
