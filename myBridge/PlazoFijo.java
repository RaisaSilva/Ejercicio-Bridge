package bridge.myBridge;

public class PlazoFijo implements ICuenta {

    ICredito credito;
    int montoactual;
    int interes = 5;
    

    @Override
    public void tipoCredito(ICredito cred, int monto) {
        credito = cred;
        montoactual = monto + monto * 5/100;
        System.out.println("Tipo de cuenta: Plazo fijo");
        System.out.println("Interes: "+interes+"%");
        System.out.println("Monto actual de la cuenta plazo fijo es de Bol: "+monto);
        credito.tipoMoneda(montoactual);
    }
}
