
package Main;

import DAO2.*;
import Entidades2.*;

import java.util.Scanner;

public class Prueba {
    public static void main(String[] args) {
        Scanner tcl = new Scanner(System.in);
        ClientesPotenciale c=new ClientesPotenciale();
        ClientesPotencialesDao cd=new ClientesPotencialesDao();

        System.out.println("Nombre del Cliente: ");
        c.setNombre(tcl.nextLine());
        System.out.println("Apellido del Cliente: ");
        c.setApellidos(tcl.nextLine());
        System.out.println("Direccion del Cliente: ");
        c.setCorreo(tcl.nextLine());
        System.out.println("ok");
        System.out.println(c.getNombre()+" "+c.getApellidos()+" "+c.getCorreo());
        cd.insertar(c);
    }
}
