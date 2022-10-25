package Ej05;

import java.util.List;

public class Validate {

    public static List<Item> validateContents(String nombre, String apellido, String dni, String telefono, String direccion,
                                              String cp, String Ciudad, String nFederado, boolean checkGender, String passwd,
                                              String cPasswd, boolean solo, boolean grupo) {

        return null;
    }

    public static boolean validateList(List<Item> itemList) {
        for (Item item : itemList) {
            if (!item.isChecking())
                return false;
            else {
                return true;
            }
        }
        return true;
    }

    public static String getErrors(List<Item> itemList) {
        String error = "Error en: ";
        for (Item item : itemList) {
            if (!item.isChecking()){
                error += item.getName() + ", ";
            }

        }
        return error;
    }


    public static class Item {
        protected String name;
        protected boolean checking;

        public Item(String name, boolean checking) {
            this.name = name;
            this.checking = checking;
        }

        public String getName() {
            return name;
        }

        public boolean isChecking() {
            return checking;
        }
    }
}
