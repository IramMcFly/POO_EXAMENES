package eva3_examen_1;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

//Prueba de manejo de archivos funcionando sobre el el McFly-HyperVisor
//version del McFly-HyperVisor: 3.03 - Log Update
//version del McFly-HyperVisor sobre este proyecto: 1.3
//Propiedad del equipo donut :)
//Por su salud mental ignore los comentarios que hay en este documento
class StudentManagementSystem { //aqui esta todo lo funy del proyecto

    private List<Estudiante> estudiantes; //usar listas es facil de guardar. Pero aun asi prefiero arreglos

    public StudentManagementSystem() {
        this.estudiantes = new ArrayList<>();//... Si, es una lista
    }

    public void addStudent(Estudiante estudiante) {
        estudiantes.add(estudiante); //solo por estos metodos son ligeramente mejores las listas
    }
    public void removeStudent(Estudiante estudiante) {
        estudiantes.remove(estudiante);
    }

    public Estudiante getStudent(int rollNumber) {
        String directoryPath = "C:\\ArchivosExamenPOO"; //poner las rutas asi es mas bonito y facil @iram
        String filename = directoryPath + "\\estudiantes.est"; //^.^
        loadData(filename, rollNumber);
        return null;
    }

    public void storeData() { //metodo PUBLICO para guardar
        String directoryPath = "C:\\ArchivosExamenPOO"; //poner las rutas asi es mas bonito y facil @iram
        String filename = directoryPath + "\\estudiantes.est"; //^.^

        //Crear la carpeta si no existe
        //Bastante probable si el profe lo corre por primera vez
        createDirectory(directoryPath);

        //Eliminar el archivo si ya existe
        //poco probable pero posible si el profe corre esta cosa mas de una vez
        deleteFileIfExists(filename);

        try (ObjectOutputStream outputStream = new ObjectOutputStream(new FileOutputStream(filename))) {
            outputStream.writeObject(estudiantes);
            //quitar los println de debug
            //System.out.println("Guardado");
        } catch (IOException e) {
            //no toquen el print por si acaso
            // ^-^
            System.out.println("Error al Guardar" + e.getMessage());
        }
    }

    private void loadData(String filename, int rollNumber) { //sigo sin entender por que rollNumber y no numero de lista
        //ULTIMO METODO PUBLICO
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            List<Estudiante> estudiantesCargados = (List<Estudiante>) inputStream.readObject();
            for (Estudiante estudiante : estudiantesCargados) {
                if (estudiante.getNumeroLista() == rollNumber) {
                    //hay que usar el toString
                    //listo uwu
                    System.out.println(estudiante);
                    return;
                }
            }
            System.out.println("No se encontro ningun estudiante con el numero de lista especificado.");
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }

    public void loadData(String filename) { //sigo sin entender por que rollNumber y no numero de lista
        //ULTIMO METODO PUBLICO
        try (ObjectInputStream inputStream = new ObjectInputStream(new FileInputStream(filename))) {
            List<Estudiante> estudiantesCargados = (List<Estudiante>) inputStream.readObject();
            for (Estudiante estudiante : estudiantesCargados) {
                System.out.println(estudiante);

            }
        } catch (IOException | ClassNotFoundException e) {
            System.out.println("Error al cargar los datos: " + e.getMessage());
        }
    }

    private void createDirectory(String directoryPath) { //metodo privado por si acaso
        //estoy conciente de que no es tan necesario pero no quiero errores en MI codigo
        Path path = Paths.get(directoryPath);
        if (!Files.exists(path)) {
            try {
                Files.createDirectory(path);
            } catch (IOException e) {
                System.out.println("Error al crear carpeta: " + e.getMessage());
            }
        }
    }

    private void deleteFileIfExists(String filename) { //metodo privado por si acaso
        Path path = Paths.get(filename);
        if (Files.exists(path)) {
            try {
                Files.delete(path); //estoy conciente de que no es tan necesario pero no quiero errores en MI codigo
                //a proposito: tuve que aprender a usar la libreria Files owo
            } catch (IOException e) {
                System.out.println("Error al eliminar el archivo existente: " + e.getMessage());
            }
        }
    }
}
