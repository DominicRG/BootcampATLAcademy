import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        CalculadoraImc calculadoraImc = new CalculadoraImc();
        calculadoraImc.setContentPane(calculadoraImc.getMainPanel());
        calculadoraImc.setVisible(true);
        calculadoraImc.setBounds(300, 300, 480, 150);
        calculadoraImc.setResizable(false);
        calculadoraImc.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}
