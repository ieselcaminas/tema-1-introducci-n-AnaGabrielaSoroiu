import java.util.Random;
import java.util.Scanner;

public class Ejercicio38 {
    public static void main(String[] args) {
        int num;

        Scanner sc = new Scanner(System.in);

        Random aleatorio = new Random(System.currentTimeMillis());

        System.out.print("Ingrese un número entre el 1 y el 100: ");
        num = sc.nextInt();

        int secreto = aleatorio.nextInt(100);

        do {

            if (num == -1) {
                System.out.println("Se rinde.");
                break;
            }

            if (num == secreto) {
                System.out.println("¡Has ganado!");
                break;
            } else if (num > secreto) {
                System.out.println("El número secreto es más pequeño.");
                System.out.println("Ingrese otro número: ");
                num = sc.nextInt();
            }else if (num < secreto){
                System.out.println("El número secreto es más grande.");
                System.out.println("Ingrese otro número: ");
                num = sc.nextInt();
            }

        }while (true);
    }
}
