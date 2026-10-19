public class Main {
    public static void main(String[] args) {

        FCardiacas paciente1 = new FCardiacas("Jose Alfonso", "Madrid", 4, 11, 2007);

        int diaActual = 18;
        int mesActual = 10;
        int anoActual = 2026;

        paciente1.mostrarReporte(diaActual, mesActual, anoActual);

    }
}