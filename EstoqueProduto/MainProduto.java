package Entrega.Compass.EstoqueProduto;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MainProduto {

    public static void criaSetProduto(Set<Produto> produtoSet){
        int id=0;
        produtoSet.add(new Produto("farinha", id++, 20, 5));
        produtoSet.add(new Produto("arroz", id++, 2, 35));
        produtoSet.add(new Produto("feijao", id++, 120, 20));
        produtoSet.add(new Produto("trigo", id++, 25, 50));
        produtoSet.add(new Produto("queijo", id, 10, 100));
    }
    public static void printaSet(Set<Produto> produtoSet){
        for(Produto prod:produtoSet){
            System.out.println(prod.toString());
        }
    }
    public static void testeSet(Set<Produto> produtoSet){


    }


    public static void main(String[] args){

        Set<Produto> produtoSet = new HashSet<Produto>();
        criaSetProduto(produtoSet);
        printaMap(produtoSet);
        testeMap(produtoSet);


    }



}
