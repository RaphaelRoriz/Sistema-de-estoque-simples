package br.com.umaLoja.modelos;

public class Mouse extends Produto{

    private int dpi;
    private String tipo = "Mouse";

    public Mouse(int id, String marca, double preco,int dpi) {
        super(id, marca, "Mouse", preco);
        this.dpi = dpi;
    }

    @Override
    public String toString(){
        return super.toString()  + " | DPI: " + this.getDpi() +
                "dpi ]";
    }




    private int getDpi() {
        return this.dpi;
    }
}
