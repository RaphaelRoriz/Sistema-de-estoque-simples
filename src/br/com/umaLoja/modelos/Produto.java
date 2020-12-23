package br.com.umaLoja.modelos;

public  class Produto {

    private int id;
    private double preco;
    private String marca;
    private int quantidade = 0;
    private double valorEmEstoque = 0;
    private String tipo;

    public Produto(int id,String marca,String tipo,double preco){
        this.id = id;
        this.marca = marca;
        this.preco = preco;
        this.tipo = tipo;
    }

    public Produto(int id){
        this.id = id;
    }

    @Override
    public boolean equals(Object produto ){
        Produto aux = (Produto) produto;
        return this.getId().equals(aux.getId());
    }

    private Object getId() {
        return this.id;
    }


    public void addQuantidade(int quantidade) {

        this.quantidade += quantidade;

    }

    public int getQuantidade() {
        return this.quantidade;
    }

    @Override
    public String toString(){
        return "[ ID: " + this.getId() + " | Marca: " + this.getMarca() +
            " | Preço: " + this.getPreco() + " | Quantidade: " + this.getQuantidade() + " | Tipo: "+ this.getTipo();
    }

    public String getTipo() {
        return this.tipo;
    }

    public double getPreco() {
        return this.preco;
    }

    public String getMarca() {
        return this.marca;
    }

    public double getValorEmEstoque(){
        return this.getQuantidade() * this.getPreco();
    }
}
