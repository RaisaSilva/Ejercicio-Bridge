package bridge.myBridge;

public class Ahorro implements ICuenta {

    ICredito credito;
    int interes = 2;
    int montoactual;

    @Override
    public void tipoCredito(ICredito cred, int monto) {
        credito = cred;
        montoactual = monto + monto * 2/100;
        System.out.println("Tipo de cuenta: Ahorros");
        System.out.println("Interes: "+interes+"%");
        System.out.println("Monto actual de la cuenta de ahorros es Bol: "+montoactual);
        credito.tipoMoneda(montoactual);

    }
}
