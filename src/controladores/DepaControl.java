/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controladores;

import clases.Depa;
import interfaces.IAlquiler;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author l07m01
 */
public class DepaControl implements IAlquiler{
    
     ArrayList <Depa>lstDepa = new ArrayList();
    DefaultTableModel mdlDepa = new  DefaultTableModel();

    public DepaControl() {
    mdlDepa.addColumn ("Cliente");
    mdlDepa.addColumn ("Tipo");
    mdlDepa.addColumn ("Precio");
    }

    @Override
    public void agregar(Depa depa) {
        lstDepa.add(depa);
        JOptionPane.showMessageDialog(null, "Agregado");
       
    }

    @Override
    public DefaultTableModel mostrar() {
     mdlDepa.setNumRows(0);

           for (int i = 0; i<=lstDepa.size()- 1; i++){
            Depa depa= lstDepa.get(i);
            
            Object [] fila = {depa.getNombre(),depa.getTipo(),depa.getPreio()};
            
            mdlDepa.addRow(fila);
        }
       return mdlDepa;
        
    }  
    

    @Override
    public DefaultTableModel mostrar(String tipo) {
       
         mdlDepa.setNumRows(0);
         
           for (int i = 0; i<=lstDepa.size()- 1; i++){
            Depa depa = lstDepa.get(i);
            Object [] fila = {depa.getNombre(),depa.getTipo(),depa.getPreio()};
            
            if(depa.getTipo().equalsIgnoreCase(tipo)){
                  
            mdlDepa.addRow(fila);
        }
           }
       return mdlDepa;
    }
    

    
}
