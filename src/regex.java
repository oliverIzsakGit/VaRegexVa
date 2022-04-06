import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class regex
{

  public Button button;
  public TextArea str;
  public TextField regex;
  public Label sol;

  public void checkReg(ActionEvent actionEvent)
  {
    Pattern p;
    p = Pattern.compile(regex.getText());

    Matcher match = p.matcher(str.getText());

    if (match.find())
    {
      sol.setText("OK");

    }
    else
      {
      sol.setText("WRONG");

    }
  }
}
