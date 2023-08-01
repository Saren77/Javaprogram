// Press ⇧ twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class maxandminarr {
    public int max(int[] val) {
        int max = val[0];

        for (int i = 0; i < val.length; i++) {
            if (val[i] > max) {
                max = val[i];
            }
        }
        return max;
    }

    public int min(int[] val) {
        int min = val[0];

        for (int i = 0; i < val.length; i++) {
            if (val[i] < min) {
                min = val[i];
            }
        }
        return min;
    }

    public static void main(String[] args) {
        maxandminarr ma = new maxandminarr();
        int[] value = {11, 2, 45, 78, 9, 0, -7};
        System.out.println("Maximum number in an array is " + ma.max(value));
        System.out.println("Minimum number in an array is " + ma.min(value));
    }
    }