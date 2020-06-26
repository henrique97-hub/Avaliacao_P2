package Models;

/**
 * Interface será implementada em usuario, para autenticar o login
 */
public interface Autentica {
    public void login(String nome, String email, int senha);

}
