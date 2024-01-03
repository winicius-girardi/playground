package Entrega.Compass.EstoqueProduto;

import java.util.ArrayList;

public class ProdutoArray {


    public   void iniciaArray(ArrayList<Produto> produtoArrayList){
        produtoArrayList.add(new Produto("Coca-Cola",1,5.00,10));
        produtoArrayList.add(new Produto("Pepsi",2,4.00,10));
        produtoArrayList.add(new Produto("Fanta",3,3.00,10));
        produtoArrayList.add(new Produto("Guarana",4,2.00,10));
        produtoArrayList.add(new Produto("Sprite",5,1.00,10));



    }

    public void addProduto(ArrayList<Produto> produtoArrayList,String nome,int codigo,double preco,int quantidadeEstoque){
        for (Produto produto:produtoArrayList){
            if (produto.getCodigo()==codigo){
                System.out.println("Codigo fornecido ja foi cadastrado\n\n");
                return;
            }
        }

        produtoArrayList.add(new Produto(nome,codigo,preco,quantidadeEstoque));
    }

    public  void printaArray(ArrayList<Produto> produtoArrayList){
        for (Produto produto:produtoArrayList){
            System.out.println(produto);
        }
    }
    public  void addEstoque(ArrayList<Produto> produtoArrayList,int codigo,int quantidadeEstoque){
        for (Produto produto:produtoArrayList){
            if (produto.getCodigo()==codigo){
                produto.addEstoque(quantidadeEstoque);
                System.out.println(produto);
                return;
            }
        }
        System.out.println("Produto com codigo "+codigo+" nao encontrado\n\n");
    }
    public void remEstoque(ArrayList<Produto> produtoArrayList,int codigo,int quantidadeEstoque){
        for (Produto produto:produtoArrayList){
            if (produto.getCodigo()==codigo){
                produto.remEstoque(quantidadeEstoque);
                System.out.println(produto);
                return;
            }
        }
        System.out.println("Produto com codigo "+codigo + " nao encontrado");
    }


}
