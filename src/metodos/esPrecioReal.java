package metodos;

public class esPrecioReal {
    public static double esDescuento(double real, double rebajado) {
        double descuento;

        descuento = (real - rebajado) / real * 100;

        return descuento;

    }
    public static void main(String[] args) {
        double precioReal;
        double precioRebajado;
        double descuento;

        precioReal = Utilidades.leerEntero("Introduce el precio real: ");

        precioRebajado = Utilidades.leerEntero("Introduce el precio rebajado: ");

        descuento = esDescuento(precioReal, precioRebajado);

        System.out.println("El descuento es: " + descuento + "%");

    }
}
