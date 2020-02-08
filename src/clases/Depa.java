/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

/**
 *
 * @author l07m01
 */
public class Depa {
    
    private String nombre;
    private String tipo;
    private double preio;

    public Depa() {
    }

    public Depa(String nombre, String tipo, double preio) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.preio = preio;
    }

    public double getPreio() {
        return preio;
    }

    public void setPreio(double preio) {
        this.preio = preio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    
    public double hallarPrecio(){
        double precio = 0;
        if(tipo.equalsIgnoreCase("Habitación")){
            precio = 350;
        }
         if(tipo.equalsIgnoreCase("Mini Depa")){
            precio = 800;
        }
          if(tipo.equalsIgnoreCase("Departamento")){
            precio = 1200;
        }
       return precio;
    }
    
    
}
