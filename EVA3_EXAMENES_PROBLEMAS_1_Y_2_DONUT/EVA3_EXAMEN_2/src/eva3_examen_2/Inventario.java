package eva3_examen_2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
//cuantas librerias mas se necesitan para hacer un programa funcional??
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
//demasiadas

class Inventario {

    private Producto[] productos;
    private int numProductos;

    public Inventario() {
        productos = new Producto[11]; //sigo creyenndo que el arreglo es muy chico 
        numProductos = 0;
    }

    // Metodo para agregar un producto al inventario
    public void addProduct(Producto producto) {
        if (numProductos < 10) {
            productos[numProductos] = producto;
            numProductos++;
            //System.out.println("Producto agregado al inventario.");
        } else {
            System.out.println("Inventario lleno. No se puede agregar mas productos.");
        }
    }

    //eliminar un producto del inventario por su ID
    public void removeProduct(int productId) {
        for (int i = 0; i < numProductos; i++) {
            //solo por poder usar un for mas normal es que
            //amo los arreglos... Arreglos > listas diabolicas
            if (productos[i].getId() == productId) {//buscandou el ID

                productos[i] = productos[numProductos - 1];
                productos[numProductos - 1] = null;
                numProductos--;
                System.out.println("producto eliminado");
                return;
            }
        }
        System.out.println("No se encontro el ID");
    }

    //Metodo para buscar un producto en el inventario por su ID
    public Producto searchProduct(int productId) {
        for (int i = 0; i < numProductos; i++) {
            if (productos[i].getId() == productId) {
                //aqui como programador y amante de c++ 
                //considero apropiado hacer una busqueda binaria
                //obvio es mucho codigo pero creo que 
                //reafirmaria (otra vez) que le sobo a la programacion
                return productos[i];
                //si me aburro lo suficiente le voy a poner busqueda binaria, primer aviso Owo;
            }
        }
        return null;
    }

    //Metodo para mostrar el inventario actual
    public void displayInventory() {
        if (numProductos == 0) {
            //esto me salvo de empezar a hacer cosas mas raras
            //esa cosa era un null pero en 0 es mejor y mas facil de entender
            System.out.println("El inventario esta vacio.");
        } else {
            //no se quien de ustedes dos es pero por favor dejen de usar acentos pq tengo teclado en ingles
            System.out.println("Inventario actual:");
            for (int i = 0; i < numProductos; i++) {
                //hay que usar el toString en vez de este chistonto de 20 lineas
                System.out.println(productos[i].toString());
                //listo el toString >w<
            }
        }
    }

    //Metodo para guardar el inventario en un archivo de texto / aqui es mas bonito y facil que en el pasado.
    public void saveToFile(String filename) {
        String directoryPath = "c:\\ArchivosExamenPoo2";
        String filePath = directoryPath + "\\" + filename;

        File directory = new File(directoryPath);
        if (!directory.exists()) {
            directory.mkdirs(); //Crea la carpeta y todas las subcarpetas necesarias
        }

        //les dije que era muy feo el sistema de arriba y lo cambie - Atte: McFly
        // @rose el HyperVisor 2.2 tu patrona - Atte; McFly y el HyperVisor
        try (PrintWriter writer = new PrintWriter(new FileWriter(filePath))) { //esto es nuevo pero sigue siendo una forma mas
            //eficiente de guardar archivos de texto >.<
            for (int i = 0; i < numProductos; i++) {
                //solo por poder usar algo como un for normal es que prefiero los arreglos uwu
                Producto producto = productos[i];
                writer.println(producto.getId());
                writer.println(producto.getNombre());
                writer.println(producto.getPrecio());
                writer.println(producto.getCantidad());
            }
            System.out.println("inventario guardado en: " + filePath + "\n");
        } catch (IOException e) {
            System.out.println("Error al guardar el inventario en el archivo.");
        }
    }

    // Método para cargar el inventario desde un archivo de texto
    public void loadFromFile(String filename) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filename))) {
            String line;
            numProductos = 0;
            while ((line = reader.readLine()) != null) {//basicamente aqui se lee todo el archivo con el While
                //esto lo vimos en una practica pero no recuerdo cual XDDD
                int id = Integer.parseInt(line);
                String nombre = reader.readLine();
                double precio = Double.parseDouble(reader.readLine());
                int cantidad = Integer.parseInt(reader.readLine());
                Producto producto = new Producto(id, nombre, precio, cantidad);
                productos[numProductos] = producto; //si los arreglos y el BucketList y todo lo que tengar que ver con ordenamiento
                //es mi pasion
                numProductos++;
            }
            //no se si dejar este debug en la version final
            //System.out.println("inventario cargado desde: " + filename);
        } catch (FileNotFoundException e) {
            //santa maria de los buenos aires nunca caigas aqui
            System.out.println("El archivo '" + filename + "' no se encontro.");
        } catch (IOException e) {
            //santo general Zuazua por favor no llegar a este horripilante lugar
            System.out.println("Error al leer el archivo '" + filename + "'.");
        }
    }
}
