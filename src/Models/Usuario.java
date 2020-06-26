package Models;

/**
 * @author Henrique Silva Godoy - RA: 16.01147-3
 * Classe que cria o usuario e além de autenticar a interdace (Autentica) do login, herda os atributos
 * e metodos da classe Pedidos
 */

public class Usuario extends Pedidos implements Autentica {
    /**
     * Esses sao os atributos da classe Usuario
     */
    private String nome = "pizza";
    private String email = "pizzaria@pizzaria";
    private int senha = 123456;
    int menu;


    /**
     * Assina o metodo abstrato da interface do login
      * @param nome
     * @param email
     * @param senha
     * Para sair do usuario, apenas digitar senha, email ou nome que nao satisfaz o login
     */
    @Override
    public void login(String nome, String email, int senha) {
    if (getNome() == nome && this.getEmail() == email && this.getSenha() == senha){
        System.out.println("Login efetuado com sucesso");
    } else {
        System.out.println("0 - Sair");
        System.out.println("Saiu do usuario");
    }

    }

    /**
     * Esses são os metodos especiais que foram utilizados para atribuir ou resgatar
     * valores de parametros
     * @return
     */

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public int getSenha() {return senha;}

    public void setSenha(int senha) {this.senha = senha;}

}
