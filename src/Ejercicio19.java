import java.util.Scanner;

    public class Ejercicio19 {
        public static void main(String[] args) {
            double PrecioHora;
            int NumHoras;
            double bruto;
            double impuestos;

            Scanner sc = new Scanner(System.in);

            System.out.println("Ingrese el precio por horas");
            PrecioHora = sc.nextDouble();

            System.out.println("Ingrese número de horas");
            NumHoras = sc.nextInt();

            if (NumHoras <= 35) {
                bruto = NumHoras * PrecioHora;
            } else {
                bruto = 35 * PrecioHora + (NumHoras - 35) * PrecioHora * 1.5;
            }
            System.out.println("El salario bruto es " + bruto);

            if (bruto <= 500) {
                impuestos = 0;
            } else if (bruto <= 900) {
                impuestos = (bruto - 500) * 0.25;
            } else {
                impuestos = (400 * 0.25) + (bruto - 500 - 400) * 0.45;
            }

            System.out.println("Los impuestos son " + impuestos);
            System.out.println("El salario neto es " + (bruto - impuestos));

        }
    }
