import java.util.Scanner;

public class Ej20 {
    public static void main(String[] args) {
        int trebol;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el número de hojas");
        trebol = sc.nextInt();

        if (trebol < 3) {
            System.out.println("Imposible");
        }else {
            System.out.println(trebol / 4);
        }
    }
}
