import java.util.Scanner;
public class Ejercicio13 {
    static void checkmayor(double X, double Y, double Z) {
        if (X > Y && X > Z) {
            System.out.println("A es la mayor");
        } else if (Y > X && Y > Z) {
            System.out.println("B es la mayor");
        } else if (Z > X && Z > Y) {
            System.out.println("C es la mayor");
        }
    }
    public static void main(String[] args) throws Exception {
        double A, B, C;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A, luego la B y finalmente la C: ");
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        checkmayor(A, B, C);
        
        input.close();
    }
}
