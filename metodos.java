import java.util.Scanner;
import java.util.Stack;
public class metodos {

    validaciones v = new validaciones();
    public Stack <objweb> llenarweb (Stack <objweb> p, Scanner sc) {
        Boolean ing = true;
        while (ing) {
            objweb l = new objweb();
            System.out.println("Ingrese el nombre de la pagina: ");
            String url = sc.next();
            l.setUrl(url);
            System.out.println("Ingrese el titulo de la pagina: ");
            String titulo = sc.next();
            l.setTitulo(titulo);
            p.add(l);
            System.out.println("Fecha: " );
                l.setFecha(java.time.LocalDateTime.now());
            System.out.println("Desea ingresar otra pagina? \n1: Si \n2: No");
            int opt = v.ValidarEntero(sc);
            if (opt == 2) {
                ing = false;
            }
        }
    return p;
    
    }
    public void mostrar(Stack <objweb> m) {
        if (m.isEmpty()) {
            System.out.println("No hay historial");
        } else {
            for (objweb obj : m) {
                System.out.println("URL: " + obj.getUrl());
                System.out.println("Titulo: " + obj.getTitulo());
                System.out.println("Fecha: " + obj.getFecha());
                System.out.println("-------------------------");
            }
        }
    }
    
     public void anterior(Stack<objweb> m) {
        if (m.isEmpty()) {
            System.out.println("No hay historial");
        } else {
            objweb eliminada = m.pop();
            System.out.println("Saliendo de: " + eliminada.getTitulo());

            if (!m.isEmpty()) {
                System.out.println("Pagina actual: " + m.peek().getTitulo());
            } else {
                System.out.println("No hay más páginas.");
            }
        }
    }
}