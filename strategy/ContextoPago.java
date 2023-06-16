package strategy;

public class ContextoPago {

    //La estrategia por defecto es MercadoPago
    private EstrategiaPago estrategia = new EstrategiaMercadoPago();

    public EstrategiaPago getEstrategia() {
        return estrategia;
    }

    public void setEstrategia (EstrategiaPago estrategia) {
        this.estrategia = estrategia;
    }

    public void ejecutar () {
        estrategia.ejecutarAlgoritmo();
    }
}