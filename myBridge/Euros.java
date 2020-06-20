package bridge.myBridge;

public class Euros implements ICredito {

    @Override
    public void tipoMoneda(int monto) {
        double montoCambiado =  monto*0.13;
        System.out.println("Cambiando a Euros....");
        System.out.println("Monto en Bolivianos ="+monto+", Euros="+montoCambiado);
    }
}
