package aed.actividadpropuesta03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class RegistroUsuariosFichero {
    public static void main(String[] args) {
        // Creamos un objeto File para el archivo "Usuarios.txt"
        File fichero = new File("Usuarios.txt");
        // Creamos un objeto Scanner para leer la entrada del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitamos al usuario que ingrese el nombre, edad y altura
        System.out.print("Ingrese el nombre: ");
        String nombre = sc.nextLine();
        System.out.print("Ingrese la edad: ");
        int edad = sc.nextInt();
        System.out.print("Ingrese la altura en metros: ");
        float altura = sc.nextFloat();
       

        // Creamos un objeto BufferedWriter para escribir en el archivo
        try (BufferedWriter bw = new BufferedWriter(new FileWriter("Usuarios.txt", true))) {
            // Escribimos los datos en el archivo
            bw.write("Nombre: " + nombre + "\n");
            bw.write("Edad: " + edad + "\n");
            bw.write("Altura: " + altura + " metros\n");
            bw.write("\n"); // Agregamos un salto de línea para separar los registros
        } catch (IOException e) {
            // Si ocurre un error al escribir en el archivo, mostramos un mensaje de error
            System.err.println("Error al escribir en el archivo: " + e.getMessage());
        }

        // Mostramos un mensaje para indicar que los datos se han guardado correctamente
        System.out.println("Datos guardados correctamente.");
        
    }
}

