package metodos;

public class esDiasMes {
    public static int esMes (int mes) {
        int dias = 0;

        switch (mes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                dias = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                dias = 30;
                break;
            case 2:
                dias = 28;
        } return dias;
    }

    public static void main(String[] args) {
        int mes;
        int dia;

        mes = Utilidades.leerEntero("Introduce el mes: ");

        dia = esMes(mes);

        System.out.println("El mes " + mes + " tiene " + dia + " días.");

    }
}
