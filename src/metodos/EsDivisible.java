package metodos;

public class EsDivisible {
    public static boolean esDivisible(int n, int m) {
        if (n % m == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        int n;
        int m;

        n = Utilidades.leerEntero("Introduce un primer número: ");

        m = Utilidades.leerEntero("Introduce un segundo número: ");

        if (esDivisible(n,m)) {
            System.out.println("Es divisible.");
        } else {
            System.out.println("No es divisible.");
        }
    }
}
