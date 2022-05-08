package problema3;

public class Automotor {
    private int cedulaPropietario;
    private String marcaVehiculo;
    private int añoFabricacion;
    private double valorVehiculo;
    private double valorMatricula;
    private int tiempoVehiculo;
    
    public Automotor (int cedProp, String marcaVeh){
        cedulaPropietario = cedProp;
        marcaVehiculo = marcaVeh;
    }
    
    public Automotor (int d, double n){
        cedulaPropietario = d;
        valorVehiculo = n;
    }
    
    
    public void establecerMarca(String c){
        marcaVehiculo = c;
    }
    
    public void establecerAñofabric(int n){
        añoFabricacion = n;
    }
    
    public void establecerValorVehi(double n){
        valorVehiculo = n;
    }
    
    public void calcularTiempo(){
        tiempoVehiculo = (2022 - añoFabricacion);
    }
    
    public void calcularValorMatric(){
        valorMatricula = ((valorVehiculo * 0.00002) * tiempoVehiculo);
    }
    
    public String obtenerMarca(){
        return marcaVehiculo;
    }
    
    public int obtenerAnoFab(){
        return añoFabricacion;
    }
    
    public double obtenerValorVehiculo(){
        return valorVehiculo;
    }
    
    public double obtenerValorMat(){
        return valorMatricula;
    }
    
    @Override
        public String toString() {
        String cadena = String.format("Automotor\n"
                + "Cedula Propietario: %s\n"
                + "Marca Vehiculo: %s\n"
                + "Año fabricacion: %d\n"
                + "Valor Vehiculo: %.2f\n"
                + "Valor Matricula: %.2f\n",
                cedulaPropietario, marcaVehiculo, añoFabricacion, valorVehiculo, valorMatricula);
        return cadena;
        }
    

    
}
