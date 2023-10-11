package br.unipar.designpatternss.abstractFactory.app.construirMusculos;

import br.unipar.designpatternss.abstractFactory.IGanharMusculo;

/**
 *
 * @author larissa.lima
 */
public class GanharMusculos implements IGanharMusculo {
    @Override
    public void render() {
        System.out.println("Ganhando musculos");
    }
}
