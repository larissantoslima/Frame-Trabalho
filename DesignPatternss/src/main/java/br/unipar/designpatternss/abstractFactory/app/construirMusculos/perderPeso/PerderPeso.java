
package br.unipar.designpatternss.abstractFactory.app.construirMusculos.perderPeso;

import br.unipar.designpatternss.abstractFactory.IPerderPeso;

/**
 *
 * @author larissa.lima
 */
public class PerderPeso implements IPerderPeso {
    @Override
    public void render() {
        System.out.println("Perdendo peso");
    }
}

