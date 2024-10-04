import java.util.Scanner;

public class Ejercicio24 {
    public static void main(String[] args) {
        int nota;
        int CuantasNotas = 0;
        float SumaNotas = 0;
        boolean HayDiez = false;

        Scanner sc = new Scanner(System.in);

        do {
            nota = sc.nextInt();
            if (nota != -1) {
                SumaNotas = SumaNotas + nota;
                //SumaNotas += nota es lo mismo que lo de arriba.
                CuantasNotas++;
                if (nota == 10) {
                    HayDiez = true;
                }
            }
        } while (nota != -1);

        System.out.println("La suma de las notas es: " + (SumaNotas/CuantasNotas));

        if (HayDiez) {
            System.out.println("Hay un 10 en tus notas.");
        }else {
            System.out.println("No hay ningún 10 en tus notas.");
        }

    }

}
