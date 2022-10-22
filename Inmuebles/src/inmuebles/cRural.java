
package inmuebles;


public class cRural extends vCasa {
    
    protected static double vArea = 1500000;
    protected int dMunicipio, altura;
    
    public cRural(int identificadorInmobiliario, int areaMetrosCaudrados, String direccion,
        int nHabitaciones, int nBaños, int nPisos, int dMunicipio, int altura) {
        
        super(identificadorInmobiliario, areaMetrosCaudrados, direccion,
        nHabitaciones, nBaños, nPisos);
        this.altura = altura;
        this.dMunicipio = dMunicipio;
    }
    
    public void ImprimircRural(){
        
        super.ImprimirvCasa();
        System.out.println("Distancia a cabecera Municipal: "+ dMunicipio);
        System.out.println("Atura sobre nivel del mar: "+ altura);
    }
    
}
