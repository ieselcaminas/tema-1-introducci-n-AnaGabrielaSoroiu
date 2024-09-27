import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        int dia;
        int mes;
        int diaMes = 0;
        int diasTotales = 0;

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduzca un día");
        dia = sc.nextInt();

        System.out.println("Introduzca un mes");
        mes = sc.nextInt();

        for (int i = mes + 1; i <= 12 ; i++) {
            switch (i) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    diaMes = 31;
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    diaMes = 30;
                    break;
                case 2:
                    diaMes = 28;
                    break;
            }
            diasTotales = diasTotales + diaMes;
        }
        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                diaMes = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                diaMes = 30;
                break;
            case 2:
                diaMes = 28;
                break;
        }
        dia = diasTotales + (diaMes - dia);
        System.out.println("Quedan " + dia);


    }
}
