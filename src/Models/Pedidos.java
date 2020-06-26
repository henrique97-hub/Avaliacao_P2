package Models;

import java.util.Random;

public class Pedidos {
        protected String id;
        protected String descricao;
        protected double valor;

// metodos especiais

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }


// metodos publicos e privados

    private String geradorId(){
    Random random = new Random();
    String idGerado = "";
    for (int i = 0; i < 3; i++)
        idGerado += random.nextInt(10);
    return idGerado;}


    public void criarPedidos(String descricao, double valor){


    }


}