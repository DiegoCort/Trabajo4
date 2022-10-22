
package inmuebles;


public class lOficina extends InmueblesLocales {
    
    protected static double vArea=3500000;
    protected boolean Gobierno;
   
    public lOficina(int identificadorInmobiliario, int areaMetrosCaudrados, String direccion) {
        
        super(identificadorInmobiliario, areaMetrosCaudrados, direccion);
        this.Gobierno = Gobierno;  
    }
    
    public void ImprimirlOficina(){
        
        super.ImprimirInmuebleLocales();
        System.out.println("Es oficina del gobierno: "+ Gobierno);
    }
    
}
