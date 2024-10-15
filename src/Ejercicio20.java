import java.util.Scanner;

public class Ejercicio20 {
    public static void main(String[] args) {
        int precio;
        float descuento5;
        float descuento10;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el precio");
        precio = sc.nextInt();

        if (precio < 6) {
            System.out.println("EL precio es " + precio + "€");
        } else if (precio >= 6 && precio < 60) {
            descuento5 = precio - (precio * 0.05f);
            System.out.println("El descuento es " + descuento5 + "€");
        } else if (precio >= 60) {
            descuento10 = precio - (precio * 0.10f);
            System.out.println("El descuento es " + descuento10 + "€");
        }
    }
}
