/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajogrupal;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Pais {
    public class ModeloPais {
    private String nombre;
    private int copasGanadas;
    private int nroParticipaciones;
    
    public ModeloPais(String nombre, int copasGanadas, int nroParticipaciones){
        this.nombre= nombre;
        this.copasGanadas= copasGanadas;
        this.nroParticipaciones= nroParticipaciones;
    }
          @Override
    public String toString() {

        return "Nombre: " + nombre +
               "\nCopas: " + copasGanadas +
               "\nParticipaciones: " + nroParticipaciones;
    }
}
}
