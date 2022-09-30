/**
 * Clase que implementa la interfaz Estadisticas y sus metodos.
 */
public class ArrayReales implements Estadisticas{
    private double[] vector;

    public ArrayReales (double[] vector) {this.vector = vector;}


    /**
     * Busca el número minimo en el vector de dobles
     * @return devuelve el numero minimo
     */
    @Override
    public double minimo() {
        double min;
        min = vector[0];
        for (double num : vector) min = (num < min) ? num : min;
        return min;
    }

    /**
     * Busca el número maximo en el vector de dobles
     * @return devuelve el numero maximo
     */
    @Override
    public double maximo() {
        double max;
        max = vector[0];
        for (double num : vector) max = (num > max) ? num : max;
        return max;
    }

    /**
     * Suma todos los números dentro del vector de dobles
     * @return devuelve el sumatorio de los números dentro del vector
     */
    @Override
    public double sumatorio() {
        double suma = 0;
        for (double num : vector) suma += num;
        return suma;
    }
}
