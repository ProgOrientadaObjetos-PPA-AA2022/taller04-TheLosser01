package problema2;

public class Sueldo {
    private String nomProf;
    private String apellProf;
    private double sueldoBasico;
    private double sueldoTotal;
    private int cedula;
    
    public Sueldo(String c, int n){
        nomProf = c;
        cedula = n;
    }
    
    public Sueldo (String nombreProfe, String apellProfe){
        nomProf = nombreProfe;
        apellProf = apellProfe;
    }
    
    public void establecerApellido(String c){
        apellProf = c;
    }
    
    public void establecerSueldoBasico(double n){
        sueldoBasico = n;
    }
    
    public void calcularSueldoTotal(){
        sueldoTotal = (sueldoBasico +(sueldoBasico * 0.20));
    }
    
    public void establecerCedula (int n){
        cedula = n;
    }
    
    public String obtenerApellido(){
        return apellProf;
    }
    
    public double obtenerSueldoBasico(){
        return sueldoBasico;
    }
    
    public double obtenerSueldoTotal(){
        return sueldoTotal;
    }
    
    public int obtenerCedula(){
        return cedula;
    }
    
    @Override
        public String toString() {
        String cadena = String.format("Sueldo Profesor\n"
                + "Nombre: %s\n"
                + "Apellido: %s\n"
                + "Sueldo basico: %.2f\n"
                + "Sueldo total: %.2f\n"
                + "Cedula: %d\n",
                nomProf, apellProf, sueldoBasico, sueldoTotal, cedula);
        return cadena;
    }
    
}
