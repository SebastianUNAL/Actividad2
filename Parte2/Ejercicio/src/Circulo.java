public class Circulo {
    int radio;
    Circulo(int x) {
        radio = x;
    }
    double calcArea() {
        return Math.PI*Math.pow(radio, 2);
    }
    double calcPerimetro() {
        return 2 * Math.PI * radio;
    }

}
