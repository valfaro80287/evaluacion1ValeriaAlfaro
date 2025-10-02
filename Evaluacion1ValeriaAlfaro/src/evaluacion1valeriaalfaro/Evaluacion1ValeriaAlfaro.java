/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package evaluacion1valeriaalfaro;

import javax.swing.JOptionPane;
/**
 *
 * @author valer
 */
public class Evaluacion1ValeriaAlfaro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre=JOptionPane.showInputDialog("Digite el nombre: ");
        String apellido=JOptionPane.showInputDialog("Digite el primer apellido: ");
        double salario = Integer.parseInt(JOptionPane.showInputDialog("Digite el salario de la persona: "));
        
        double SEM = salario * 0.0925;
        double IVM = salario * 0.0508;
        double ASOE = salario * 0.025;
        
        double impuesto=0;
        
        if (salario >= 922000 || salario < 1352000) { 
            impuesto=(salario - 922000) * 0.10;
        }
        if (salario >= 1352000 || salario < 2373000) {
            impuesto = (salario - 135200) * 0.15;
        }
        if (salario > 2373000) {
            impuesto = (salario - 2373000) * 0.20;
        }
        
        double Total = salario + SEM + IVM + ASOE + impuesto;
        double Total1 = SEM + IVM;
                
        
        JOptionPane.showMessageDialog(null, "En consecuencia, la empresa deberá pagar a la CCSS un total de "+Total);
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar a la CCSS el monto de "+Total1+" por concepto de SEM y IVM.");
        JOptionPane.showMessageDialog(null, "La empresa deberá abonar al gobierno un monto de "+impuesto+" por concepto de impuesto al salario.");
        JOptionPane.showMessageDialog(null, "Para la asociación de la empresa se le asigna un valor de "+ASOE+".");
        JOptionPane.showMessageDialog(null, "El salario del empleado es de "+salario+".");
        
        
    }
    
}
