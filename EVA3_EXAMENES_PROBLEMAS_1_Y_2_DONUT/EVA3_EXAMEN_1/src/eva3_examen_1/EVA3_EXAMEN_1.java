package eva3_examen_1;

public class EVA3_EXAMEN_1 {
    
    //Por su salud mental ignore los comentarios que hay en este documento
    
    public static void main(String[] args) {
        StudentManagementSystem system = new StudentManagementSystem();

        //Crear objetos de Estudiante
        Estudiante estudiante1 = new Estudiante("Diego Rose", 22550, "2");
        Estudiante estudiante2 = new Estudiante("Iram Ballesteros McFly", 22551, "2");
        Estudiante estudiante3 = new Estudiante("Jonathan Salazar", 22552, "2");
        Estudiante estudiante4 = new Estudiante("Pancho Pistolas", 2, "Especial");

        //Agregar estudiantes a la lista diabolica
        //LEs dije que era mejor usar arreglos >_<
        system.addStudent(estudiante1);
        system.addStudent(estudiante2);
        system.addStudent(estudiante3);
        system.addStudent(estudiante4);

        //eliminamos al estudiante 4
        system.removeStudent(estudiante4);
        
        //Guardar los datos en un archivo
        system.storeData();
        
        system = new StudentManagementSystem();

        //espero que esto es lo unico que se mueveS
        //esto pide de un estudiante en especifico
        system.getStudent(22551);
        
        //esto muestra todos los guardados
        system.loadData("C:\\ArchivosExamenPOO\\estudiantes.est");
        
    }
    //team Donut
}
