import javax.swing.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class CalculadoraImc extends JFrame{
    private JButton btnCalcular;
    private JTextField txtaltura;
    private JTextField txtpeso;
    private JLabel lblIMC;
    private JPanel MainPanel;

    public CalculadoraImc() {
        btnCalcular.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                calcularIMC();
            }
        });
    }

    public void calcularIMC(){
        //peso / (altura * altura)
        float peso = Float.parseFloat(txtpeso.getText());
        float altura = Float.parseFloat((txtaltura.getText()));
        float imc = peso / (altura * altura);

        String estado = "";

        if(imc<16.00){
            estado="Infrapeso: Delgadez Severa";
        }else if(imc<=16.00 || imc<=16.99){
            estado="Infrapeso: Delgadez moderada";
        }else if(imc<=17.00 ||imc<=18.49){
            estado="Infrapeso: Delgadez aceptable";
        }else if(imc<=18.50 || imc<=24.99){
            estado="Peso Normal";
        }else if(imc<=25.00 || imc<=29.99){
            estado="Sobrepeso";
        }else if(imc<=30.00 || imc<=34.99){
            estado="Obeso: Tipo I";
        }else if(imc<=35.00 || imc==40.00){
            estado="Obeso: Tipo III";
        }else{
            estado="no existe clasificacion";
        }

        lblIMC.setText(imc + ", " + estado + ".");
    }

    public JButton getBtnCalcular() {
        return btnCalcular;
    }

    public void setBtnCalcular(JButton btnCalcular) {
        this.btnCalcular = btnCalcular;
    }

    public JTextField getTxtaltura() {
        return txtaltura;
    }

    public void setTxtaltura(JTextField txtaltura) {
        this.txtaltura = txtaltura;
    }

    public JTextField getTxtpeso() {
        return txtpeso;
    }

    public void setTxtpeso(JTextField txtpeso) {
        this.txtpeso = txtpeso;
    }

    public JLabel getLblIMC() {
        return lblIMC;
    }

    public void setLblIMC(JLabel lblIMC) {
        this.lblIMC = lblIMC;
    }

    public JPanel getMainPanel() {
        return MainPanel;
    }

    public void setMainPanel(JPanel mainPanel) {
        MainPanel = mainPanel;
    }
}
