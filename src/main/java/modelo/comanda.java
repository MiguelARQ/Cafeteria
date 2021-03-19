/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author MiguelAngel
 */
public class comanda {
    
    //VARIABLES
    private int id_comanda;
    private String no_comanda;
    private int id_producto;
    private int fecha;
    
    //GETTERS Y SETTERS

    public int getId_comanda() {
        return id_comanda;
    }

    public void setId_comanda(int id_comanda) {
        this.id_comanda = id_comanda;
    }

    public String getNo_comanda() {
        return no_comanda;
    }

    public void setNo_comanda(String no_comanda) {
        this.no_comanda = no_comanda;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }

    public int getFecha() {
        return fecha;
    }

    public void setFecha(int fecha) {
        this.fecha = fecha;
    }
    
}
