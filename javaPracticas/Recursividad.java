import java.util.Arrays;

public class Recursividad {
    public static void main(String[] args) {
        int hola = RecursividadSuma(5);
        System.out.println(hola);
        int sad = factorial(5);
        System.out.println(sad);
        int[] what = {1, 3, 4, 5};
        MostrarArray(what, 0);
        Object[] arreglo = { 1, "dos", 3.0, true, 'c' };
        int tamaño = tamanoArreglo(arreglo);
        System.out.println("Tamaño del arreglo: " + tamaño);
    }

    public static int RecursividadSuma(int a) {
        int resultado;
        if (a == 1) {
            return 1;

        } else {
            resultado = a + RecursividadSuma(a - 1);

        }

        return resultado;
    }

    public static int factorial(int b) {
        int prueba = 1;
        if (b == 0) {
            return 1;
        } else {
            prueba = b * factorial(b - 1);
        }
        return prueba;
    }

    public static void MostrarArray(int[] Arreglo, int indice) {
        if (indice != Arreglo.length) {
            System.out.println(Arreglo[indice]);
            MostrarArray(Arreglo, indice + 1);
        }
    }

    public static int tamanoArreglo(Object[] arreglo) {
        if (arreglo == null || arreglo.length == 0) {
            return 0;
        } else {
            return 1 + tamanoArreglo(Arrays.copyOfRange(arreglo, 1, arreglo.length));
        }
    }


}

