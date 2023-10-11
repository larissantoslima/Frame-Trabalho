
package br.unipar.factorymethod.hamburguerAngus;

import java.util.Map;

/**
 *
 * @author larissa.lima
 */

public interface ViewEngine {
    String render(String viewName, Map<String, Object> context);
}
