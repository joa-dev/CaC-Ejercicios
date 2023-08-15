public class Main {

    public static void main(String[] args) {
        Auto focus = new Auto("Ford", "Focus", true, 120);
        Auto cruze = new Auto("Chevrolet", "Cruze", true, 125);
        Auto bora = new Auto("VW", "Bora", true, 140);
        Conductor conductorSinLicencia = new Conductor(false, focus, 10);

        Conductor conductorConLicencia = new Conductor(true, cruze, 5);

        Conductor conductorConLicenciaApurado = new Conductor(true, bora, 20);

        System.out.println("Conductor Sin Licencia y Auto Inseguro: ");
        System.out.println(conductorSinLicencia.esSeguro() + "\n");

        System.out.println("Conductor Con Licencia y Auto Seguro: ");
        System.out.println(conductorConLicencia.esSeguro() + "\n");

        System.out.println("Conductor Con Licencia Apurado: ");
        System.out.println(conductorSinLicencia.esSeguro() + "\n");


    }
}