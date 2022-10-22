
package inmuebles;
public class InmueblesLocales extends Inmuebles {
    
    enum tipo {INTERNO,CALLE};
    protected tipo tLocal;
    public InmueblesLocales(int identificadorInmobiliario, int areaMetrosCaudrados, String direccion) {
        
        super(identificadorInmobiliario, areaMetrosCaudrados, direccion);
        this.tLocal = tLocal;
    }
    
    public void ImprimirInmuebleLocales(){
        
        super.imprimirInmuebles();
        System.out.println("Tipo de local = "+ tLocal);
    }
    
}
