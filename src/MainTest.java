import org.junit.jupiter.api.*;
import org.junit.jupiter.api.io.TempDir;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    
    @TempDir
    Path tempDir;
    
    // Tests for crearDir method (returns boolean)
    @Test
    @DisplayName("Test crear directorio - directorio nuevo")
    public void testCrearDirNuevo() {
        String nuevoDir = tempDir.resolve("testDir").toString();
        
        assertTrue(Activitat_100.crearDir(nuevoDir));
        assertTrue(new File(nuevoDir).exists());
        assertTrue(new File(nuevoDir).isDirectory());
    }
    
    @Test
    @DisplayName("Test crear directorio - directorio existente")
    public void testCrearDirExistente() throws IOException {
        Path dirExistente = Files.createDirectory(tempDir.resolve("dirExistente"));
        
        // Should return false when directory already exists
        assertFalse(Activitat_100.crearDir(dirExistente.toString()));
        assertTrue(Files.exists(dirExistente));
    }
    
    @Test
    @DisplayName("Test crear directorio - ruta inválida")
    public void testCrearDirRutaInvalida() {
        String rutaInvalida = "Z:\\nonexistent\\path\\testDir";
        
        assertFalse(Activitat_100.crearDir(rutaInvalida));
    }
    
    // Tests for escriuArxiu method (returns boolean)
    @Test
    @DisplayName("Test escribir archivo - contenido simple")
    public void testEscriuArxiuContenidoSimple() throws IOException {
        String dirTest = tempDir.toString();
        String nombreArchivo = "archivoEscritura.txt";
        String contenido = "Hola mundo!";
        
        assertTrue(Activitat_100.escriuArxiu(dirTest, nombreArchivo, contenido));
        
        File archivo = new File(dirTest, nombreArchivo);
        assertTrue(archivo.exists());
        
        String contenidoLeido = Files.readString(archivo.toPath());
        assertEquals(contenido, contenidoLeido);
    }
    
    @Test
    @DisplayName("Test escribir archivo - contenido vacío")
    public void testEscriuArxiuContenidoVacio() throws IOException {
        String dirTest = tempDir.toString();
        String nombreArchivo = "archivoVacio.txt";
        String contenido = "";
        
        assertTrue(Activitat_100.escriuArxiu(dirTest, nombreArchivo, contenido));
        
        File archivo = new File(dirTest, nombreArchivo);
        assertTrue(archivo.exists());
        assertEquals(0, archivo.length());
    }
    
    @Test
    @DisplayName("Test escribir archivo - contenido multilínea")
    public void testEscriuArxiuContenidoMultilinea() throws IOException {
        String dirTest = tempDir.toString();
        String nombreArchivo = "archivoMultilinea.txt";
        String contenido = "Línea 1\nLínea 2\nLínea 3";
        
        assertTrue(Activitat_100.escriuArxiu(dirTest, nombreArchivo, contenido));
        
        File archivo = new File(dirTest, nombreArchivo);
        String contenidoLeido = Files.readString(archivo.toPath());
        assertEquals(contenido, contenidoLeido);
    }
    
    @Test
    @DisplayName("Test escribir archivo - directorio inexistente")
    public void testEscriuArxiuDirectorioInexistente() {
        String dirInexistente = "Z:\\nonexistent\\path";
        String nombreArchivo = "test.txt";
        String contenido = "test content";
        
        assertFalse(Activitat_100.escriuArxiu(dirInexistente, nombreArchivo, contenido));
    }
}
