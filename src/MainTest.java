import org.junit.jupiter.api.*;
import org.junit.jupiter.api.io.TempDir;
import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
 /*
    @TempDir
    Path tempDir;
    
    @Test
    @DisplayName("Test crear directorio - directorio nuevo")
    public void testCrearDirNuevo() {
        String nuevoDir = tempDir.resolve("testDir").toString();
        
        assertTrue(Main.crearDir(nuevoDir));
        assertTrue(new File(nuevoDir).exists());
        assertTrue(new File(nuevoDir).isDirectory());
    }
    
    @Test
    @DisplayName("Test crear directorio - directorio existente")
    public void testCrearDirExistente() throws IOException {
        Path dirExistente = Files.createDirectory(tempDir.resolve("dirExistente"));
        
        assertTrue(Main.crearDir(dirExistente.toString()));
        assertTrue(Files.exists(dirExistente));
    }
    
    @Test
    @DisplayName("Test crear archivo - archivo nuevo")
    public void testCrearArxiuNuevo() {
        String dirTest = tempDir.toString();
        String nombreArchivo = "archivoTest.txt";
        
        assertTrue(Main.crearArxiu(dirTest, nombreArchivo));
        assertTrue(new File(dirTest, nombreArchivo).exists());
        assertTrue(new File(dirTest, nombreArchivo).isFile());
    }
    
    @Test
    @DisplayName("Test crear archivo - archivo existente")
    public void testCrearArxiuExistente() throws IOException {
        String dirTest = tempDir.toString();
        String nombreArchivo = "archivoExistente.txt";
        
        // Crear archivo primero
        Files.createFile(tempDir.resolve(nombreArchivo));
        
        assertTrue(Main.crearArxiu(dirTest, nombreArchivo));
        assertTrue(new File(dirTest, nombreArchivo).exists());
    }
    
    @Test
    @DisplayName("Test escribir archivo - contenido simple")
    public void testEscriuArxiuContenidoSimple() throws IOException {
        String dirTest = tempDir.toString();
        String nombreArchivo = "archivoEscritura.txt";
        String contenido = "Hola mundo!";
        
        assertTrue(Main.escriuArxiu(dirTest, nombreArchivo, contenido));
        
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
        
        assertTrue(Main.escriuArxiu(dirTest, nombreArchivo, contenido));
        
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
        
        assertTrue(Main.escriuArxiu(dirTest, nombreArchivo, contenido));
        
        File archivo = new File(dirTest, nombreArchivo);
        String contenidoLeido = Files.readString(archivo.toPath());
        assertEquals(contenido, contenidoLeido);
    }
    
    @Test
    @DisplayName("Test listar directorio - directorio vacío")
    public void testLlistaDirectoriVacio() {
        String dirTest = tempDir.toString();
        
        String[] resultado = Main.llistaDirectori(dirTest);
        assertNotNull(resultado);
        assertEquals(0, resultado.length);
    }
    
    @Test
    @DisplayName("Test listar directorio - directorio con archivos")
    public void testLlistaDirectoriConArchivos() throws IOException {
        String dirTest = tempDir.toString();
        
        // Crear algunos archivos de test
        Files.createFile(tempDir.resolve("archivo1.txt"));
        Files.createFile(tempDir.resolve("archivo2.txt"));
        Files.createDirectory(tempDir.resolve("subdirectorio"));
        
        String[] resultado = Main.llistaDirectori(dirTest);
        assertNotNull(resultado);
        assertEquals(3, resultado.length);
        
        // Verificar que contiene los nombres esperados
        boolean contieneArchivo1 = false, contieneArchivo2 = false, contieneSubdir = false;
        for(String nombre : resultado) {
            if(nombre.equals("archivo1.txt")) contieneArchivo1 = true;
            if(nombre.equals("archivo2.txt")) contieneArchivo2 = true;
            if(nombre.equals("subdirectorio")) contieneSubdir = true;
        }
        
        assertTrue(contieneArchivo1);
        assertTrue(contieneArchivo2);
        assertTrue(contieneSubdir);
    }
    
    @Test
    @DisplayName("Test listar directorio - archivo no es directorio")
    public void testLlistaDirectoriNoEsDirectorio() throws IOException {
        Path archivo = Files.createFile(tempDir.resolve("noEsDirectorio.txt"));
        
        String[] resultado = Main.llistaDirectori(archivo.toString());
        assertNull(resultado);
    }
    
    @Test
    @DisplayName("Test listar directorio - directorio inexistente")
    public void testLlistaDirectoriInexistente() {
        String dirInexistente = tempDir.resolve("noExiste").toString();
        
        String[] resultado = Main.llistaDirectori(dirInexistente);
        assertNull(resultado);
    }
    
    @Test
    @DisplayName("Test integración - flujo completo")
    public void testFlujoCompleto() {
        String dirTest = tempDir.resolve("integrationTest").toString();
        String nombreArchivo = "testCompleto.txt";
        String contenido = "Contenido de prueba para test de integración";
        
        // 1. Crear directorio
        assertTrue(Main.crearDir(dirTest));
        
        // 2. Crear archivo
        assertTrue(Main.crearArxiu(dirTest, nombreArchivo));
        
        // 3. Escribir contenido
        assertTrue(Main.escriuArxiu(dirTest, nombreArchivo, contenido));
        
        // 4. Listar directorio
        String[] archivos = Main.llistaDirectori(dirTest);
        assertNotNull(archivos);
        assertEquals(1, archivos.length);
        assertEquals(nombreArchivo, archivos[0]);
        
        // 5. Verificar que el archivo existe y tiene el contenido correcto
        File archivo = new File(dirTest, nombreArchivo);
        assertTrue(archivo.exists());
        assertTrue(archivo.isFile());
    }
    */
}
