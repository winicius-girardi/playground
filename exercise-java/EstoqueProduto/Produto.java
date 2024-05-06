package Entrega.Compass.EstoqueProduto;


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

    public int getCodigo() {
        return codigo;
    }

    public void addEstoque(int quantidadeEstoque){
        this.quantidadeEstoque+=quantidadeEstoque;

    }



    public void remEstoque(int quantidadeEstoque){
        if (quantidadeEstoque>this.quantidadeEstoque){
                System.out.println("Estoque nao tem quantidade necessaria\n\n");
                return;}
        this.quantidadeEstoque-=quantidadeEstoque;
    }
    public String toString(){
        return "Produto: "+nome+"\nCodigo: "+codigo+"\nPreco: "+preco+"\nEm Estoque: "+quantidadeEstoque +" unidades\n\n\n";
    }

}
