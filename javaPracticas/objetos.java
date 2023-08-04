
public class objetos{
   public static void main(String[] args) { //Clase main
      doctor firstDoctor =new doctor(); //Creo el objeto doctor first doctor
      firstDoctor.name="Neider galvis"; //Le asigno un nombre
      firstDoctor.show_name(); //Metodo para mostrar el nombre
      firstDoctor.show_id();
      firstDoctor.speciality=("Surgeon");
      firstDoctor.show_speciality();
            
   }
}

class doctor{
   static int id=0; //Lo pongo estatico porque quiero que se lo inacializo en 0
   String name;
   String speciality;
   
   doctor(){
      System.out.println("Se esta construyendo el doctor"); //Cada vez que se cree un doctor le pone un +1
      id++;
   } 
      
   
   public void show_name(){
      System.out.println("Bienvenido doctor"+""+name); //metodo
   }
   public void show_id(){
     System.out.println("Doctor N°"+""+id);   
   }
   public void show_speciality(){
      System.out.println("Tiene un especialista en "+""+speciality);
   }
}

