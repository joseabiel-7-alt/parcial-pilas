import java.util.Scanner;
import java.util.Stack;
public class menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        validaciones v = new validaciones();
        metodos l = new metodos();
        Stack<objweb> p = new Stack<>();
        Boolean ban = true;
        while (ban) {
            System.out.println("INICIO");
            System.out.println("Que desea hacer:");
            System.out.println("1: Ingresar URL: ");
            System.out.println("2: Pagina anterior: ");
            System.out.println("3: Historial: ");
            System.out.println("4: Salir");
            int opt = v.ValidarEntero(scanner);
            scanner.nextLine();
            
            switch (opt) {
                case 1:
                    p = l.llenarweb(p, scanner);

                    break;
                case 2:

                    l.anterior(p);

                    break;
                case 3:
                    l.mostrar(p);
                    break;

                case 4:
                    System.out.println("Hasta la proxima.");

                    ban = false;
                    break;

                default:
                    System.out.println("opcion no valida");
                    break;
            }

        }
    }
}
