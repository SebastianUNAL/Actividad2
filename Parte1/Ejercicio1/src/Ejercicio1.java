public class Ejercicio1 {
    public static void main(String[] args) throws Exception {
        Empleado Trabajador = new Empleado();
        Trabajador.Codigo = 156970;
        Trabajador.Horas_Trabajadas = 65;
        Trabajador.Nombres = "Andres Lopez";
        Trabajador.valor_hora = 40000;
        Trabajador.porcentaje_retencion = 12.5;
        Trabajador.salario_bruto = (Trabajador.Horas_Trabajadas * Trabajador.valor_hora);
        Trabajador.salario_neto = (Trabajador.salario_bruto - (Trabajador.salario_bruto * (Trabajador.porcentaje_retencion/100)));
        System.out.println("El codigo del empleado es: " + Trabajador.Codigo);
        System.out.println("Los nombres del empleado son: " + Trabajador.Nombres);
        System.out.println("El salario bruto es de: " + Trabajador.salario_bruto);
        System.out.println("El salario neto es de: " + Trabajador.salario_neto);
    }
}
