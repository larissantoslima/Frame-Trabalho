
package br.unipar.factorymethod.hamburguerVegano;

import br.unipar.factorymethod.hamburguerAngus.Controller;
import br.unipar.factorymethod.hamburguerAngus.ViewEngine;

/**
 *
 * @author larissa.lima
 */
public class VeganController extends Controller {
    @Override
    protected ViewEngine createViewEngine(){
        return new VeganViewEngine();
    }
}
