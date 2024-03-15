import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) throws Exception {
        double valor_matricula = 50000;
        double valor_final;
        Scanner input = new Scanner(System.in);
        Estudiante student = new Estudiante();
        System.out.println("Ingrese los nombres del estudiante: ");
        student.nombre = input.nextLine();
        System.out.println("Ingrese el numero de inscripcion: ");   //Use nextLine para que imprimiera los ceros anteriores
        student.num_inscripcion = input.nextLine();
        System.out.println("Ingrese el valor del patrimonio: ");
        student.patrimonio = input.nextDouble();
        System.out.println("Ingrese su estrato social: ");
        student.estrato = input.nextInt();

        if (student.patrimonio > 2000000 && student.estrato > 3) {
            valor_final = ((student.patrimonio * 3) / 100 + valor_matricula);

        } else {
            valor_final = valor_matricula;
        }
        System.out.println("El numero de inscripcion es: " + student.num_inscripcion);
        System.out.println("El nombre del estudiante es: " + student.nombre);
        System.out.println("El pago por matricula es de: " + valor_final);

        input.close();
    }
}
