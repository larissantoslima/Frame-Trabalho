package br.unipar.singleton;

/**
 *
 * @author larissa.lima
 */
public class Singleton {

    public static void main(String[] args) {
        UserManager user = UserManager.getInstance();
        Usuario users =  new Usuario("login", "Lari123", "Larissa Lina");
        user.set(users, users.getNome());
        UserManager otherUser = UserManager.getInstance();
        System.out.println(otherUser.get(users));
        user.set(users, users.getLogin());
        otherUser = UserManager.getInstance();
        System.out.println(otherUser.get(users));
    }
}
