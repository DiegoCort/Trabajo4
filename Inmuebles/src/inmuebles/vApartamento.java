
package inmuebles;


public class vApartamento extends InmuebleVivienda {
    
    protected int nPisos;
    
    public vApartamento(int identificadorInmobiliario, int areaMetrosCaudrados, String direccion,
        int nHabitaciones, int nBaños) {
        
        super(identificadorInmobiliario, areaMetrosCaudrados, direccion,
        nHabitaciones, nBaños);
    }
    
    public void ImprimirvApartameno(){
        
        super.ImprimirInmuebleVivienda();
    }
    
}
