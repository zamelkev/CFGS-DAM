/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package kevinzamora.prog06_tarea;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author kzdesigner // Autor y nombre del equipo de Kevin Zamora Amela
 */
public class Principal {

    String matriculaVehiculoSeleccionado;
    Vehiculo vehiculoSeleccionado;
    Vehiculo vehiculoObj = new Vehiculo();
    int errores = vehiculoObj.errores;

    // Declaración e Inicialización de los "Coches ejemplo"
    Vehiculo coche1 = new Vehiculo(1, "Audi", "A6", "12345ABC",
            10000, LocalDate.of(2015, 3, 11), "Manolo",
            "Coche 'largo' de gama media-alta", 70000.50, "12345678M");
    Vehiculo coche2 = new Vehiculo(2, "Ford", "Focus", "12345CBA",
            7000, LocalDate.of(2013, 5, 10), "Conchi",
            "Coche 'corto' de gama media", 25000, "12345678N");
    Vehiculo coche3 = new Vehiculo(3, "Fiat", "Punto", "12346ABC",
            200000, LocalDate.of(2005, 9, 20), "Blai",
            "Coche 'corto' de gama media-baja", 6000, "12345678O");

    // Colección de Vehículos
    public Vehiculo[] vehiculos = {
        coche1, coche2, coche3};

    public void loadMainMenu() {

        System.out.println("BIENVENID@S A NUESTRO INVENTARIO DE VEHICULOS: \n");
        System.out.println("NUESTRAS OPCIONES: \n "
                + "1. Nuevo Vehículo. \n 2. Listar Vehículos. \n "
                + "3. Buscar Vehículo. \n 4. Modificar kms Vehículo. \n "
                + "5. Salir \n");

        System.out.println("SELECCIONA UNA OPCIÓN (Introduce un nº entero):");
        Scanner scanner = new Scanner(System.in);
        int opcion = scanner.nextInt();

        switch (opcion) {

            case 1:
                System.out.println("INTRODUCIR DATOS - CREAR NUEVO VEHÍCULO: \n");

                vehiculoObj.creaUnVehiculo(vehiculos);
                vehiculoObj.imprimeVehiculos(vehiculos);
                System.out.println("NO VEO LA CAUSA POR LA QUE EL PROGRAMA NO ES CAPAZ DE AÑADIR EL NUEVO \n"
                        + "ITEM A NUESTRO 'ARRAY' CARGADO EN MEMORIA, AUNQUE SEA SÓLO PARA PODER MOSTRARLO \n"
                        + "TEMPORALMENTE. AGRADECERÍA ALGO DE AYUDA PARA LOGRAR LOCALIZAR EL 'ERROR' "
                        + "EN CUESTIÓN\n\n");

                if (errores >= 3) {
                    System.out.println("HAS COMETIDO 3 ERRORES Y SE TE REDIRIGE "
                            + "A LA PANTALLA PRINCIPAL. MÁS SUERTE LA PRÓXIMA VEZ. \n VUELVE A INICIAR LA APLICACIÓN "
                            + "PARA VOLVER A INTENTARLO");
                    errores = 0;
                    return;
                }
                loadMainMenu();
                break;
            case 2:
                System.out.println("LISTA DE VEHÍCULOS: \n");
                vehiculoObj.imprimeVehiculos(vehiculos);
                loadMainMenu();
                break;
            case 3:
                System.out.println("BÚSCA UN VEHÍCULO: \n ");
                System.out.println("INTRODUCE LA MATRÍCULA DEL VEHÍCULO A BUSCAR: ");
                matriculaVehiculoSeleccionado = scanner.nextLine();
                
                System.out.print("El vehiculo se ha guardado correctamente \n\n");
                loadMainMenu();
                break;
            case 4:
                System.out.println("ACTUALIZAR KILÓMETROS: \n Introduce su nuevo kilometraje: ");
                int nuevoKilometraje = scanner.nextInt();
                vehiculoObj.actualizarKms(nuevoKilometraje, vehiculoSeleccionado);
                int kmsVehiculoSeleccionado = vehiculoSeleccionado.getNumKilometros();
                System.out.println("Los kilometros del coche has sido actualizados correctamente; ahora tiene "
                        + kmsVehiculoSeleccionado + " kilometros \n");
                // System.out.print("PULSE CUALQUIER TECLA PARA CONTINUAR");
                /* System.in.read(); // Probando a implementar una interrupción; en .NET podemos usar:
                Console.ReadKey()*/
                loadMainMenu();
                break;
            case 5:
                System.out.println("¡HASTA PRONTO!");
                break;
            default:
                System.out.println("LA OPCIÓN INTRODUCIDA NO ES VÁLIDA \n");
                // System.out.print("PULSE CUALQUIER TECLA PARA CONTINUAR");
                /* System.in.read(); // Probando a implementar una interrupción; en .NET podemos usar:
                Console.ReadKey()*/
                break;
        }
    }
}
