
package inmuebles;

public class AApartaestudio extends vApartamento {
    
    protected static double vArea=1500000;
    public AApartaestudio(int identificadorInmobiliario, int areaMetrosCaudrados, String direccion, 
        int nHabitaciones, int nBaños) {
        
        super(identificadorInmobiliario, areaMetrosCaudrados, direccion, 
        1, 1);
    }
    
    public void ImprimirAApartaestudio(){
        
        super.ImprimirvApartameno();
    }   
}
