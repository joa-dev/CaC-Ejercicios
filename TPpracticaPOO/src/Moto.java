public class Moto {
    private int velocidadFinal;
    private int espejos;

    public Moto(int velocidadFinal, int espejos) {
        this.espejos = espejos;
        this.velocidadFinal = velocidadFinal;
    }

    public boolean esSeguro() {
        if (espejos >= 2 && velocidadFinal <= 160) {
            return true;
        } else {
            return false;
        }
    }
}
