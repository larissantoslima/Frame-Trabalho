
package br.unipar.factorymethod;

import br.unipar.factorymethod.hamburguerAngus.Controller;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author larissa.lima
 */
public class ProdutoController2 extends Controller {
    public void listProduct(){
        //aqui pega os dados do banco
        Map<String, Object> context = new HashMap<>();
        //Context é populado
        render("productsView.html", context);
    }
}
