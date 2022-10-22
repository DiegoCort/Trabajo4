
package animales;
public class prueba {
    
    public static void main(String [] args){
        
        Animales[] animal = new Animales[4];
        animal[1] = new Perro();
        animal[2] = new Lobo();
        animal[3] = new Leon();
        animal[0] = new Gato();
        
        for(int i=0;i<animal.length;i++){
            
            System.out.println(animal[i].getNombreCientifico());
            System.out.println("Sonido: "+ animal[i].getSonido());
            System.out.println("Alimentos: "+ animal[i].getAlimentos());
            System.out.println("Habitad: "+ animal[i].getSHabitad());
            System.out.println("");

        }   
    }
}
