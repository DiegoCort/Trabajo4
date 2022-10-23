
package personas;
import java.util.*;
import javax.swing.DefaultListModel;

public class ListaPersonas {

    static void setModel(DefaultListModel modelo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    static int getSelectedIndex() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    Vector ListaPersonas;
    
    public ListaPersonas(){
        ListaPersonas = new Vector();
    }
    
    public void AñadirPersonas(Personas p){
        ListaPersonas.add(p);
    }
    
    public void EliminarPersonas(int i){
        ListaPersonas.removeElementAt(i);
    }
    
    public void BorrarLista(){
        ListaPersonas.removeAllElements();
    }
}
