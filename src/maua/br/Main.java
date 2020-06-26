package maua.br;

import Models.Usuario;
/**
 * Classe ponto de entrada da aplicação base.<br>
 * Atraves dela é possivel iniciar o projeto proposto para a avaliação P1
 * @author Henrique Silva Godoy - RA: 16.01147-3
 * @since 26/06/2020 - Ultimas modificações nesta data
 */

public class Main {
    public static void main(String[] args) {
        System.out.println("Só é possivel alterar pedidos ou criar pedidos com o login!");
        Usuario u1 = new Usuario();
        u1.login("pizza","pizzaria@pizzaria",123456);
        System.out.println("---------------------------------------");
        u1.criarPedidos("pizza 4 queijos e coca",40.60,"preparacao","dinheiro");
        System.out.println("---------------------------------------");
        u1.verificarPedidos();
        System.out.println("---------------------------------------");
        u1.alterarPedidos("devolvido");
        System.out.println("---------------------------------------");
        System.out.println("0 - sair");
        System.out.println("Para sair, mudar o usuario ou email ou a senha do usuario");
    }


/**
 * Tentei fazer o menu pelo switch, mas nao consegui "rodar"
 */
       /*switch (menu) {
            case 1:
                System.out.println("Nova venda");
                u1.login("pizza", "pizzaria@pizzaria", 123456);
                System.out.println("-----------------------------------------------");
                break;
            case 2:
                System.out.println("Verificar Pedidos");
                u1.verificarPedidos();
                break;

            case 3:
                System.out.println("Alterar pedidos");
                u1.alterarPedidos("SAIU_PARA_ENTREGA");
            case 0:
                System.out.println("sair");
                u1.login("x","x",0);

        } */



    }

