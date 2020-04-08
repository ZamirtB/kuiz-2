import unac.edu.co.Lista;
import java.io.File;
import java.math.BigInteger;
import java.util.Scanner;

public class Archivo {
        static Scanner input;
        int arregloCadena;
        private static String leerImprimirLinea() {
            Lista listadb;
            listadb = new Lista();
            String line = input.nextLine();
            System.out.println("\n" + line);
            for (int i = 0; i < line.length(); i++) {
                char c = line.charAt(i);
                int a = Integer.parseInt(Character.toString(c));
                listadb.Insertar(a);
                // System.out.print(c + " ");
            }
            System.out.println(" ");
            System.out.println("Lista: ");
            listadb.visualizar();
            return line;
        }
        public static void main(String[] a) {
            Lista listadb;
            listadb = new Lista();
            String cadena1;
            String cadena2;
            BigInteger intGrande1;
            BigInteger intGrande2;
            BigInteger intGrande3;
            try {
                input = new Scanner(new File("numeros.txt"));
                cadena1 = leerImprimirLinea();
                cadena2 = leerImprimirLinea();
                intGrande1 = new BigInteger(cadena1);
                intGrande2 = new BigInteger(cadena2);
                intGrande3 = intGrande2.add(intGrande1);
                System.out.println(" ");
                System.out.println("El valor de la suma es: " + intGrande3);
            } catch (
                    Exception ex) {
                ex.printStackTrace();
            }
        }
    }

