/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuentasbancarias;
import Cuentas.CClientes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author Alumno
 */
public class CuentasBancarias {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Variables
        int menu, contador = 0;
        double monto;
        String cuentaAConsultar;
        CClientes cliente = new CClientes ();
        ArrayList <CClientes> cuentas = new ArrayList<>();
        do{
        //Menú principal
        menu = Integer.parseInt(JOptionPane.showInputDialog("1.Depósito\n" + "2.Retiro de efectivo\n" + "3.Consulta de saldo\n" + 
       "4.Ingresar nuevo usuario", "Seleccione una opción"));
        //Seleccionar opción
        //¿Qué opción seleccionó?
        switch (menu){
            case 1:
                //Ingresar cuenta a depositar
                cliente.setNombre(JOptionPane.showInputDialog("Ingrese nombre de usuario"));
                monto = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduzca monto a depositar"));
                cliente.doDeposito(monto);
                break;
            case 2:
                //Ingresar cuenta para depositar
                cliente.setNombre(JOptionPane.showInputDialog("Ingrese nombre de usuario"));
                monto = Double.parseDouble(JOptionPane.showInputDialog(null,"Introduzca monto a retirar"));
                cliente.doRetiro(monto);
                break;
            case 3:
                //consulta de saldo
                cliente.setNombre(JOptionPane.showInputDialog("Ingrese nombre de usuario"));
                JOptionPane.showMessageDialog(null, "su saldo es: " + cliente.getContSaldo());
                break;
            
            case 4:
                cliente.setNombre(JOptionPane.showInputDialog("Ingrese nombre de usuario"));
                cliente.setContSaldo(Double.parseDouble(JOptionPane.showInputDialog("Realice depósito inicial")));
                break;
            default:
                System.out.println("Opción no valida");
                break;
        }
        contador = JOptionPane.showConfirmDialog(null, "¿Desea realizar otra operación?", ":)", JOptionPane.YES_NO_OPTION);
        } while (contador == JOptionPane.YES_NO_OPTION);
                
        
    }
    
}
