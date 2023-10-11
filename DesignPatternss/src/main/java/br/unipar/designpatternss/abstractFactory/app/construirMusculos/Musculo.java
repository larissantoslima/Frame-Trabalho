
package br.unipar.designpatternss.abstractFactory.app.construirMusculos;

import br.unipar.designpatternss.abstractFactory.IGanharMusculo;

/**
 *
 * @author larissa.lima
 */
public class Musculo implements IGanharMusculo {
    @Override
    public void render() {
        System.out.println("Ganhando Musculos");
    }
}
