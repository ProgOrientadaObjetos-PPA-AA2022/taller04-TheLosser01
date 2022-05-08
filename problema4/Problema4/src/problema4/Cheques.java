package problema4;

public class Cheques {
    private String nombreCliente;
    private String nombreBanco;
    private double valor;
    private double comision;
    
    public Cheques (String nomC, String nomB){
        nombreCliente = nomC;
        nombreBanco = nomB;
    }
    
    public Cheques (String c, double n){
        nombreBanco = c;
        valor = n;
    }
    
    public void establecerNombreC (String c){
        nombreCliente = c;
    }
    
    public void establecerValor (double n){
        valor = n;
    }
    
    
    public void calcularComision(){
        comision = (valor * 0.00003);
    }
    
    public String obtenerNombreC(){
        return nombreCliente;
    }
    
    public double obtenerValor(){
        return valor;
    }
    
    public double obtenerComision(){
        return comision;
    }
    
    @Override
        public String toString() {
        String cadena = String.format("Cheque\n"
                + "Nombre del Cliente: %s\n"
                + "Nombre del Banco: %s\n"
                + "Valor del cheque: %.2f\n"
                + "Comision: %.2f\n",
                nombreCliente, nombreBanco, valor, comision);
        return cadena;
        }
    
    
    
}
    

