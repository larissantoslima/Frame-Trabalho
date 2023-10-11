package br.unipar.singleton;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author larissa.lima
 */
public class UserManager {

    private Map<Usuario, Object> user = new HashMap<>();
    private static UserManager instance = new UserManager();

    public UserManager() {
    }

    public static UserManager getInstance(){
        return instance;
    }

    public void set(Usuario key, Object value){
        user.put(key, value);
    }

    public Object get(Usuario key){
        return user.get(key);
    }

}
