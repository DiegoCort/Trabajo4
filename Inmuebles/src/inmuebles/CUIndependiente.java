
package inmuebles;
public class CUIndependiente extends cUrbana {
    
    protected static double vArea = 3000000;
    
    public CUIndependiente(int identificadorInmobiliario, int areaMetrosCaudrados, String direccion, 
    int nHabitaciones, int nBaños, int nPisos) {
        super(identificadorInmobiliario, areaMetrosCaudrados, direccion,
        nHabitaciones, nBaños, nPisos);
    }
    
    public void ImprimirCUIndependiente(){
        
        super.ImprimirvUrbana();
    }
}
