/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajogrupal;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Almacenamiento {
    
    private Grupo[] listaGrupos;
    private int nroGrupos;

    public Almacenamiento(int nroGrupos) {
        this.nroGrupos = nroGrupos;
        listaGrupos = new Grupo[nroGrupos];
    }

    public void agregarGrupo(int pos, Grupo grupo) {
        listaGrupos[pos] = grupo;
    }

    public Grupo[] getListaGrupos() {
        return listaGrupos;
    }

    public void imprimirReporte(Grupo[] grupos) {
        for (int i = 0; i < grupos.length; i++) {
            System.out.println(grupos[i]);
        }
    }

    

}

