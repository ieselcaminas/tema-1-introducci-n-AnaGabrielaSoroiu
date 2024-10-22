package metodos;

public class esDivisor {
    public static String esDivisor(int num) {
        String divisor = "";
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                divisor += i + " ";
            }
        } return divisor;
    }

    public static void main(String[] args) {
        int num;
        String divisor;

        num = Utilidades.leerEntero("Introduce un número: ");

        divisor = esDivisor(num);

        System.out.println("El " + divisor + " es divisor de " + num);
    }
}
