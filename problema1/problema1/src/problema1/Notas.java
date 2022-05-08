
package problema1;
    
public class Notas {
        private String nombreEstudiante;
        private double nota1;
        private double nota2;
        private double nota3;
        private double promedio;
        
        public Notas (String m){
            nombreEstudiante = m;
        }
        
        public Notas (String nombre, double mat1){
            nombreEstudiante = nombre;
            nota1 = mat1;
        }
        
        public void establecerNota1(double n){
            nota1 = n;
            
        }
        public void establecerNota2(double n){
            nota2 = n;
        }  
        
        public void establecerNota3(double n){
            nota3 = n;
        }
        public void calcularPromedio(){
            promedio = ((nota1 + nota2 + nota3 )/ 3);
        }
        
        
        public double obtenerNota1(){
            return nota1;
        }
        
        public double obtenerNota2(){
            return nota2;
        }
        
        public double obtenerNota3(){
            return nota3;
        }
        
        public double obtenerPromedio(){
            return promedio;
        }
        
        @Override
        public String toString() {
        String cadena = String.format("Promedio estudiante\n"
                + "Nombre estudiante: %s\n"
                + "Materia 1: %.2f\n"
                + "Materia 2: %.2f\n"
                + "Materia 3: %.2f\n"
                + "Promedio: %.2f\n",
                nombreEstudiante, nota1, nota2, nota3, promedio);
        return cadena;
    }
                
    
}
