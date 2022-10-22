
package inmuebles;
public class lComerciales extends InmueblesLocales {
    
    protected static double vArea=3000000;
    protected String cComercial;
    
    public lComerciales(int identificadorInmobiliario, int areaMetrosCaudrados, String direccion) {
        super(identificadorInmobiliario, areaMetrosCaudrados, direccion);
       
        this.cComercial = cComercial;
    }
    
    public void ImprimirlCasa(){
        
        super.ImprimirInmuebleLocales();
        System.out.println("Centro comercial: "+ cComercial);
    }
    
}
