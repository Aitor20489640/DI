package Ej05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ValidateExtras {

    public static List<Item> validateContents(String nombre, String apellido, String dni, String telefono, String direccion,
                                              String cp, String ciudad, String nFederado, boolean checkGender, char[] passwd,
                                              char[] cPasswd, List<String> posicion, boolean solo, boolean grupo) {

        List<Item> itemList = new ArrayList<>();
        if (nombre.isEmpty()) {
            itemList.add(new Item("nombre vacio", false));
        } else {
            if (nombre.length() <= 30 && nombre.matches("^[^0-9,]+$")){
                itemList.add(new Item("nombre", true));
            } else {
                itemList.add(new Item("nombre tiene mas de 30 caracteres o numeros", false));
            }
        }
        if (apellido.isEmpty()) {
            itemList.add(new Item("apellido vacio", false));
        } else {
            if (apellido.length() <= 60 && apellido.matches("^[^0-9,]+$")){
                itemList.add(new Item("apellido", true));
            } else {
                itemList.add(new Item("apellido tiene mas de 60 caracteres o numeros", false));
            }
        }
        if (dni.isEmpty()) {
            itemList.add(new Item("dni vacio", false));
        } else {
            if (dni.matches("^[XYZ]?([0-9]{7,8})[A-Z]$")) {
                itemList.add(new Item("dni", true));
            } else {
                itemList.add(new Item("dni no tiene el formato adecuado", false));
            }
        }
        if (telefono.trim().length() == 0) {
            itemList.add(new Item("telefono vacio", false));
        } else {
            itemList.add(new Item("telefono", true));
        }
        if (direccion.isEmpty()){
            itemList.add(new Item("direccion vacia", false));
        } else {
            if (direccion.length() <= 120 && direccion.matches("^[^,]+$")){
                itemList.add(new Item("direccion", true));
            } else {
                itemList.add(new Item("direccion tiene mas de 120 caracteres o comas", false));
            }
        }
        if (cp.isEmpty()) {
            itemList.add(new Item("CP vacio", false));
        } else {
            if (cp.matches("([0-9]{0,5})")) {
                itemList.add(new Item("CP", true));
            } else {
              itemList.add(new Item("CP tiene mas de 5 caracteres o no es solo numeros", false));
            }
        }
        if (ciudad.isEmpty()){
            itemList.add(new Item("ciudad vacia", false));
        } else {
            if (ciudad.length() <= 30 && ciudad.matches("^[^0-9,]+$")){
                itemList.add(new Item("ciudad", true));
            } else {
                itemList.add(new Item("ciudad tiene mas de 30 caracteres o numeros", false));
            }
        }
        if (nFederado.isEmpty()){
            itemList.add(new Item("nFederado vacio", false));
        } else {
            if (nFederado.matches("^([0-9]{0,6})$")){
                itemList.add(new Item("nFederado", true));
            } else {
                itemList.add(new Item("nFederado tiene mas de 6 caracteres o no es solo numeros", false));
            }
        }
        if (!checkGender){
            itemList.add(new Item("Necesitas seleccionar un genero", false));
        } else {
            itemList.add(new Item("genero", true));
        }
        if (passwd.length == 0){
            itemList.add(new Item("contrasña vacia", false));
        } else {
            if (passwd.length <= 10) {
                itemList.add(new Item("contraseña", true));
            }
        }
        if (!Arrays.equals(passwd, cPasswd)){
            itemList.add(new Item("las contraseñas no coinciden", false));
        } else {
            itemList.add(new Item("Ccontrasña", true));
        }
        if (posicion.isEmpty()){
            itemList.add(new Item("selecciona una posición", false));
        } else {
            if (posicion.contains("arbitro") && posicion.size() > 1){
                itemList.add(new Item("El arbitro no puede tener otra poscion", false));
            } else {
                itemList.add(new Item("posicion", true));
            }
        }
        if (solo || grupo){
            itemList.add(new Item("competencia", true));
        } else {
            itemList.add(new Item("selecciona un tipo de competencia", false));
        }

        return itemList;
    }

    public static boolean validateList(List<Item> itemList) {
        for (Item item : itemList) {
            if (!item.isChecking()){
                return false;
            }
        }
        return true;
    }

    public static String getErrors(List<Item> itemList) {
        StringBuilder error = new StringBuilder("Error en: ");
        for (Item item : itemList) {
            if (!item.isChecking()){
                error.append(item.getName()).append(", ");
            }

        }
        return error.toString();
    }
}
