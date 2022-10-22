
package carrera;


public class Contrarelojista extends Ciclista {

    public double VelocidadMaxima;
    
    public Contrarelojista(int Identificador, String Nombre,
            double VelocidadMaxima) {
        super(Identificador, Nombre);
        this.VelocidadMaxima = VelocidadMaxima;
    }

    protected double getVelocidaMaxima(){
        return VelocidadMaxima;
    }
    
    protected void setVelocidadMaxima(double VelocidadMaxima){
        this.VelocidadMaxima = VelocidadMaxima;
    }
    
    public void ImprimirContrarelojista(){
        
    }
    
    
    
    
    
    
    
    
    
    
    
    String ImprimirTipo() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
