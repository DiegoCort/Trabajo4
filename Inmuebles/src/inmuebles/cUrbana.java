
package inmuebles;


public class cUrbana extends vCasa {

    public cUrbana(int identificadorInmobiliario, int areaMetrosCaudrados, String direccion,
        int nHabitaciones, int nBaños, int nPisos) {
        
        super(identificadorInmobiliario, areaMetrosCaudrados, direccion,
        nHabitaciones, nBaños, nPisos);  
    }
    
    public void ImprimirvUrbana(){
        
        super.ImprimirvCasa();
    }


    
}
