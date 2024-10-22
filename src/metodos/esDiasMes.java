package metodos;

public class esDiasMes {
    public static int esMes (int mes) {

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return 28;
            default:
                return -1;
        }
    }

    public static void main(String[] args) {
        int mes;
        int dia;

        mes = Utilidades.leerEntero("Introduce el mes: ");

        dia = esMes(mes);

        if (dia == -1) {
            System.out.println("El mes no existe.");
        }else {
            System.out.println("El mes tiene " + dia + " días.");
        }

    }
}
