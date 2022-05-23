/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author usuario
 */
public class Jugador extends Futbolista {

    public short golesMarcados;
    public byte dorsal;
    
    
    
    public Jugador(String nombre, int edad, String posicion, short golesMarcados, byte dorsal) {
        super(nombre, edad, posicion);
        this.golesMarcados = golesMarcados;
        this.dorsal = dorsal;
    }
    

    public Jugador() {
        super();
        this.golesMarcados = 289;
        this.dorsal = 7;
    }

    @Override
    public int compareTo(Object f) {
        return Math.abs(this.getEdad() - ((Jugador) f).getEdad());
    }
    
    @Override
    public String toString() {
        return "El futbolista " + super.getNombre() + " tiene " + super.getEdad()  + ", y" + " juega de " + super.getPosicion() + " con el dorsal " + dorsal + ". Ha marcado " + golesMarcados; 
    }
   
    
    
    @Override
    public boolean jugarConLasManos() {
       return false;
        }
        

}
