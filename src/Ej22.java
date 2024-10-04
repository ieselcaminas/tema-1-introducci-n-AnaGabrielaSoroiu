import java.util.Scanner;

public class Ej22 {
    public static void main(String[] args) {
        int c;
        int p;
        int t;
        int ct;
        int resta;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Introduzca la cantidad de casillas: ");
            c = sc.nextInt();

            System.out.print("Introduzca la posición en la que se encuentra: ");
            p = sc.nextInt();

            System.out.println("Introduzca la tirada de dados: ");
            t = sc.nextInt();

            ct = p + t;

            if (ct > c) {
                resta = ct - c;
                System.out.println(c - resta);
            } else {
                System.out.println(ct);
            }
        } while (c != 0 && p != 0 && t !=0);
    }
    
}
