/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.intsuperior.vista;

import ec.edu.intsuperior.modelo.*;
import javax.swing.JOptionPane;

/**
 *
 * @author Santiago
 */
public class Aplicacion {
    public static void main(String[] args) {
        Empleado e= new Empleado();
        e.setNombre(JOptionPane.showInputDialog("Ingresa tu nombre"));
        JOptionPane.showMessageDialog(null, e.toString());
        Cliente c= new Cliente();
        c.setNombre(JOptionPane.showInputDialog("Ingresa un nombre del cliente:"));
        JOptionPane.showMessageDialog(null, c.toString());
    }
    
}
