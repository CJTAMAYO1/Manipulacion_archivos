
package manipulacionarchivos;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ManipulacionArchivos {

    public static void leerArchivos (String name) throws FileNotFoundException, IOException{

        File archivo; //apunta a un archivo fisico del DD
        FileReader reader; // llave con permiso de solo lectura
        BufferedReader bufer; // Recuperar info. del archivo
        String linea; 
        
        try{
            // crear un apuntador a archivos fisico
            archivo = new File("D:\\archivos\\" + name + ".txt");
            //Abrir el archivo para lectura
            reader = new FileReader(archivo);
            //configurar el bufer para leer datos del archivo
            bufer= new BufferedReader(reader);
            //lectura del contenido del archivo
            while ((linea = bufer.readLine())!=null){
                System.out.println(linea);
            }
            reader.close();
        }catch(Exception e){
            System.out.println("Error al leer el archivo: " +e.toString());
        }
    }
    
    public static void main(String[] args) throws IOException {
        
    BufferedReader bufer = new BufferedReader(new InputStreamReader(System.in));
    String fileName;
    
        System.out.println("Lectura de un archivo de texto: ");
        System.out.println("Escribe el nombre del archivo: ");
        fileName=bufer.readLine();
        leerArchivos(fileName);
    }
    
}
