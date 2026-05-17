package Access;

public class Access {
    private int username;
    private int password;
    String name ;

    public Access(String name) {
        this.name = name;
    }

    public int getUsername() {
        return username;
    }

    public void setUsername(int username) {
        this.username = username;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }
}
