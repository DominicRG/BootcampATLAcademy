package Currency;

public class CurrencyConverter {

    private static CurrencyConverter instance;

    private CurrencyConverter(){}

    public static CurrencyConverter getInstance(){
        if(instance == null){
            instance = new CurrencyConverter();
        }
        return instance;
    }

    public float convertirUsdToEur(float dolares){
        return dolares * 0.91f;
    }

    public float convertirEurToUsd(float euros){
        return euros * 1.10f;
    }
}
