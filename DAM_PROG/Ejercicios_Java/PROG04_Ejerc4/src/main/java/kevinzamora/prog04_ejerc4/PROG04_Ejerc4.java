/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kevinzamora.prog04_ejerc4;

import java.util.Scanner;

/**
 *
 * @author kzdesigner
 */
public class PROG04_Ejerc4 {

    public static void main(String[] args) {
        
        loadMainPage();
        
    }

    public static void loadMainPage() {
        
        Scanner scanner = new Scanner(System.in);
        int numInt = 5;
        int numMax = 0;
        
        System.out.println("\n BIENVENID@S AL JUEGO 'ADIVINA QUÉ PIENSO' \n");
        System.out.println("¿¡EMPEZAMOS EL JUEGO!? \n");
        System.out.println("OPCIONES: \n 1. CONFIGURACIÓN \n 2. JUGAR \n 3. SALIR \n");
        System.out.println("SELECCIONA LA OPCIÓN DESEADA (Introduce un número):");
        
        
        int option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("HAS SELECCIONADO LA OPCIÓN 1: CONFIGURACIÓN \n");
                System.out.println("INTRODUCE EL NÚMERO DE INTENTOS PERMITIDOS (nº entero):");
                numInt = scanner.nextInt();
                System.out.println("INTRODUCE EL NÚMERO MÁXIMO PERMITIDO A ADIVINAR: ");
                numMax = scanner.nextInt();
                System.out.println("LA CONFIGURACIÓN HA SIDO GUARDADA CORRECTAMENTE");
                loadMainPage();
                break;
            case 2:
                System.out.println("HAS SELECCIONADO LA OPCIÓN 2: JUGAR");
                System.out.println("¡¡¡VAMOS ALLÁ...!!! \n");
                int numOculto = (int)Math.floor(Math.random()*numMax+1); 
                //genera un número aleatorio entre 0 y el número máximo introducido, ambos incluidos.
                System.out.println("EL NÚMERO OCULTO HA SIDO GENERADO CON ÉXITO... ¿ACEPTAS EL DESAFIO? \n");
                System.out.println("NÚMERO DE INTENTOS: " + numInt);
                
                int numIntroducido = 0;
                while (numOculto == numIntroducido ) {
                    System.out.println("INTRODUCE UN NÚMERO CANDIDATO (Nº ENTERO):");
                    numIntroducido = scanner.nextInt();
                    if (numIntroducido == numOculto) { 
                        System.out.println("¡¡¡ENHORABUENA!!! HAS ACERTADO EL NÚMERO OCULTO \n"); 
                        System.out.println("THE END");
                        loadMainPage();
                        break;
                    } else {
                        System.out.println("NO HA HABIDO SUERTE...\n ¡MUCHA SUERTE!\n PRUEBA OTRA VEZ");
                    }
                } 
                break;
            case 3:
                System.out.println("HAS SELECCIONADO LA OPCIÓN 3: SALIR");
                break;
        }
        
    }
}
