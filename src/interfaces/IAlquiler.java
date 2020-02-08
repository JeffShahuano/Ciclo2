/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import clases.Depa;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author l07m01
 */
public interface IAlquiler {
    
    public void agregar (Depa depa);
    public DefaultTableModel mostrar ();
    public DefaultTableModel mostrar( String tipo);
  
}
