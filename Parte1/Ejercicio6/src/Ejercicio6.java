import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) throws Exception {
        double x;
        double y;
        double z;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el primer numero: ");
        x = input.nextDouble();
        System.out.println("Ingrese el segundo numero: ");
        y = input.nextDouble();
        System.out.println("Ingrese el tercer numero: ");
        z = input.nextDouble();

        if (x > y && x > z) {
            System.out.println("El primer numero es el mayor");
        } else if (y > x && y > z) {
            System.out.println("El segundo numero es el mayor");
        } else if (z > x && z > y) {
            System.out.println("El tercer numero es el mayor");
        }
        input.close();

    }
}
