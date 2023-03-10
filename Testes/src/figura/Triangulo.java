package figura;

public class Triangulo extends Figura {

    private double base;

    private double altura;

    public Triangulo(double base, double altura, String cor, Tipo tipo) {
        super.setCor(cor);
        super.setTipo(tipo);
        this.base = base;
        this.altura = altura;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    @Override
    public double area() {
        return getBase() * getAltura();
    }
}
