package Models;

import java.util.Random;
/**
 * @author Henrique Silva Godoy - RA: 16.01147-3
 * Classe que permite criar os pedidos juntamente com seus métodos.
 */

public class Pedidos {
        protected String id;
        protected String descricao;
        protected double valor;
        protected String estado;
        protected String pegamentos;

// metodos especiais

    /**
     * Estes sao os metodos especiais, responsaveis por ATRIBUIR ou RESGATAR
     * paramentros dos metodos (publicos/privados) cirados logo em sequencia
     * @return
     */
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


    /**
     * Metodos privado que gera um id
     * @return retorna o id de cada pedido
     */

    private String geradorId(){
    Random random = new Random();
    String idGerado = "";
    for (int i = 0; i < 3; i++)
        idGerado += random.nextInt(10);
    return idGerado;}

    // verificar senha

    /**
     * Metodo que cira o pedido
     * @param descricao - define qual é a comida que o cliente quer (tipo String)
     * @param valor - define o valor que o cliente terá que pagar(tipo Double)
     * @param estado - define o estado que o pedido esta
     * @param pagamentos - define os tipos de pagamentos aceitos, sendo eles: dinheiro, debito, credito,
     *                   va = "vale alimentaçao" e vr = "vale refeição"
     *
     */
    public void criarPedidos(String descricao, double valor, String estado, String pagamentos){
        this.descricao = descricao;
        this.valor = valor;
        System.out.println("1- Nova venda");
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

    /**
     *
     * @param estado
     * parametro que define o tipo de estado
     */
    public void alterarPedidos(String estado){
       // verificar senha
        System.out.println("3- Alterar pedidos");
       this.setEstado(this.getEstado());
        System.out.println("o novo estado é: "+getEstado());
    }


    /**
     * Esse é um metodo publico, responsavel por verificar os pedidos que ja
     * foram feitos
     */
    public void verificarPedidos(){
        System.out.println("2- Verificar pedidos");
        System.out.println("o id do pedido é: " +this.geradorId());
        System.out.println("O valor do pedido é: "+this.getValor());
        System.out.println("A forma de pagamento é: "+getPegamentos());
        System.out.println("O estado do pedido é: "+getEstado());
    }


}