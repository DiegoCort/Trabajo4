
package carrera;

public class Velocista extends Ciclista {
    
    private double PotenciaPromedio, VelocidadPromedio;
    
    public Velocista(int Identificador, String Nombre, double PotenciaPromedio,
        double VelocidadPromedio){
        
        super(Identificador, Nombre);
        PotenciaPromedio = PotenciaPromedio;
        this.VelocidadPromedio = VelocidadPromedio;
    }
    
    protected double getPotenciaPromedio(){
        return PotenciaPromedio;
    }
    
    protected void setPotenciaPromedio(double PotenciaPromedio){
        this.PotenciaPromedio = PotenciaPromedio;
    }
    
    protected double getVelocidadPromedio(){
        return VelocidadPromedio;
    }
    
    protected void setVelocidadPromedio(double VelocidadPromedio){
        this.VelocidadPromedio = VelocidadPromedio;
    }
    
    protected void ImprimirVelocista(){
        super.ImprimirCiclista();
        System.out.println("Potencia Promedio: "+ PotenciaPromedio);
        System.out.println("Velocida promedio: "+ VelocidadPromedio);
    }

    String ImprimirTipo() {
        return "Es un velocista";
    }
    
    
    
}
