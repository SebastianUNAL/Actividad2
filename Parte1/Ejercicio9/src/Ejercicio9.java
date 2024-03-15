import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) throws Exception {
        double ventasdep1, ventasdep2, ventasdep3;
        double salario;
        double total_ventas;
        double tercio_ventas;
        double salario1;
        double salario2;
        double salario3;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese las ventas del departamento 1: ");
        ventasdep1 = input.nextDouble();
        System.out.println("Ingrese las ventas del departamento 2: ");
        ventasdep2 = input.nextDouble();
        System.out.println("Ingrese las ventas del departamento 3: ");
        ventasdep3 = input.nextDouble();
        System.out.println("Ingrese el salario: ");
        salario = input.nextDouble();

        total_ventas = ventasdep1 + ventasdep2 + ventasdep3;
        tercio_ventas = total_ventas * 0.33;

        if (ventasdep1 > tercio_ventas) {
            salario1 = salario + (salario*0.20);
        } else {
            salario1 = salario;
        }
        if (ventasdep2 > tercio_ventas) {
            salario2 = salario + (salario*0.20);
        } else {
            salario2 = salario;
        }
        if (ventasdep3 > tercio_ventas) {
            salario3 = salario + (salario*0.20);
        } else {
            salario3 = salario;
        }
        System.out.println("Las ventas del departamento 1 fueron: " + ventasdep1);
        System.out.println("El salario del vendedor 1 es de: " + salario1);
        System.out.println("Las ventas del departamente 2 fueron: " + ventasdep2);
        System.out.println("El salario del vendedor 2 es de: " + salario2);
        System.out.println("Las ventas del departamento 3 fueron: " + ventasdep3);
        System.out.println("El salario del vendedor 3 es de: " + salario3);
        input.close();
    }
}
