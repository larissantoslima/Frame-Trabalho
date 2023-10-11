
package br.unipar.factorymethod.hamburguerAngus;

import java.util.Map;

/**
 *
 * @author larissa.lima
 */
public class Controller {

    public void render(String viewName, Map<String, Object> context){
        ViewEngine engine = createViewEngine();
        String html = engine.render(viewName, context);
        System.out.println(html);
    }

    protected ViewEngine createViewEngine(){
        return new AngusViewEngine();
    }
}