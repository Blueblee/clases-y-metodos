/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Cuentas;

/**
 *
 * @author Alumno
 */
public class CClientes {
 private String nombre;
 private String numCuenta;
 private double contSaldo;
  
public CClientes (){
    
}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumCuenta() {
        return numCuenta;
    }

    public void setNumCuenta(String numCuenta) {
        this.numCuenta = numCuenta;
    }

    public double getContSaldo() {
        return contSaldo;
    }

    public void setContSaldo(double contSaldo) {
        this.contSaldo = contSaldo;
    }
     //Métodos de calculo.
    public void doDeposito (double monto){
     contSaldo += monto;  
    }
    public void doRetiro (double monto){
      contSaldo -= monto;
    }    
}