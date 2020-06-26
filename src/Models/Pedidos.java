package Models;

import java.util.Random;

public class Pedidos {
        protected String id;
        protected String descricao;
        protected double valor;
        protected String estado;
        protected String pegamentos;

// metodos especiais

    public String getId() {
        return id;}

    public void setId(String id) {
        this.id = id;}

    public String getDescricao() {
        return descricao; }

    public void setDescricao(String descricao) {
        this.descricao = descricao; }

    public double getValor() {
        return valor;}

    public void setValor(double valor) {
        this.valor = valor; }

    public String getEstado() {
        return estado; }

    public void setEstado(String estado) {
        this.estado = estado; }

    public String getPegamentos() {
        return pegamentos; }

    public void setPegamentos(String pegamentos) {
        this.pegamentos = pegamentos; }


    // metodos publicos e privados

    private String geradorId(){
    Random random = new Random();
    String idGerado = "";
    for (int i = 0; i < 3; i++)
        idGerado += random.nextInt(10);
    return idGerado;}

    // verificar senha
    public void criarPedidos(String descricao, double valor, String estado, String pagamentos){
        this.descricao = descricao;
        this.valor = valor;
        if (estado == "preparacao"){
            System.out.println("O pedido esta: " +Estado.PREPARACAO);
        } else {
            System.out.println("erro de estado");
        }
        System.out.println("O pedido foi criado com sucesso!");
        System.out.println("O id do pedido é: "+this.geradorId());
        System.out.println("O pedido é: "+this.getDescricao());
        System.out.println("O valor do pedido é: "+this.getValor());
        System.out.println("O estado do pedido é:" +this.estado);
        if (pagamentos == "dinheiro"){
            System.out.println("A forma de pagamento é: "+Pagamentos.DINHEIRO);
        } else if (pagamentos == "debito"){
            System.out.println("A forma de pagamento é: "+Pagamentos.DEBITO);
        } else if (pagamentos =="credito"){
            System.out.println("A forma de pagamento é :"+Pagamentos.CREDITO);}
        else if (pagamentos == "va"){
        System.out.println("A forma de pagamento é:" +Pagamentos.VALE_ALIMENTACAO);
    }  else if (pagamentos == "vr"){
            System.out.println("A forma de pagamento é:" +Pagamentos.VALE_REFEICAO);}
        else {
            System.out.println("Forma de pagamento não aceita");
        }
    }

    public void alterarPedidos(String estado){
       // verificar senha
        this.setEstado(this.getEstado());
    }

    public void verificarPedidos(){
        System.out.println("Informaçoes gerais do pedido:");
        System.out.println("o id do pedido é: " +this.geradorId());
        System.out.println("O valor do pedido é: "+this.getValor());
        System.out.println("A forma de pagamento é: "+this.getPegamentos());
        System.out.println("O estado do pedido é: "+this.getEstado());
    }

}