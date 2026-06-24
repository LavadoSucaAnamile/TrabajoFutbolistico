/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package trabajogrupal;

/**
 *
 * @author LAB-USR-LNORTE
 */
public class Vista {
      public static void main(String[] args) {

        // Grupo A
        Pais p1 = new ais("Alemania", 4, 20);
        Pais p2 = new Pais("Brasil", 5, 22);
        Pais p3 = new Pais("Argentina", 3, 18);
        Pais p4 = new Pais("Espana", 1, 16);

        Grupo grupoA = new Grupo(p1, p2, p3, p4);

        // Grupo B
        ModeloPais p5 = new ModeloPais("Uruguay", 2, 14);
        ModeloPais p6 = new ModeloPais("Colombia", 0, 6);
        ModeloPais p7 = new ModeloPais("Ecuador", 0, 4);
        ModeloPais p8 = new ModeloPais("Paraguay", 0, 8);

       Grupo grupoB = new Grupo(p5, p6, p7, p8);

        Almacenamiento alm = new Almacenamiento(2);

        alm.agregarGrupo(0, grupoA);
        alm.agregarGrupo(1, grupoB);

        alm.imprimirReporte(alm.getListaGrupos());
    }
}

