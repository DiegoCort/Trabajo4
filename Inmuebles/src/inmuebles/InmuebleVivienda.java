
package inmuebles;
public class InmuebleVivienda extends Inmuebles {
    
    protected int nHabitaciones, nBaños;
    
    public InmuebleVivienda(int identificadorInmobiliario, int areaMetrosCaudrados, 
            String direccion, int nHabitaciones, int nBaños) {
        super(identificadorInmobiliario, areaMetrosCaudrados, direccion);
        
        this.nHabitaciones = nHabitaciones;
        this.nBaños = nBaños;
    }

    public void ImprimirInmuebleVivienda(){
        
        super.imprimirInmuebles();
        System.out.println("Numero de habitaciones: "+ nHabitaciones);
        System.out.println("Numero de baños"+ nBaños);
    }
    
}
