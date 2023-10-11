
package br.unipar.factorymethod;

import br.unipar.factorymethod.hamburguerVegano.VeganController;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author larissa.lima
 */
public class ProdutoController extends VeganController {

    public void listProduct(){
        //aqui pega os dados do banco
        Map<String, Object> context = new HashMap<>();
        //Context é populado
        render("productsView.html", context);
    }

}
