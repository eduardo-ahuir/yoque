
package Main;

import DAO.*;
import Entidades.*;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
         Scanner tcl = new Scanner(System.in);
         Clientes c=new Clientes();
         ClientesDAO cd=new ClientesDAO();

        System.out.println("Nombre del Cliente: ");
         c.setNombre(tcl.nextLine());
        System.out.println("Apellido del Cliente: ");
         c.setApellidos(tcl.nextLine());
         cd.insertar(c);
    }
}
