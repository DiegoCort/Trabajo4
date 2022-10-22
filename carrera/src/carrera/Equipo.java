
package carrera;
import java.util.*;

public class Equipo {
    
    private String Nombre, Pais;
    private static double TiempoTotal;
    Vector ListaCiclistas;
    
    public Equipo(String Nombre, String Pais){
        
        this.Nombre = Nombre;
        this.Pais = Pais;
        TiempoTotal = 0;
        ListaCiclistas = new Vector();
    }
    
    public String getNombre(){
        return Nombre;
    }
    
    public void setNombre(String Nombre){
        this.Nombre = Nombre;
    }
    
    public String getPais(){
        return Pais;
    }
    
    public void setPais(String Pais){
        this.Pais = Pais;
    }
    
    public void añadirCiclista(Ciclista Ciclista){
        
        ListaCiclistas.add(Ciclista);
    }
    
    public void listarEquipo(){
        
        for(int i=0;i<ListaCiclistas.size();i++){
            
            Ciclista c = (Ciclista)ListaCiclistas.elementAt(i);
            System.out.println(c.getNombre());
        }   
    }
    
    public void buscarCiclista(){
        
        Scanner entrada = new Scanner(System.in);
        String NombreCiclista = entrada.next();
        for(int i =0;i<ListaCiclistas.size();i++){
            
            Ciclista c = (Ciclista)ListaCiclistas.elementAt(i);
            if(c.getNombre().equals(NombreCiclista)){
                
                System.out.println(c.getNombre());
            }
        }
    }
    
    public void TotalTiempo(){
        
        for(int i=0;i<ListaCiclistas.size();i++){
            Ciclista c = (Ciclista)ListaCiclistas.elementAt(i);
            TiempoTotal = TiempoTotal+c.getTiempoAcumulado();
        }
    }
    
    public void ImprimirEquipo(){
        
        System.out.println("Nombre del equipo: " + Nombre);
        System.out.println("Pais: " + Pais);
        System.out.println("Totla tiempo de equipo: "+ TiempoTotal);
    }
    
}
