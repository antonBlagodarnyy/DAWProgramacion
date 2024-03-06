/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maquinaria;

/**
 *
 * @author martarobina
 */
class Vagon {

    int numIdentificativo;
    int cargaMax;
    int cargaActual;
    String mercancia;

    public Vagon(int numIdentificativo, int cargaMax, int cargaActual, String mercancia) {
        this.numIdentificativo = numIdentificativo;
        this.cargaMax = cargaMax;
        this.cargaActual = cargaActual;
        this.mercancia = mercancia;
    }

    public void mostrarInformación() {
       /* System.out.println(this.numIdentificativo);
        System.out.println(this.mercancia);
*/
       this.toString();

    }

    @Override
    public String toString() {
        return "Vagon{" + "numIdentificativo=" + numIdentificativo + ", cargaMax=" + cargaMax + ", cargaActual=" + cargaActual + ", mercancia=" + mercancia + '}';
    }

}
