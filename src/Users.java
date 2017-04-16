import java.util.ArrayList;

/**
 * Created by Rabab Chahboune on 3/3/2017.
 */
public class Users {
    public ArrayList<User> users;

    public Users() {

        users = new ArrayList<>();
    }

     ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    void fillUsers(){
        users.add(new User("rabab","rabab","client"));
        users.add(new User("maze","maze","manager"));
        users.add(new User("chahboune","chahboune","admin"));
    }

     User getUserByLogin(String login){

        for (User u: getUsers()){
            if(u.getLogin().equals(login)){
                return u;
            }
        }
        return null;
    }



}

