import java.util.ArrayList; //Si se desea usar un array list se importa

public class Arreglos {
    public static void main(String[] args) {
        String[] worstYears = new String[4]; //Creo una lista De tipo String que posee un maximo de elementos 4
        String[] BestDay = new String[1];
        ArrayList<String> medication = new ArrayList<>(); //Creacion de una array list de tipo String sin elementos limitados
        worstYears[0] = "2018";
        worstYears[1] = "2019";
        worstYears[2] = "2020";
        worstYears[3] = "2023";
        for (String worstYear : worstYears) { //Una forma de imprimir arreglos en java
            System.out.println(worstYear);
        }
        medication.add(0, "Cream");
        medication.add(1, "Pills");
        medication.add(2, "Med kit");
        medication.add(3, "Medicine");
        System.out.println(medication); //Los array list no necesitan un for para ser impresos

        BestDay[0] = "Thursday";
        for (String i : BestDay) { //Un for con un I iterativo con el tipo de dato que es la lista y se imprime
            System.out.println(i);
        }
        String[][] fichas = new String[5][2]; //Creacion de un arreglo de 5 filas y 2 columnas con capacidad total de 10

        //Creacion de un ArrayList bidimensional en java

        ArrayList<ArrayList<String>> test = new ArrayList<ArrayList<String>>(); //Creo el Array list de tipo que reciba otro arraylist
        ArrayList<String> fila1 = new ArrayList<>(); //Creo la subfila de mi arreglo
        fila1.add("Elemento 1-1");  //Añado un elemento ahi
        test.add(fila1); //Añado la nueva fila en el Arraylist inicial

        ArrayList<String> fila2 = new ArrayList<>();
        fila2.add("Elemento 2-1");
        test.add(fila2);

        for (ArrayList<String> fila : test) { //Recorro un iterador llamado fila en el arreglo grande
            for (String elemento : fila) {   //Recorre el nuevo iterador en el pasado y que me imprima el elemento
                System.out.print(elemento + " ");
            }
        }
    }
}
