
package br.unipar.factorymethod.hamburguerAngus;

import java.util.Map;

/**
 *
 * @author larissa.lima
 */
public class AngusViewEngine implements ViewEngine {
    @Override
    public String render(String viewName, Map<String, Object> context){
        return "Hamburguer Angus" +
                "\nCarne Angus" +
                "\nQueijo Cheddar" +
                "\nMolho Especial";
    }
}
