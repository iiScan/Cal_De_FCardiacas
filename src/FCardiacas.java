public class FCardiacas {
    private String primerNombre;
    private String apellido;
    private int diaNacimiento;
    private int mesNacimiento;
    private int anoNacimiento;

    public FCardiacas(String primerNombre, String apellido, int diaNacimiento, int mesNacimiento, int anoNacimiento) {
        this.primerNombre = primerNombre;
        this.apellido = apellido;
        this.diaNacimiento = diaNacimiento;
        this.mesNacimiento = mesNacimiento;
        this.anoNacimiento = anoNacimiento;
    }

    public String getPrimerNombre() { return primerNombre; }
    public void setPrimerNombre(String primerNombre) { this.primerNombre = primerNombre; }

    public String getApellido() { return apellido; }
    public void setApellido(String apellido) { this.apellido = apellido; }

    public int getDiaNacimiento() { return diaNacimiento; }
    public void setDiaNacimiento(int diaNacimiento) { this.diaNacimiento = diaNacimiento; }

    public int getMesNacimiento() { return mesNacimiento; }
    public void setMesNacimiento(int mesNacimiento) { this.mesNacimiento = mesNacimiento; }

    public int getAnoNacimiento() { return anoNacimiento; }
    public void setAnoNacimiento(int anoNacimiento) { this.anoNacimiento = anoNacimiento; }


    public int calcularEdad(int diaActual, int mesActual, int anoActual) {
        int edad = anoActual - this.anoNacimiento;
        if (mesActual < this.mesNacimiento || (mesActual == this.mesNacimiento && diaActual < this.diaNacimiento)) {
            edad--;
        }

        return edad;
    }

    public int calcularFrecuenciaMaxima(int edad) {
        return 220 - edad;
    }

    public double calcularRangoEsperadoMinimo(int frecuenciaMaxima) {
        return frecuenciaMaxima * 0.50;
    }

    public double calcularRangoEsperadoMaximo(int frecuenciaMaxima) {
        return frecuenciaMaxima * 0.85;
    }

    public void mostrarReporte(int diaActual, int mesActual, int anoActual) {
        int edad = calcularEdad(diaActual, mesActual, anoActual);
        int frecMaxima = calcularFrecuenciaMaxima(edad);

        System.out.println("==================================================");
        System.out.println("REPORTE DE FRECUENCIA CARDÍACA");
        System.out.println("Paciente: " + primerNombre + " " + apellido);
        System.out.println("Fecha de nacimiento: " + diaNacimiento + "/" + mesNacimiento + "/" + anoNacimiento);
        System.out.println("Edad calculada: " + edad + " anos");
        System.out.println("--------------------------------------------------");
        System.out.println("Frecuencia Cardíaca Máxima: " + frecMaxima + " lpm.");
        System.out.println("Rango de Frecuencia Esperada:");
        System.out.println("-> Mínimo: " + calcularRangoEsperadoMinimo(frecMaxima) + " lpm.");
        System.out.println("-> Máximo: " + calcularRangoEsperadoMaximo(frecMaxima) + " lpm.");
    }
}