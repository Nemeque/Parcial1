
package parcial;
import java.util.*;

public class Parcial {

    public static void main(String[] args) {
        Categoria menu1 = new Categoria(0);
        Categoria menu2 = new Categoria(0);
        Categoria menu3 = new Categoria(0);
        String nombre;
        ArrayList<Pedido> pedidos = new ArrayList();
        Scanner s = new Scanner(System.in);
        boolean sistema = true;
        while (sistema){
            System.out.println("escriba 1 para ver las categorias de libros");
            System.out.println("escriba 2 para registrar un libro");
            System.out.println("escriba 3 para registrar un usuario");
            System.out.println("escriba 0 para cerrar el programa");
            int seleccion = s.nextInt();
            switch(seleccion) {
                case 1:
                    System.out.println("1.'Literatura' registrados:"+menu1.getCantidad());
                    System.out.println("2.'Ciencia' registrados:"+menu2.getCantidad());
                    System.out.println("3.'Historia' registrados:"+menu3.getCantidad());
                    break;
               case 2:
                    int cantidadMenu1 = 0;
                    int cantidadMenu2 = 0;
                    int cantidadMenu3 = 0;
                    System.out.println("Nombre del libro:");
                    nombre = s.nextLine();
                    nombre = s.nextLine();
                    boolean pidiendo = true;
                    while (pidiendo){
                        System.out.println("Numero de la categoria a la que pertenece el libro:");
                        int opcion = s.nextInt();
                        switch(opcion) {
                            case 1:
                                System.out.println("Cantidad a registrar");
                                cantidadMenu1 = s.nextInt();
                                break;
                            case 2:
                                System.out.println("Cantidad a registrar");
                                cantidadMenu2 = s.nextInt();
                                break;
                            case 3:
                              System.out.println("Cantidad a registrar");
                              cantidadMenu3 = s.nextInt();
                                break;         
                            case 0:
                                pidiendo = false;
                                break;
                        }
                    }
                    Pedido pedido = new Pedido(nombre, cantidadMenu1, cantidadMenu2, cantidadMenu3);
                    pedidos.add(pedido);
                    menu1.registrar(cantidadMenu1);
                    menu2.registrar(cantidadMenu2);
                    menu3.registrar(cantidadMenu3);
                    break;
                
            }
        }
    }
    }
