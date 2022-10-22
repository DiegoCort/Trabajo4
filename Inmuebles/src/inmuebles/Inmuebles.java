package inmuebles;

public class Inmuebles {

   protected int identificadorInmobiliario, areaMetrosCaudrados;
   protected String direccion;
   protected double pVenta;
   
   Inmuebles(int identificadorInmobiliario, int areaMetrosCaudrados, String direccion ){
       
       this.areaMetrosCaudrados = areaMetrosCaudrados;
       this.identificadorInmobiliario = identificadorInmobiliario;
       this.direccion = direccion;
    }
   
   double calcularPrecioVenta(double vArea){
       
       pVenta =  areaMetrosCaudrados*vArea;
       return pVenta;    
   }
   
   public void imprimirInmuebles(){
       
       System.out.println("Identiicador inmobiliario = "+ identificadorInmobiliario);
       System.out.println("Area: "+ areaMetrosCaudrados);
       System.out.println("Direccion = " + direccion);
       System.out.println("Precio de venta = $"+ pVenta);
   }
   
   
   
   
    
}
