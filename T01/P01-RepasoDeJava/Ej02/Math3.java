import java.lang.Math;
public class Math3 implements Extremos{

    public static double[] sqrt(double[] a) {
        double[] arr = new double[a.length];
        int cont = 0;
        for (double num : a) {
            for (int i = 1; i < num; i++) {
                if (num/i == i){
                    arr[cont] = i;
                }
            }
            cont++;
        }

        return arr;
    }

    public static int[] abs(int[] a){
        int[] vec = new int[a.length];
        int i = 0;
        for (int num : a) {
            vec[i] = (num < 0) ? -num : num;
            i++;
        }
        return vec;
    }
    @Override
    public int min(int[] a) {
        int min;
        min = a[0];
        for (int num : a) min = (num < min) ? num : min;
        return min;
    }

    @Override
    public int max(int[] a) {
        int max;
        max = a[0];
        for (int num : a) max = (num > max) ? num : max;
        return 0;
    }

    @Override
    public double min(double[] a) {
        double min;
        min = a[0];
        for (double num : a) min = (num < min) ? num : min;
        return min;
    }

    @Override
    public double max(double[] a) {
        double max;
        max = a[0];
        for (double num : a) max = (num > max) ? num : max;
        return max;
    }

}
