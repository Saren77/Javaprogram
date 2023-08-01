import java.util.Scanner;

public class areaandcircumference {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the radius"+"\n"+"Enter the side of square");
        int r= sc.nextInt(),  s=sc.nextInt();int area;
        double pie=3.14,a,c;
        a=pie*r*r;
        c=2*pie*r;
        area=s*s;
        System.out.println("area of circle is:"+a+ "\n"+"circumference of circles is:"+c+ "\n"+"area of square is:"+area);

    }
}
