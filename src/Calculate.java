import javax.faces.bean.ManagedBean;
import java.io.Serializable;

/**
 * Created by Rabab Chahboune on 2/22/2017.
 */

@ManagedBean
public class Calculate implements Serializable {
    private int number1;
    private int number2;
    private String operation;
    private  int result;

    public int getResult() {
        return result;
    }

    public void setResult(int result) {
        this.result = result;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public int getNumber1() {
        return number1;
    }

    public void setNumber1(int number1) {
        this.number1 = number1;
    }

    public int getNumber2() {
        return number2;
    }

    public void setNumber2(int number2) {
        this.number2 = number2;
    }

    public int calculat(){
        switch(operation){
            case "+":
                result = number1+number2;
                break;
            case "-":
                result = number1-number2;
                break;
            case "*":
                result = number1*number2;
                break;
            case "/":
                result = number1/number2;
                break;
            default:
                result = 0;
                break;
        }
        return  result;
    }
}
