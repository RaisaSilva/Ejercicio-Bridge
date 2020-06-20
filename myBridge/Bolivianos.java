package bridge.myBridge;

public class Bolivianos implements ICredito {

    int montoBol=50;

    @Override
    public void tipoMoneda(int monto) {
        double montoCambiado =  montoBol;
        System.out.println("Monto en Bolivianos ="+monto);
        }
    }

