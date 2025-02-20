public class LoginController {
    private LoginForm view;
    private LoginModel model;

    public LoginController(LoginForm view) {
        this.view = view;
        this.model = new LoginModel();
    }

    public void handleLogin(String username, String password) {
        if (model.validateUser(username, password)) {
            view.showMessage("Đăng nhập thành công!");
        } else {
            view.showMessage("Sai tên đăng nhập hoặc mật khẩu.");
        }
    }
}

