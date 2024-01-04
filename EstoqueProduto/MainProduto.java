package Entrega.Compass.EstoqueProduto;


import java.util.ArrayList;

public class MainProduto {




    public static void main(String[] args){

        ArrayList<Produto> produtoArrayList=new ArrayList<>();
        ProdutoArray prodArrayHandler=new ProdutoArray();
        prodArrayHandler.iniciaArray(produtoArrayList);
        System.out.println("PRODUTOS INICIAIS\n\n");
        prodArrayHandler.printaArray(produtoArrayList);
        System.out.println("ADICIONANDO ESTOQUE\n\n");
        prodArrayHandler.addEstoque(produtoArrayList,1,10);
        prodArrayHandler.addEstoque(produtoArrayList,2,10);
        System.out.println("REMOVENDO ESTOQUE\n\n");
        prodArrayHandler.remEstoque(produtoArrayList,1,10);
        prodArrayHandler.remEstoque(produtoArrayList,2,1000);
        prodArrayHandler.addProduto(produtoArrayList,"Coca-Cola",1,5.00,10);
        prodArrayHandler.addProduto(produtoArrayList,"Pepsi",10,4.00,10);


    }



}
