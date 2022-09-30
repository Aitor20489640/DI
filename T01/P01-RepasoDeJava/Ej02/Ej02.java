public class Ej02 {
    public static void main(String[] args) {
        int[] vec = {-25, 16, -4, 100, -81};
        int[] sq = Math3.abs(vec);

        for (int num : sq) {
            System.out.println(num);
        }
    }
}
