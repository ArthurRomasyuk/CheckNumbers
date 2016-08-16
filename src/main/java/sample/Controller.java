package sample;

import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.apache.commons.lang.math.NumberUtils;

public class Controller {
    public Label idResult;
    public TextField idInputNumber;

    public void checkNumbers (){
        if (NumberUtils.isNumber(String.valueOf(idInputNumber.getText()))){
            idResult.setText("All numbers");
        } else {
            idResult.setText("Not all numbers");
        }
    }
}
