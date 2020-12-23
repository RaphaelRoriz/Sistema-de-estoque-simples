package br.com.umaLoja.modelos;

public class FoneDeOuvido extends Produto {

    private int potencia;

    public FoneDeOuvido(int id, String marca, double preco,int pot) {
        super(id, marca,"Fone de ouvido" ,preco);
        this.potencia = pot;
    }

    @Override
    public String toString(){
        return super.toString() + " | Potencia: " +
                this.getPotencia() + "W ]";
    }

    private int getPotencia() {
        return this.potencia;
    }
}
