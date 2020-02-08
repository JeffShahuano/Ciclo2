/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.Date;

/**
 *
 * @author l07m01
 */
public class Auto {
    
    private String cliente;
    private String marca;
    private int anoFab;
    private Date fechaCompra;
    private double precio;

    public Auto() {
    }

    public Auto(String cliente, String marca, int anoFab, Date fechaCompra, double precio) {
        this.cliente = cliente;
        this.marca = marca;
        this.anoFab = anoFab;
        this.fechaCompra = fechaCompra;
        this.precio = precio;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getAnoFab() {
        return anoFab;
    }

    public void setAnoFab(int anoFab) {
        this.anoFab = anoFab;
    }

    public Date getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(Date fechaCompra) {
        this.fechaCompra = fechaCompra;
    }
    
    public double hallarPrecio(){ 
      double precio = 0;
      
     if(marca.equalsIgnoreCase("Nissan Sentra")){
         precio = 35000;
     }
       if(marca.equalsIgnoreCase("Suzuki Selerio")){
         precio = 38000;
    }
      if(marca.equalsIgnoreCase("Mazda 3")){
         precio = 49000;
      }
    return precio;
}
    
    
    
    
    
}