/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Sessions;

import Entitys.Cliente;
import java.util.List;
import javax.ejb.Local;

/**
 *
 * @author Xime
 */
@Local
public interface ClienteFacadeLocal {

    void create(Cliente cliente);

    void edit(Cliente cliente);

    void remove(Cliente cliente);

    Cliente find(Object id);

    List<Cliente> findAll();

    List<Cliente> findRange(int[] range);

    int count();

    public List<Cliente> listarCliente();
    
}
