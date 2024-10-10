import java.util.Scanner;

public class Ejercicio36 {
    public static void main(String[] args) {

        int decimal;
        int x;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número: ");
        decimal = sc.nextInt();
        String binario = " ";

        do {

          x = decimal % 2;
          binario = x + binario;
          decimal = decimal / 2;

        } while (decimal > 0);

        System.out.print(binario);

    }
}
