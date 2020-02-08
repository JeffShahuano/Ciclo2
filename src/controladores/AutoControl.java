/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import clases.Auto;
import interfaces.IAuto;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author l07m01
 */
public class AutoControl implements IAuto{
    
     ArrayList <Auto>lstAuto = new ArrayList();
    DefaultTableModel mdlAuto = new  DefaultTableModel();

    public AutoControl() {
    mdlAuto.addColumn ("Cliente");
    mdlAuto.addColumn ("Marca");
    mdlAuto.addColumn ("Año Fab.");
    mdlAuto.addColumn ("Fecha Compra");
    mdlAuto.addColumn ("Precio");
    }

    @Override
    public void agregar(Auto auto) {
       lstAuto.add(auto);
        JOptionPane.showMessageDialog(null, "Agregado");
    }

    @Override
    public DefaultTableModel mostrar() {
          mdlAuto.setNumRows(0);
          SimpleDateFormat f = new SimpleDateFormat ("dd/MM/yyyy");
          
           for (int i = 0; i<=lstAuto.size()- 1; i++){
            Auto auto = lstAuto.get(i);
            
            Object [] fila = {auto.getCliente(),auto.getMarca(),auto.getAnoFab(),f.format(auto.getFechaCompra()),auto.getPrecio()};
            
            mdlAuto.addRow(fila);
        }
       return mdlAuto;
        
    }
    

    @Override
    public DefaultTableModel mostrarNissanSentra() {
       mdlAuto.setNumRows(0);
          SimpleDateFormat f = new SimpleDateFormat ("dd/MM/yyyy");
          
           for (int i = 0; i<=lstAuto.size()- 1; i++){
            Auto auto = lstAuto.get(i);
            Object [] fila = {auto.getCliente(),auto.getMarca(),auto.getAnoFab(),f.format(auto.getFechaCompra()),auto.getPrecio()};
            
            if(auto.getMarca().equalsIgnoreCase("Nissan Sentra")){
                  
            mdlAuto.addRow(fila);
        }
           }
       return mdlAuto;
        
    }       

    @Override
    public int cantidadMazda3() {
        int cantidad  = 0;
        
        for (int i = 0; i<=lstAuto.size()- 1; i++){
            Auto auto = lstAuto.get(i);
            
            if(auto.getMarca().equalsIgnoreCase("Mazda 3")){
                cantidad++;
            }

    }
   
    return cantidad; 
    
}
}

