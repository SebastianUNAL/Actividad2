import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) throws Exception {
        double lado_alto;
        double lado_hipotenusa;
        double lado_base;
        double perimetro;
        double semiperimetro;
        double area;
        
        Scanner input = new Scanner(System.in);
        System.out.println("Ingrese el valor del lado alto del triangulo rectangulo: ");
        lado_alto = input.nextDouble();
        System.out.println("Ingrese el valor del lado de la hipotenusa del triangulo rectangulo: ");
        lado_hipotenusa = input.nextDouble();
        System.out.println("Ingrese el valor del lado de la base del triangulo rectangulo: ");
        lado_base = input.nextDouble();

        perimetro = lado_alto + lado_base + lado_hipotenusa;
        area = (lado_base * lado_alto) / 2;
        semiperimetro = perimetro / 2;

        System.out.println("El perimetro es de: " + perimetro);
        System.out.println("El semiperimetro es de " + semiperimetro);
        System.out.println("El area es de: " + area);
        input.close();

    }
}
