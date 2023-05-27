package eva3_examen_2;

public class EVA3_EXAMEN_2 {

    //Por su salud mental ignore los comentarios que hay en este documento
    
    public static void main(String[] args) {
        Inventario inventario = new Inventario();

        //crear los productos del inventario
        Producto p1 = new Producto(1, "Procesador", 2404.56, 134);
        Producto p2 = new Producto(2, "Camisa F1", 899.99, 33); //se viene la 33
        Producto p3 = new Producto(3, "Control de Xbox", 1700.76, 90);
        //al fin arreglos. son mas faciles que las listas
        //pero aun asi las listas tienen mas sentido en estas cosas
        inventario.addProduct(p1);  
        inventario.addProduct(p2);
        inventario.addProduct(p3);

        //Mostrar el inventario actual
        //les dije que es mas facil hacer estas cosas
        //con arrreglos, solo se ocupan unos cuantos FOR
        inventario.displayInventory();

        //aguien por favor ponga saltos de lineas x_x
        
        //buscar un producto por su ID / aqui facilmente pude haberle puesto codigo de barras
        Producto productoBuscado = inventario.searchProduct(2); //si funciono, les dije
        if (productoBuscado != null) {//deberiamos de hacer un arreglo mas grande pero no quiero incendiar mi pc
            System.out.println("Producto encontrado: " + productoBuscado.toString());
        } else {
            //realmente la unica forma de entrar aqui es tocando el codigo
            //nota del programador: no toques el codigo pq pasan cosas feas con los archivos 
            System.out.println("No se encontro un producto con el ID especificado.");
        }

        //eliminar un producto por su ID
        inventario.removeProduct(1);

        //Mostrar el inventario actualizado
        inventario.displayInventory();

        //Guardar el inventario en un archivo
        inventario.saveToFile("inventario.txt"); //realmente podemos cambiar la extencion del archivo pero prefiero no arriesgarme

        // Cargar el inventario desde el archivo
        Inventario nuevoInventario = new Inventario(); //misma cosa que en el otro proyecto por que si no ocurren cosas extranas
        //como que ni siquiera reconozca los comandos en la siguientes partes
        
        nuevoInventario.loadFromFile("inventario.txt");

        // Mostrar el inventario cargado desde el archivo
        nuevoInventario.displayInventory();
    }

}
