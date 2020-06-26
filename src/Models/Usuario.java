package Models;

public class Usuario extends Pedidos implements Autentica {
// atributos
    private String name = "pizzaria";
    private String email = "pizzaria@pizzaria";
    private int senha = 123456;

// implementa o metodo abstrato da interface do login
    @Override
    public void login(String nome, String email, int senha) {

    }
// metodos especiais

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
}
