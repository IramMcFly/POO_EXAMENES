package eva3_examen_1;

import java.io.*;

class Estudiante implements Serializable {

    private String nombre;
    private int numeroLista;
    private String grado;

    public Estudiante(String nombre, int numeroLista, String grado) {
        this.nombre = nombre;
        this.numeroLista = numeroLista;
        this.grado = grado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroLista() {
        return numeroLista;
    }

    public void setNumeroLista(int numeroLista) {
        this.numeroLista = numeroLista;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }
    
    
    //tuve que revisar la unidas dos para recordar como se hacia esto XD
    @Override
    public String toString() {
        return "Estudiante: " + "\n"  
                + "Nombre: " + nombre + "\n"
                + "Numero de Lista: " + numeroLista + "\n"
                + "Grado: " + grado;                
    }
}
