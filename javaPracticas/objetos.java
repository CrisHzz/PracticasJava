public class objetos{
    public static void main(String[] args) { //Clase main
        doctor firstDoctor =new doctor();
        firstDoctor.setname("Neider Machado"); //Cree un objeto y le puse el nombre.
        firstDoctor.setid("47");
        firstDoctor.setspeciality("Surgeon");
        firstDoctor.show_name(); //Cree un metodo para mostrar el nombre
        firstDoctor.show_id();
        firstDoctor.show_speciality();       
        
    }
}

 class doctor{
    String id;
    String name;
    String speciality;

 public void setname(String name){ //Asignar atributo a funcion
   this.name=name;
 }
 public void setid(String id){
   this.id=id;
 }

 public void setspeciality(String speciality){
   this.speciality=speciality;
 }

 public void show_name(){
    System.out.print(name);
 }
 public void show_id(){
    System.out.println(id);
 }
 public void show_speciality(){
    System.out.print(speciality);
 }

 }   

