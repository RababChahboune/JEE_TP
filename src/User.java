import javax.faces.bean.ManagedBean;

/**
 * Created by Rabab Chahboune on 3/3/2017.
 */
@ManagedBean
public class User {
    private String login;
    private String password;
    private String role;
    private Users users;
    private Clients clients;

    public User() {
        users = new Users();
        users.fillUsers();
        clients = new Clients();
        clients.fillClients();
    }

    public User(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public User(String login, String password, String role) {
        this.login = login;
        this.password = password;
        this.role = role;
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

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String action(){
        User u = users.getUserByLogin(login);
        if(u!=null){
            switch(users.getUserByLogin(login).getRole()){
                case "client":
                    return "client.xhtml";
                case "manager":
                    return "manager.xhtml";
                case "admin":
                    return "admin.xhtml";
                default: return "error.xhtml";
            }
        }else{
            return "error.xhtml";
        }


    }
}
