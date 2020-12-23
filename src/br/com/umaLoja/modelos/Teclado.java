package br.com.umaLoja.modelos;

public class Teclado extends Produto {

    private int tamanho;

    public Teclado(int id, String marca, double preco,int tam) {
        super(id, marca,"Teclado" ,preco);
        this.tamanho = tam;
    }

    @Override
    public String toString(){
        return super.toString() +  " | Tamanho: " +
                this.getTamanho() + "% ]";
    }

    private int getTamanho() {
        return this.tamanho;
    }



}
