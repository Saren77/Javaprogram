
    package ConstructorsSession;
    interface shape {
        public double area();

        public double perimeter();
    }
    class cylinder12 implements shape {
        private double radius;
        private double height;

        cylinder12(double r, double h) {
            this.height = h;
            this.radius = r;
        }
        @Override
        public double area() {
            return Math.floor(2 * Math.PI * radius * (radius + height));
        }
        @Override
        public double perimeter() {
            return 4 * radius + 2 * height;
        }
    }
    class circle13 implements shape {

        double radius;
        circle13(double radius) {
            this.radius = radius;
        }
        @Override
        public double area() {
            return Math.PI * radius * radius;
        }
        @Override
        public double perimeter() {
            return 2 * Math.PI * radius;
        }
    }
    public class interfacespace {
        public static void main(String[] args) {
            cylinder12 c = new cylinder12(5.1, 10.2);
            circle13 c1 = new circle13(5.3);
            System.out.println(c.area());
            System.out.println(c.perimeter());
            System.out.println(c1.area());
            System.out.println(c1.perimeter());
        }
    }

