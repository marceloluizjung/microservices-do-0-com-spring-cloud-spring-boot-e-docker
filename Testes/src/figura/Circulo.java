package figura;

public class Circulo extends Figura {

    private double raio;

    public Circulo(double raio, String cor) {
        super.setCor(cor);
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return  getRaio() * 3.14 * 2;
    }

    public double getDiametro() {
        return getRaio() * 2;
    }
}
