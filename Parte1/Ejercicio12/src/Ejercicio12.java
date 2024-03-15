import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) throws Exception {
        double A, B, C;
        double Solucion_Positiva, Solucion_Negativa;
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor de A, luego el de B y finalmente el de C: ");
        A = input.nextDouble();
        B = input.nextDouble();
        C = input.nextDouble();
        
        Solucion_Positiva = (-B + Math.sqrt((Math.pow(B, 2) - 4*A*C)))/2*A;
        Solucion_Negativa = (-B - Math.sqrt((Math.pow(B, 2) - 4*A*C)))/2*A;

        System.out.println("La solucion positiva es: " + Solucion_Positiva);
        System.out.println("La solucion negativa es: " + Solucion_Negativa);


        input.close();
    }
}
