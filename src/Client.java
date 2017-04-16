import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

/**
 * Created by Rabab Chahboune on 3/6/2017.
 */
@ManagedBean
@SessionScoped

public class Client {
    private String name;
    private  String lName;
    private  int age;
    private  String password;
    private String adresse;

    public Client() {
    }

    public Client(String name, String lName,int age, String password, String adresse) {
        this.name = name;
        this.lName = lName;
        this.age = age;
        this.password = password;
        this.adresse = adresse;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        this.lName = lName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }
}
