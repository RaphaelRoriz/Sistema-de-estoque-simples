package br.com.umaLoja.modelos;

import java.util.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.NoSuchElementException;

public class Estoque {

    private ArrayList<Produto> produtos = new ArrayList<>();


    private Produto getProduto(Produto produto) {

        if (this.produtos.contains(produto)) {
            for (Produto aux : this.produtos) {
                if (aux.equals(produto)) {
                    return aux;
                }
            }
        }
        return null;
    }

    public void adicionarProduto(Produto produto, int quantidade) {

        Produto aux = this.getProduto(produto);

        if (aux != null) {
            aux.addQuantidade(quantidade);
        } else {
            produto.addQuantidade(quantidade);
            this.produtos.add(produto);
        }
    }

    public void adicionarProduto(int id, int quantidade) {

        Produto aux = new Produto(id);
        this.adicionarProduto(aux, quantidade);

    }

    public void removerProduto(Produto produto, int quantidade) {

        Produto aux = this.getProduto(produto);

        if (aux != null) {
            int novaQuantidade = aux.getQuantidade() - quantidade;
            if (novaQuantidade == 0) {
                this.produtos.remove(aux);
            } else if (novaQuantidade < 0) {
                System.out.println("Não há quantidade suficiente");
                //lançar exceção
            } else {
                aux.addQuantidade(-quantidade); //gambiarra?
            }
        }

    }

    public void removerProduto(int id, int quantidade) {

        Produto aux = new Produto(id);
        this.removerProduto(aux, quantidade);

    }

    public List getProdutos() {
        return Collections.unmodifiableList(this.produtos);
    }

    public void gerarRelatorio() {

        System.out.println("----Relatorio de estoque---- \n");

        double totalEmEstoque = 0;
        for(Produto aux : this.produtos){
            System.out.println("Tipo: " + aux.getTipo() + " | Marca: " + aux.getMarca() + " | Valor em estoque: R$" + aux.getValorEmEstoque());
            totalEmEstoque += aux.getValorEmEstoque();
        }
        System.out.println("Total em estoque: R$" + totalEmEstoque);
    }

//    public ?? historico(){
//        return historicoTransacoes
//    }


}
