
package carrera;

public class Escalador extends Ciclista {
    
    private double AceleracionPromedio, GradoRampa;
    
    public Escalador(int Identificador, String Nombre, double AceleracionPromedio,
    double GradoRampa) {
        
        super(Identificador, Nombre);
        this.AceleracionPromedio = AceleracionPromedio;
        this.GradoRampa = GradoRampa;
    }
    
    protected double getAceleracionPromedio(){
        return AceleracionPromedio;
    }
    
    protected void setAceleracionPromedio(double AceleracionPromedio){
        this.AceleracionPromedio = AceleracionPromedio;
    }
    
    protected double getGradoRampa(){
        return GradoRampa;
    }
    
    protected void setGradoRampa(double GradoRampa){
        this.GradoRampa = GradoRampa;
    }

    protected void ImprimirEscalador(){
        super.ImprimirCiclista();
        System.out.println("AceleracionPromedio: "+ AceleracionPromedio);
        System.out.println("Grado de Rampa: "+ GradoRampa);
    }
    
    String ImprimirTipo() {
        return "Es un escalador";
    }
}
