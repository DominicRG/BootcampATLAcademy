package animales;

public class Pato extends Ave implements Nadador{
    @Override
    public void aletear() {
        System.out.println("Aletea bien");
    }

    @Override
    public void planear() {
        System.out.println("Mas o menos");
    }

    @Override
    public void nadar() {
        System.out.println("Nada bien");
    }
}
