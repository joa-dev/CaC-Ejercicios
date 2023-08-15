public class Auto {
    private String marca;
    private String modelo;
    private boolean ruedaDeAuxilio;
    private int velocidadFinal;

    public Auto(String marca, String modelo, boolean ruedaDeAuxilio, int velocidadFinal) {
        this.marca = marca;
        this.modelo = modelo;
        this.ruedaDeAuxilio = ruedaDeAuxilio;
        this.velocidadFinal = velocidadFinal;
    }

    public boolean esSeguro() {
        if (ruedaDeAuxilio && (velocidadFinal + 5 < 140)) {
            return true;
        } else {
            return false;
        }
    }
}


/*
CONDU
 */