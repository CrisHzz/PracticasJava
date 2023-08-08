public class main {

    public static void main(String[] args) {
        alumnos alumno1 = new alumnos(1, "Cristian", "H", "D");
        alumno1.mostrarNombre();
    }

    public static class alumnos {
        int id;
        String nombre;
        String apellido;
        String grupo;
        
        public alumnos(int id, String nombre, String apellido, String grupo) { //En VS es click derecho y acciones de codigo o ALT +I NSERT EN INTELIJ
            this.id = id;
            this.nombre = nombre;
            this.apellido = apellido;
            this.grupo = grupo;
        }

        public void mostrarNombre(){
            System.out.println("Hola, mi nombre es " + nombre);
        }
    }
}