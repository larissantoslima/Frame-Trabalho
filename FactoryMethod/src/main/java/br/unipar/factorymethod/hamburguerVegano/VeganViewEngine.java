
package br.unipar.factorymethod.hamburguerVegano;

import br.unipar.factorymethod.hamburguerAngus.ViewEngine;
import java.util.Map;

/**
 *
 * @author larissa.lima
 */
public class VeganViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context) {
        return "Hamburguer Vegano" +
                "\nHamburgues de grão de bico" +
                "\nAlface" +
                "\nTomate";
    }
}
