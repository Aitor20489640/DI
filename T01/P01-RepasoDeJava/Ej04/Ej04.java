import java.util.Scanner;

public class Ej04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name, res;

        name = sc.nextLine();
        switch (name) {
            case "gryffindor" -> res = "bravery";
            case "hufflepuff" -> res = "loyalty";
            case "slytherin" -> res = "cunning";
            case "ravenclaw" -> res = "intellect";
            default -> res = "not a valid house";
        }

        System.out.println(res);
    }
}
