package problema3;

public class Ejecutor {
        public static void main(String[] args) {
            Automotor Aut1 = new Automotor(1105896472, "Chevrolet");
            Automotor Aut2 = new Automotor(1104475189, 13889.990);
            
            Aut1.establecerAñofabric(2011);
            Aut1.establecerValorVehi(20146.35);
            Aut2.establecerMarca("Toyota");
            Aut2.establecerAñofabric(2015);
            
            Aut1.calcularTiempo();
            Aut1.calcularValorMatric();
            Aut2.calcularTiempo();
            Aut2.calcularValorMatric();
            
            System.out.printf("%s\n", Aut1);
            System.out.printf("%s\n", Aut2);
            
        }
    
}
