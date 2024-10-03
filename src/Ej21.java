import java.util.Scanner;

public class Ej21 {
    public static void main(String[] args) {
        int casos;
        int x;
        int y;
        int finMes;

        Scanner sc = new Scanner(System.in);

        System.out.print("Introduzca el número de casos: ");
        casos = sc.nextInt();

        for (int i = 1; i <= casos ; i++) {
            System.out.println("Ingrese el saldo: ");
            x = sc.nextInt();

            System.out.println("Ingrese los gastos: ");
            y = sc.nextInt();

            finMes = x + y;

            if (finMes >= 0) {
                System.out.println("Sí llego a fin de mes");
            } else {
                System.out.println("No llego a fin de mes");
            }
        }
    }
}
