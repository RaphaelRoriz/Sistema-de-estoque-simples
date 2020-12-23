package br.com.umaLoja.testes;

import br.com.umaLoja.modelos.Estoque;
import br.com.umaLoja.modelos.Produto;
import br.com.umaLoja.modelos.FoneDeOuvido;
import br.com.umaLoja.modelos.Mouse;
import br.com.umaLoja.modelos.Teclado;

public class TesteEstoque {

    public static void main(String[] args) {

        FoneDeOuvido f1 = new FoneDeOuvido(1,"razer",200.00,50);
        Mouse m1 = new Mouse(2,"Logitech",500.00,600);
        Teclado t1 = new Teclado(3,"Multilaser",80.00,100);
        FoneDeOuvido f2 = new FoneDeOuvido(4,"JBL",70.00,10);

        Estoque estoque = new Estoque();

        estoque.adicionarProduto(f1,100);
        estoque.adicionarProduto(1,50);
        estoque.removerProduto(1,40);

        estoque.adicionarProduto(m1,200);

        estoque.adicionarProduto(t1,400);

        estoque.adicionarProduto(f2,10);

        estoque.getProdutos().forEach( produto -> System.out.println(produto) );

        
	System.out.println();

        estoque.gerarRelatorio();


    }


}
