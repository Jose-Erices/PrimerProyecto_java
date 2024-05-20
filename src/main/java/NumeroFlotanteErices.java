public class NumeroFlotanteErices {

    public static void main(String[] args) {
        // número de tipo float
        float numeroFlotante = 123.456f;

        // número flotante original
        System.out.println("Número flotante original: " + numeroFlotante);

        // Extraemos la parte entera del número flotante
        int parteEntera = (int) numeroFlotante;

        // Mostramos la parte entera del número flotante
        System.out.println("Parte entera: " + parteEntera);

        // Extraemos la parte decimal del número flotante
        float parteDecimal = numeroFlotante - parteEntera;

        // Mostramos la parte decimal del número flotante
        System.out.println("Parte decimal: " + parteDecimal);
    }
}