package Logic;

import Interfaces.Sellable;

import java.util.*;

public class Webshop {
    List<Sellable> sellables = new ArrayList<>();

    void addProduct(Sellable sellable){
        sellables.add(sellable);
    }

    List<Sellable> getProducts(){
        return sellables;
    }

    void buyProduct(Sellable sellable){
        sellables.remove(sellable);
    }

}
