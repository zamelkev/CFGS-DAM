/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kevinzamora.prog05_ejer1_util;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.regex.Pattern;
import kevinzamora.prog05_ejerc1.Vehiculo;

/**
 *
 * @author kzdesigner // Autor y nombre del equipo de Kevin Zamora Amela
 */
public class Validaciones {

    private static final Pattern REGEXP = Pattern.compile("[0-9]{8}[A-Z]");
    private static final String DIGITO_CONTROL = "TRWAGMYFPDXBNJZSQVHLCKE";
    private static final String[] INVALIDOS = new String[]{"00000000T", "00000001R", "99999999R"};

    public boolean comprobarFechaMatriculacion(LocalDate fechaMatriculacionIntroducida) {
        if (LocalDate.now().compareTo(fechaMatriculacionIntroducida) > 0) {
            System.out.println("LA FECHA INTRODUCIDA ES CORRECTA, ES ANTERIOR AL MOMENTO ACTUAL \n");
            return true;
        } else {
            System.out.println("LA FECHA INTRODUCIDA ES INCORRECTA. ACTUALÍCELA PARA CONTINUAR \n");
            return false;
        }
    }

    public boolean comprobarKilometros(int kmsIntroducidos) {
        if (kmsIntroducidos > 0) {
            System.out.println("OK: LOS KILOMETROS INTRODUCIDOS SON MAYORES "
                    + "QUE CERO \n");
            return true;
        } else {
            System.out.println("KILÓMETROS INCORRECTOS. "
                    + "MODIFÍQUELOS PARA CONTINUAR \n");
            return false;
        }
    }

    public boolean comprobarDni(String dniIntroducido) {
        boolean seemsCorrect = Arrays.binarySearch(INVALIDOS, dniIntroducido) < 0 // (1)
	    && REGEXP.matcher(dniIntroducido).matches() // (2)
        && dniIntroducido.charAt(8) == 
                DIGITO_CONTROL.charAt(Integer.parseInt(
                        dniIntroducido.substring(0, 8)) % 23); // (3)
        if (seemsCorrect) {System.out.println("EL DNI INTRODUCIDO PRESENTA "
                + "UN FORMATO CORRECTO \n"); return true;} else {System.out.println("EL DNI PRESENTA "
                        + "UN FORMATO INCORRECTO. ACTUALÍCELO PARA CONTINUAR \n"); return false;}
    }
    
    public boolean comprobarActualizacionKms(int kms, Vehiculo vehiculoSeleccionado) {
        if(kms > vehiculoSeleccionado.getNumKilometros()) {
            System.out.println("SE PUEDEN ACTUALIZAR EL Nº DE KILÓMETROS POR EL NUEVO VALOR: " 
                    + kms); return true; } else { System.out.println("NO SE PERMITE RESTAR "
                            + "KILÓMETROS. ACTUALICE EL VALOR PARA CONTINUAR"); return false; }
    }

}
