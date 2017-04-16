import javax.faces.bean.ManagedBean;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created by Rabab Chahboune on 2/20/2017.
 */
@ManagedBean
public class Hello {
    private String hello = "Hello there it is : ";

    public String getHello() {
        return hello;
    }

    public void setHello(String hello) {
        this.hello = hello;
    }

    public String getTime(){
         return hello+new SimpleDateFormat("HH:mm:ss").format(new Date());
    }
}
