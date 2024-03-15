/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kevinzamora.prog07_tarea.Models;

import java.util.ArrayList;

/**
 *
 * @author kzdesigner
 */
public class CuentaCorriente {
    
    String numCuenta;
    ArrayList<String> listaEntidades;
    Double comisionMantenimiento;
    Double tipoInteresPorDescubierto;
    Double maxDescubiertoPermitido;

    public CuentaCorriente() {
    }

    public CuentaCorriente(String numCuenta, ArrayList<String> listaEntidades, 
            Double comisionMantenimiento, Double tipoInteresPorDescubierto, 
            Double maxDescubiertoPermitido) {
        this.numCuenta = numCuenta;
        this.listaEntidades = listaEntidades;
        this.comisionMantenimiento = comisionMantenimiento;
        this.tipoInteresPorDescubierto = tipoInteresPorDescubierto;
        this.maxDescubiertoPermitido = maxDescubiertoPermitido;
    }
    
    
    
}
