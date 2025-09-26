import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Activitat 1.00 : Manipulació d'arxius i directoris
public class Activitat_100 {
    public static void main(String[] args) {
        crearDir("E:/test");
    }

    public static boolean crearDir(String dir) {
        File file = new File(dir);
        if (!file.exists()) {
            if (file.mkdir()) {
                System.out.println("El archivo se creo correctamente");
                return true;
            } else {
                System.out.println("El archivo no se pudo crear");
                return false;
            }
        } else {
            System.out.println("El archivo ya existe");
            return false;
        }
    }

    public static void crearArxiu(String dir, String nom) {
        File arxiu = new File(dir, nom);
        if (!arxiu.exists()) {
            try {
                if (arxiu.createNewFile())
                    System.out.println("El archivo se creo correctamente");
                else
                    System.out.println("El archivo no se pudo crear");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public static boolean escriuArxiu(String dir, String nom, String cont) {
        File arxiu = new File(dir, nom);
        FileWriter escritor = null;

        try {
            escritor = new FileWriter(arxiu);

            escritor.write(cont);
            escritor.close();
            System.out.println("El contenido se escribió correctamente en el archivo");
            
            return true;
        } catch (IOException e) {
            System.out.println("Error al escribir en el archivo: " + e.getMessage());
            return false;
        } finally {
            try {
                if (escritor != null) {
                    escritor.close();
                    
                    return true;
                }
            } catch (IOException e) {
                return false;
            }
        }
    }

    public static void llistaDirectori(String dir) {
        File file = new File(dir);
        if (file.isDirectory()) {
            File[] files = file.listFiles();
            for (File f : files) {
                System.out.println("Nombre: " + f.getName());
                System.out.println("Ruta completa: " + f.getAbsolutePath());
                System.out.println("Es directorio: " + f.isDirectory());
                System.out.println("Es archivo: " + f.isFile());
                System.out.println("Tamaño: " + f.length() + " bytes");
                System.out.println("Última modificación: " + new java.util.Date(f.lastModified()));
                System.out.println("Puede leer: " + f.canRead());
                System.out.println("Puede escribir: " + f.canWrite());
                System.out.println("Puede ejecutar: " + f.canExecute());
                System.out.println("Está oculto: " + f.isHidden());
                System.out.println("Archivo padre: " + f.getParent());
                System.out.println("--------------------");
            }
        } else {
            System.out.println("No es un directorio");
        }
    }

}