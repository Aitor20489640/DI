public class Ej01 {
    public static void main(String[] args) {
        double[] vector = {1, 2, 3, 4, 5 ,10, 9, 15};
        ArrayReales array = new ArrayReales(vector);

        System.out.println(array.minimo());
        System.out.println(array.maximo());
        System.out.println(array.sumatorio());


    }
}
