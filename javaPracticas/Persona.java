
public class Persona {
    int id;
    String CC;
    String Nombre;
    String Apellido;
    String Domicilio;
    String Telefono;

    public Persona(int id, String Cc, String nombre, String apellido, String domicilio, String telefono) {
        this.id = id;
        CC = Cc;
        Nombre = nombre;
        Apellido = apellido;
        Domicilio = domicilio;
        Telefono = telefono;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCC() {
        return CC;
    }

    public void setCC(String cC) {
        CC = cC;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getDomicilio() {
        return Domicilio;
    }

    public void setDomicilio(String domicilio) {
        Domicilio = domicilio;
    }

    public String getTelefono() {
        return Telefono;
    }

    public void setTelefono(String telefono) {
        Telefono = telefono;
    }

    
    

}
