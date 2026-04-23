
import java.util.Scanner;

public class validaciones {

    public int ValidarEntero(Scanner sc) {
        while (!sc.hasNextInt()) {
            System.out.println("Por favor digite un numero");
            sc.nextLine();
        }
        return sc.nextInt();
    }
    
 public int validarrango(int n1, int n2, int numero, Scanner sc){
        validaciones m = new validaciones();
     while (numero < n1 || numero > n2){
        System.out.println("Por favor ingrese un rango de :" + n1 + " hasta " + n2);
        numero = m.ValidarEntero(sc);
     }
     return numero;
 }

}
