package figuras;

public class Circulo implements FiguraGeometrica{

    private float radio;

    public float getRadio() {
        return radio;
    }

    public void setRadio(float radio) {
        this.radio = radio;
    }

    @Override
    public float calcularArea() {
        return (float) Math.PI * (radio * radio);
    }
}
