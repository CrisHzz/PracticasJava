public class main {

    public static void main(String[] args) {
        alumnos alumno1 = new alumnos(1, "Cristian", "H", "D");
        alumno1.mostrarNombre();
        System.out.println(alumno1.getId());

        alumnos alumno2 = new alumnos(2,"Neider","Machado","B");
        alumno2.mostrarNombre();
        System.out.println(alumno2.getId()); //Muestra en pantalla el ID mediante el metodo get
        
        alumnos alumno3=new alumnos(0, null, null, null); //Creo un alumno vacio
        alumno3.setId(3); // seteo o definicion de un atributo a un objeto vacio
        alumno3.setGrupo("C");
        alumno3.setApellido("Lopez");
        alumno3.setNombre("Tomas");

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

        

        public int getId() { //Get para obtener un dato o que se accesible 
            return id;
        }



        public void setId(int id) { //Set para que se puede definir y si deseo hacer una operaicon
            this.id = id;
        }



        public String getNombre() {
            return nombre;
        }



        public void setNombre(String nombre) {
            this.nombre = nombre;
        }



        public String getApellido() {
            return apellido;
        }



        public void setApellido(String apellido) {
            this.apellido = apellido;
        }



        public String getGrupo() {
            return grupo;
        }



        public void setGrupo(String grupo) {
            this.grupo = grupo;
        }



        public void mostrarNombre(){
            System.out.println("Hola, mi nombre es " + nombre);
        }
    }

}