package musica;

public class Main {
    public static void main(String[] args) {
        Guitarra guitarra = new Guitarra();
        Piano piano = new Piano();

        guitarra.tocar();
        piano.tocar();
    }
}
