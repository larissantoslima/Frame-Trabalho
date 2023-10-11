
package br.unipar.factorymethod;

import br.unipar.factorymethod.hamburguerAngus.Controller;
import java.util.Calendar;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author larissa.lima
 */
public class FactoryMethod {
    public static void main(String[] args) {
        Calendar.getInstance();

        new ProdutoController().listProduct();
        new ProdutoController2().listProduct();
    }
}
