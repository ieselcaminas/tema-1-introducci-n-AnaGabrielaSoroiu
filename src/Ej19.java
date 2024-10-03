import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        double distancia;
        double tramo;
        double tiempo;
        double media;
        double km;
        double horas;

        Scanner sc = new Scanner(System.in);

       do {
           System.out.println("Ingrese la distancia: ");
           distancia = sc.nextDouble();

           System.out.println("Ingrese la tramo: ");
           tramo = sc.nextDouble();

           System.out.println("Ingrese la tiempo: ");
           tiempo = sc.nextDouble();

           km = distancia / 1000;
           horas = tiempo / 3600;
           media = km / horas;

           if(media <= tramo) {
               System.out.println("OK");
           }else if (media <= (tramo + (tramo * 0.2))){
               System.out.println("MULTA");
           } else if (media >= (tramo + (tramo * 0.2)))
               System.out.println("PUNTOS");

       } while (distancia != 0 && tramo != 0 && tiempo != 0);

    }
}
