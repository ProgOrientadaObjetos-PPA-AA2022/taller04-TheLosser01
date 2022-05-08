package problema2;

public class Ejecutor {
    public static void main(String[] args) {
        Sueldo Sueldo1 = new Sueldo("Kevin", 1105578847);
        Sueldo Sueldo2 = new Sueldo("Andrew", "Torres");
        
        Sueldo1.establecerApellido("Bustamante");
        Sueldo1.establecerSueldoBasico(424.00);
        
        Sueldo2.establecerSueldoBasico(380.75);
        Sueldo2.establecerCedula(1102234785);
        
        Sueldo1.calcularSueldoTotal();
        Sueldo2.calcularSueldoTotal();
        
        System.out.printf("%s\n", Sueldo1);
        System.out.printf("%s\n", Sueldo2);
    }
    
}
