public class objetos{
    public static void main(String[] args) {
        doctor firstDoctor =new doctor();
        firstDoctor.name("Neider Machado");
        firstDoctor.id("47");
        firstDoctor.speciality("Surgeon");
        firstDoctor.show_name();
        firstDoctor.show_id();
        firstDoctor.show_speciality();       
        
    }
}

public class doctor{
    int id;
    String name;
    String speciality;

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

