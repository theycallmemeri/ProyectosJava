package unitat5.apartat1.repte3;



public class CalculsArrayReals {
    public double calcularMaxim(double [] array){
        double max = array [0];
        for (int i = 1; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i]; 
            }
            
        }
        return max;
    }
      public double calcularMinim(double [] array){
        double min = array [0];
        for (int i = 1; i < array.length; i++) {
            if (min < array[i]) {
                min = array[i]; 
            }
            
        }
        return min;
    }
        public double calcularMitjana(double [] array){
        double suma = 0;
        for (int i = 1; i < array.length; i++) {
            
                suma = suma + array[i]; 
            
            
        }
        return suma/array.length;
    }
        public void diferenciaMitjana(double mitjUna, double mitjDos) {
       
        if(mitjUna > mitjDos){
            System.out.println("arrayA té una mitjana mes alta");
        }else if(mitjUna < mitjDos){
            System.out.println("arrayB té una mitjana més baixa");
        }else{
            System.out.println("Les dues mitjanes són iguals");
        }
        
    }
}