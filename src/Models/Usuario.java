package Models;

public class Usuario extends Pedidos implements Autentica {
// atributos
    private String nome = "pizza";
    private String email = "pizzaria@pizzaria";
    private int senha = 123456;
    int menu;

// implementa o metodo abstrato da interface do login
    @Override
    public void login(String nome, String email, int senha) {
    if (getNome() == nome && this.getEmail() == email && this.getSenha() == senha){
        System.out.println("Login efetuado com sucesso");
    } else {
        System.out.println("0 - Sair");
        System.out.println("Saiu do usuario");
    }

    }
// metodos especiais

    public String getNome() {return nome;}

    public void setNome(String nome) {this.nome = nome;}

    public String getEmail() {return email;}

    public void setEmail(String email) {this.email = email;}

    public int getSenha() {return senha;}

    public void setSenha(int senha) {this.senha = senha;}





}
