
package carrera;

public abstract class Ciclista {
    
    private int Identificador, TiempoAcumulado=0;
    private String Nombre;
    
    public Ciclista(int Identificador, String Nombre){
        
        this.Identificador = Identificador;
        this.Nombre = Nombre;
    }
    
    abstract String ImprimirTipo();
    
    protected int getIdentificador(){
        return Identificador;
    }
    
    protected void setIdentificador(){
        this.Identificador = Identificador;
    }
    
    protected String getNombre(){
        return Nombre;
    }
    
    protected void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    protected int getPosicionGeneral(int PosicionGeneral){
        return PosicionGeneral;
    }
    
    protected void setPosicionGeneral(int PosicionGeneral){
        PosicionGeneral = PosicionGeneral;
    }
    
    protected int getTiempoAcumulado(){
        return TiempoAcumulado;
    }
    
    protected void setTiempoAcumulado(int TiempoAcumulado){
        this.TiempoAcumulado = TiempoAcumulado;
    }
    
    public void ImprimirCiclista(){
        
        System.out.println("Identificador: "+ Identificador);
        System.out.println("Nombre: "+ Nombre);
        System.out.println("Tiempo Acumulado: "+ TiempoAcumulado);
    }
}
