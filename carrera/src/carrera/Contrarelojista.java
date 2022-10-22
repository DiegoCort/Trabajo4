
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
        
        super.ImprimirCiclista();
        System.out.println("Aceleracion Promedio: "+ VelocidadMaxima);
        
    }
    
    String ImprimirTipo() {
        return "Es un contrarelojista";
    }
    
}
