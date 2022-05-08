package problema4;

public class Ejecutor {
    public static void main(String[] args) {
        Cheques Cheque1 = new Cheques ("Ricardo Ortiz", "Banco Pichincha");
        Cheques Cheque2 = new Cheques ("Banco de Loja", 1000.00);
        
        Cheque1.establecerValor(590.55);
        Cheque2.establecerNombreC("Angel Vega");
        
        Cheque1.calcularComision();
        Cheque2.calcularComision();
        
        System.out.printf("%s\n", Cheque1);
        System.out.printf("%s\n", Cheque2);
        
    }

    
}
