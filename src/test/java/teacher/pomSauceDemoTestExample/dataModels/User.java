package teacher.pomSauceDemoTestExample.dataModels;

public class User {
    public static int counter=0;
    private String login;
    private String password;
    private String type;

    public User(String login, String password, String type) {
        this.login = login;
        this.password = password;
        this.type = type;
        counter++;
    }
    public static int getCounter() {
        return counter;
    }

    public static void setCounter(int counter) {
        User.counter = counter;
    }
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
