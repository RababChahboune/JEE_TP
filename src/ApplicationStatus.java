import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;

/**
 * Created by Rabab Chahboune on 2/22/2017.
 */
@ManagedBean
//@ApplicationScoped
@ApplicationScoped
public class ApplicationStatus implements Serializable {
    int value= 0;
    public Integer getCounter(){
        return  ++value;
    }

    @PostConstruct
    void init(){
        System.err.println("Create "+this);
    }

    @PreDestroy
    void close(){
        System.err.println("Close "+this);
    }
}
