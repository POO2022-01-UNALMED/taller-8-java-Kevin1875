/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package futbol;

/**
 *
 * @author usuario
 */
public class Portero extends Futbolista{
    
    public short golesRecibidos;
    public byte dorsal;

    public Portero(String nombre, int edad, short golesRecibidos, byte dorsal) {
        super(nombre, edad, "Portero");
        this.golesRecibidos = golesRecibidos;
        this.dorsal = dorsal;
    }
    
    
    @Override
    public String toString() {
        return "El futbolista " + super.getNombre() + " tiene " + super.getEdad()  + ", y" + " juega de " + super.getPosicion() + " con el dorsal " + dorsal + ". Le han marcado " + golesRecibidos; 
    }
    
    
    @Override
    public int compareTo(Object p) {
        return Math.abs(this.golesRecibidos - ((Portero) p).golesRecibidos);
    }
    
    
    @Override
    public boolean jugarConLasManos() { 
        return true;
    
    }

    public short getGolesRecibidos() {
        return golesRecibidos;
    }

    public byte getDorsal() {
        return dorsal;
    }

    public void setGolesRecibidos(short golesRecibidos) {
        this.golesRecibidos = golesRecibidos;
    }

    public void setDorsal(byte dorsal) {
        this.dorsal = dorsal;
    }
    
    
    
   
    
}
