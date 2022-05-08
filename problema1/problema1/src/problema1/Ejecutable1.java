
package problema1;

public class Ejecutable1 {
    public static void main(String[] args) {
        Notas Prom1 = new Notas("Enrique");
        Notas Prom2 = new Notas ("Luis", 8.75);
        
        Prom1.establecerNota1(7.75);
        Prom1.establecerNota2(8.0);
        Prom1.establecerNota3(8.55);
        
        Prom2.establecerNota2(8.99);
        Prom2.establecerNota3(7.74);
        
        Prom1.calcularPromedio();
        Prom2.calcularPromedio();
        
        System.out.printf("%s\n", Prom1);
        System.out.printf("%s\n", Prom2);
        
        
        
        
        
    }
    
}
