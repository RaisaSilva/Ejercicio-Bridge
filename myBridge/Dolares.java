package bridge.myBridge;

public class Dolares implements ICredito {

    int montoBol=50;

    @Override
    public void tipoMoneda(int monto) {
        double montoCambiado =  monto*0.14;
        System.out.println("Cambiando a Euros....");
        System.out.println("Monto en Bolivianos ="+monto+", Dolares="+montoCambiado);
    }

}
