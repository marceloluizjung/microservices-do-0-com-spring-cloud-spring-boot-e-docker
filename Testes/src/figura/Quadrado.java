package figura;

public class Quadrado extends Retangulo {

    public Quadrado(double lado1, double lado2, String cor) {
        super(lado1, lado2, cor);
    }

    @Override
    public double area() {
        return getLado1() * getLado1();
    }
}
