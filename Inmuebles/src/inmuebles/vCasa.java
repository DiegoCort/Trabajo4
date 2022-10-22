
package inmuebles;


public class vCasa extends InmuebleVivienda {
    
    protected int nPisos;
    
    public vCasa(int identificadorInmobiliario, int areaMetrosCaudrados, String direccion,
    int nHabitaciones, int nBaños, int nPisos) {
        super(identificadorInmobiliario, areaMetrosCaudrados, direccion,
        nHabitaciones, nBaños);
       
        this.nPisos = nPisos;   
    }
    
    public void ImprimirvCasa(){
        
        super.ImprimirInmuebleVivienda();
        System.out.println("Numero de pisos: "+ nPisos);
    }
}
