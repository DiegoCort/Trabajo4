
package inmuebles;


public class CUConjuntoCerrado extends cUrbana {
    
    protected int vAdministracion;
    protected boolean tPiscina, aComunes;
    protected static double vArea = 2500000;
    
    public CUConjuntoCerrado(int identificadorInmobiliario, int areaMetrosCaudrados, String direccion, int nHabitaciones, int nBaños, int nPisos,
        int vAdminidtracion, boolean tPiscina, boolean aComunes) {
        
        super(identificadorInmobiliario, areaMetrosCaudrados, direccion, nHabitaciones, nBaños, nPisos);
        this.aComunes =  aComunes;
        this.tPiscina = tPiscina;
        this.vAdministracion = vAdministracion;
        
    }
    
    public void ImprimirCUConjuntoCerrado(){
        
        super.ImprimirvUrbana();
        System.out.println("Valor de administracion: $"+ vAdministracion);
        System.out.println("¿Tiene piscina?: "+ tPiscina);
        System.out.println("¿Tiene areas comnunes: "+ aComunes);
    }
    
}
