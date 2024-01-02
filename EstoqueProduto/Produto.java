package Entrega.Compass.EstoqueProduto;

import java.util.ArrayList;

public class Produto {
    private String nome;
    private int codigo;
    private double preco;
    private int quantidadeEstoque;


    public Produto(String nome,int codigo, double preco,int quantidadeEstoque){
        this.quantidadeEstoque=quantidadeEstoque;
        this.preco=preco;
        this.nome=nome;
        this.codigo=codigo;
    }



    public void addEstoque(int quantidadeEstoque){
        this.quantidadeEstoque+=quantidadeEstoque;

    }

    public boolean equals(Produto prod){
        return this.codigo == prod.codigo;
    }


    public void remEstoque(int quantidadeEstoque){
        if (quantidadeEstoque>this.quantidadeEstoque){
                System.out.println("Estoque nao tem quantidade disponivel");
                return;}
        this.quantidadeEstoque-=quantidadeEstoque;
    }
    public String toString(){
        return "Produto: "+nome+"\nCodigo: "+codigo+"\nPreco: "+preco+"\nEm Estoque: "+quantidadeEstoque +" unidades\n\n\n";
    }

}
