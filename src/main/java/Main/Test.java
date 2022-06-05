
package Main;

import DAO.ClientesDAO;
import Entidades.Clientes;
import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
         Scanner tcl = new Scanner(System.in);
         Clientes c=new Clientes();
         ClientesDAO cd=new ClientesDAO();
    
         c.setNombre(tcl.nextLine());
         c.setApellidos(tcl.nextLine());
         cd.insertar(c);
    }
}
