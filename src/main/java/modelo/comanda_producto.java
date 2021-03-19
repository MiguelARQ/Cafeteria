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
public class comanda_producto {
    
    //VARIABLES
    private int id_comanda_producto;
    private int cantidad;
    private double total_producto;
    private int id_producto;
    
    //GETTERS Y SETTERS

    public int getId_comanda_producto() {
        return id_comanda_producto;
    }

    public void setId_comanda_producto(int id_comanda_producto) {
        this.id_comanda_producto = id_comanda_producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public double getTotal_producto() {
        return total_producto;
    }

    public void setTotal_producto(double total_producto) {
        this.total_producto = total_producto;
    }

    public int getId_producto() {
        return id_producto;
    }

    public void setId_producto(int id_producto) {
        this.id_producto = id_producto;
    }
    
}
