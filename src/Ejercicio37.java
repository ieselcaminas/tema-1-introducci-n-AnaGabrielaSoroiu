import java.util.Scanner;

public class Ejercicio37 {
    public static void main(String[] args) {
        String binario = " ";
        double decimal = 0;
        double num;

        //System.out.print(binario.length());
        //System.out.print(binario.charAt(i));
        //System.out.print(Math.pow(2, i));

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese un número binario: ");
        binario = sc.nextLine();

        for (int i = 0; i < binario.length(); i++) {

            num = binario.charAt(binario.length() - 1 - i) - '0';

            decimal += num * Math.pow(2, i);
        }

        System.out.println(decimal);
    }
}
