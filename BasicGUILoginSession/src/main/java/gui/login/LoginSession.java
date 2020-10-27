package gui.login;

public class LoginSession {
    static User current; 
    User allUser[] = new User[3];

    public LoginSession() {
        allUser[0] = new User("root","root");
        allUser[1] = new User("Piggii","piggii");
    }
    
    public boolean SystemLogin(String u, String p) {
        boolean result = false;
        for(int i = 0; i < allUser.length; i++) {
            if(allUser[i].login(u,p)) {
                current = new User(u,p);
                return true;
            }
        }
        return false;
    }
}
