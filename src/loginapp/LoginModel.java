
import java.util.HashMap;
import java.util.Map;

public class LoginModel {

    private Map<String, String> userDatabase;

    public LoginModel() {
        userDatabase = new HashMap<>();
        userDatabase.put("admin", "12345");
        userDatabase.put("user", "password");
    }

    public boolean validateUser(String username, String password) {
        return userDatabase.containsKey(username) && userDatabase.get(username).equals(password);
    }
}
