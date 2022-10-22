
package inmuebles;


public class AFamiliar extends vApartamento{
    
    protected static double vArea = 2000000;
    protected int vAdministracion;
    
    public AFamiliar(int identificadorInmobiliario, int areaMetrosCaudrados, String direccion, 
    int nHabitaciones, int nBaños, int vAdministracion) {
        
        super(identificadorInmobiliario, areaMetrosCaudrados, direccion,
        nHabitaciones, nBaños);
        this.vAdministracion = vAdministracion;
    }
    
    public void ImprimirAFamiliar(){
        super.ImprimirvApartameno();
        System.out.println("Valor de administracion: "+ vAdministracion);
    }
            
    
}
