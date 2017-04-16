import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import java.util.ArrayList;

/**
 * Created by Rabab Chahboune on 3/6/2017.
 */
@ManagedBean
@SessionScoped
public class Clients {
    public ArrayList<Client> clients;

    public Clients() {
        clients = new ArrayList<>();
        this.fillClients();
    }

    public ArrayList<Client> getClients() {
        return clients;
    }

    public void setClients(ArrayList<Client> clients) {
        this.clients = clients;
    }
    void fillClients(){
        clients.add(new Client("rabab","chahboune",21,"12346","rabab@rabab.com"));
        clients.add(new Client("rabab","chahboune",21,"12346","rabab@rabab.com"));
        clients.add(new Client("rabab","chahboune",21,"12346","rabab@rabab.com"));

    }
    public void add(String name, String lName,int age, String password, String adresse){
        clients.add(new Client(name,lName,age,password,adresse));
    }

}
