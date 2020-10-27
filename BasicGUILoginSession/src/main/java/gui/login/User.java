package gui.login;

public class User {
    private String user;
    private String password;

    public User() {
    }

    public User(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public boolean login(String u, String pass) {
        boolean result = false;
        if(u.equals(user) && (pass.equals(password))){
            result = true;
        }
        return result;
    } 

}
