package metodos;

public class EsTriangulo {
    public static boolean esTriangulo(int a, int b, int c) {
        if ((a > b + c)
            || (b > a + c)
            || (c > a + b)){
            return false;
        } else {
            return true;
        }
    }


    public static void main(String[] args) {
        int a;
        int b;
        int c;

        a = Utilidades.leerEntero("Ingrese el tamaño del primer palo: ");

        b = Utilidades.leerEntero("Ingrese el tamaño del segundo palo: ");

        c = Utilidades.leerEntero("Ingrese el tamaño del tercer palo: ");

        if (esTriangulo(a, b, c)){
            System.out.println("Se puede hacer.");
        } else {
            System.out.println("No se puede hacer.");
        }

    }
}
