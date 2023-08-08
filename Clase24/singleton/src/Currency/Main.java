package Currency;

public class Main {
    public static void main(String[] args) {
        float euros =  CurrencyConverter.getInstance().convertirUsdToEur(10);
        System.out.println("Euros: "+euros);
    }
}
