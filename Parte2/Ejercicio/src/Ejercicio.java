public class Ejercicio {
    public static void main(String[] args) throws Exception {
            Circulo figura1 = new Circulo(2);
            Rectangulo figura2 = new Rectangulo(1,2);
            Cuadrado figura3 = new Cuadrado(3);
            TrianguloRectangulo figura4 = new TrianguloRectangulo(3,5);
            
            System.out.println("El area del círculo es = " + figura1.calcArea());
            System.out.println("El perímetro del círculo es = " + figura1.calcPerimetro());
            
            System.out.println();
            
            System.out.println("El area del rectangulo es = " + figura2.calcArea());
            System.out.println("El perímetro del rectangulo es = " + figura2.calcPerimetro());
            
            System.out.println();
            
            System.out.println("El area del cuadrado es = " + figura3.calcArea());
            System.out.println("El perimetro del cuadrado es = " + figura3.calcPerimetro());
            
            System.out.println();
            
            System.out.println("El área del triángulo es = " + figura4.calcArea());
            System.out.println("El perimetro del triángulo es = " + figura4.calcPerimetro());
            figura4.determinarTipoTriángulo();
            }
}
