
package inmuebles;
public class compra {
    
    public static void main(String [] args){
                
        AFamiliar apto1 = new AFamiliar(103067,120,"Avenida Santader 45-45",
        3, 2, 200000);
        System.out.println("DATOS APARTAMENTO");
        apto1.calcularPrecioVenta(apto1.vArea);
        apto1.ImprimirAFamiliar();
        
        System.out.println("");
        System.out.println("DATOS APARTAMENTO");
        AApartaestudio apto2 = new AApartaestudio(12345, 50, "Avenida Caracas 30-15", 1,1);
        apto2.calcularPrecioVenta(apto2.vArea);
        apto2.ImprimirAApartaestudio();
        
        
        
        
    }
    
}
