public class Conductor {
    private boolean registroDeConducir;
    private Auto auto;
    private int plusVelocidad;

    public Conductor(boolean registroDeConducir, Auto auto, int plusVelocidad) {
        this.registroDeConducir = registroDeConducir;
        this.auto = auto;
        this.plusVelocidad = plusVelocidad;
    }

    public boolean esSeguro() {
        if (registroDeConducir && auto.esSeguro()) {
            return true;
        } else {
            return false;
        }
    }

    public int getPlusVelocidad() {
        return plusVelocidad;
    }
}
