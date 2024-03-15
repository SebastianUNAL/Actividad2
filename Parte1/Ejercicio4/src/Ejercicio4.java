import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) throws Exception {
        double A;
        double B;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor de A");
        A = input.nextDouble();
        System.out.println("Ingrese el valor de B");
        B = input.nextDouble();

        if (A > B) {
            System.out.println("A es mayor a B");
        } else if (B > A) {
            System.out.println("A es menor que B");
        } else {
            System.out.println("A es igual a B");
        }
        input.close();
    }
}
