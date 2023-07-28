package animales;

public class Main {
    public static void main(String[] args) {
        Gorrion gorrion = new Gorrion();
        gorrion.aletear();
        gorrion.planear();

        PezBetta pezBetta = new PezBetta();
        pezBetta.nadar();

        Ave ave = gorrion;
        Volador volador = gorrion;

        Pato pato = new Pato();
        Volador volador1 = pato;
        Nadador nadador = pato;
    }
}
