package br.unipar.abstractfactory.product;

import br.unipar.abstractfactory.Box;
import lombok.Data;
@Data
public abstract class Product implements Box {

    protected final String title;
    protected final double price;

}
