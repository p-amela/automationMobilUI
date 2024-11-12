package activities.famous;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class CreateAccount {

    public TextBox nameTextBox = new TextBox (By.id("com.sourcey.materialloginexample:id/input_name"));
    public TextBox addressTextBox = new TextBox (By.id("com.sourcey.materialloginexample:id/input_address"));
    public TextBox emailTextBox = new TextBox (By.id("com.sourcey.materialloginexample:id/input_email"));
    public TextBox mobileTextBox = new TextBox (By.id("com.sourcey.materialloginexample:id/input_mobile"));
    public TextBox passwordTextBox = new TextBox (By.id("com.sourcey.materialloginexample:id/input_password"));
    public TextBox reEnterPasswordTextBox = new TextBox (By.id("com.sourcey.materialloginexample:id/input_reEnterPassword"));
    public Button createAccountButton = new Button (By.id("com.sourcey.materialloginexample:id/btn_signup"));

    public boolean isAccountPage(){
        Label accountPageLabel = new Label(By.xpath("//android.widget.ImageView"));
        return accountPageLabel.isControlDisplayed();
    }

    public boolean isAccountPage2(){
        Label accountPageLabel = new Label(By.xpath("//android.widget.TextView[@text='Material Login Example']"));
        return accountPageLabel.isControlDisplayed();
    }

}
