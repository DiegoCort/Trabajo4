package carrera;

public class Carrera{
    
    public static void main(String[] args){
        
        Equipo E1 = new Equipo("Sky","Estados Unidos");
        Velocista V1 = new Velocista(123979, "Gerain Thomas",
        320, 25);
        Escalador Es1 = new Escalador(123980, "Egan Bernal", 
        25, 10);
        Contrarelojista C1 = new Contrarelojista(123981, "Jonathan Castroviejo",
        120);
        E1.añadirCiclista(V1);
        E1.añadirCiclista(Es1);
        E1.añadirCiclista(C1);
        V1.setTiempoAcumulado(365);
        Es1.setTiempoAcumulado(385);
        C1.setTiempoAcumulado(370);
        E1.TotalTiempo();
        E1.ImprimirEquipo();
        E1.listarEquipo();
        
    }
         
}