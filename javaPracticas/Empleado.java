public class Empleado extends Persona { //Creacion de la clase Empleado que hereda de Persona
    int carnet;
    double Sueldo;
    String Cargo;

    
    public Empleado(int id, String Cc, String nombre, String apellido, String domicilio, String telefono, int carnet, //Metodo constructor
            double sueldo, String cargo) {
        super(id, Cc, nombre, apellido, domicilio, telefono);
        this.carnet = carnet;
        this.Sueldo = sueldo;
        this.Cargo = cargo;
    }


    public int getCarnet() {
        return carnet;
    }


    public void setCarnet(int carnet) {
        this.carnet = carnet;
    }


    public double getSueldo() {
        return Sueldo;
    }


    public void setSueldo(double sueldo) {
        Sueldo = sueldo;
    }


    public String getCargo() {
        return Cargo;
    }


    public void setCargo(String cargo) {
        Cargo = cargo;
    }
    
}
