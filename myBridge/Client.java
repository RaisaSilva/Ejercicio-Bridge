package bridge.myBridge;

public class Client {
    public static void main (String [] args){

        Euros euros = new Euros();
        Dolares dolares = new Dolares();
        Bolivianos bolivianos = new Bolivianos();

        Ahorro ahorro = new Ahorro();
        PlazoFijo plazoFijo = new PlazoFijo();
        ahorro.tipoCredito(euros, 100);
        System.out.println("--------------------------");
        ahorro.tipoCredito(dolares, 200);
        System.out.println("--------------------------");
        plazoFijo.tipoCredito(euros, 100);
        System.out.println("--------------------------");
        plazoFijo.tipoCredito(dolares, 200);


    }
}
