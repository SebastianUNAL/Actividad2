import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) throws Exception {
        double A, B, C, D;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A, B, C y luego la D siendo 3 iguales");
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        D = input.nextDouble();

        if (A == B && A == C) {
            System.out.println("D es el diferente");
            if (D > A) {
                System.out.println("D es mayor");
            } else {
                System.out.println("D es el menor");
            }
        } else if (A == B && A == D) {
            System.out.println("C es el diferente");
            if (C > A) {
                System.out.println("C es mayor");
            } else {
                System.out.println("C es el menor");
            }
        } else if (A == C && A == D) {
            System.out.println("B es el diferente");
            if (B > A) {
                System.out.println("B es mayor");
            } else {
                System.out.println("B es el menor");
            }
        } else {
            System.out.println("A es el diferente");
            if (A > B) {
                System.out.println("A es mayor");
            } else {
                System.out.println("A es el menor");
            }
        }
        input.close();
    }
}
