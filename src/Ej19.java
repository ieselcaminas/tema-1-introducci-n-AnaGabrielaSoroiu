import java.util.Scanner;

public class Ej19 {
    public static void main(String[] args) {
        int distancia;
        int tramo;
        int tiempo;
        int media;
        int km;
        int horas;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese la distancia: ");
        distancia = sc.nextInt();

        System.out.println("Ingrese la tramo: ");
        tramo = sc.nextInt();

        System.out.println("Ingrese la tiempo: ");
        tiempo = sc.nextInt();

        do {
            km = distancia / 1000;
            horas = tiempo / 3600;
            media = km / horas;
            if(media > tramo) {
                System.out.println("OK");
            }else {
                System.out.println("MULTA");
            }
        }while (distancia != 0 %% tramo != 0 %% tiempo != 0)

    }
}
