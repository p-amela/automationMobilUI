package activities.famous;

import controls.Button;
import controls.Label;
import controls.TextBox;
import org.openqa.selenium.By;

public class Login {

        public TextBox inputEmailTextBox = new TextBox(By.id("com.sourcey.materialloginexample:id/input_email"));
        public TextBox inputPasswordTextBox = new TextBox (By.id("com.sourcey.materialloginexample:id/input_password"));
        public Button btnLoginButton = new Button (By.id("com.sourcey.materialloginexample:id/btn_login"));

        public boolean isSuccessLogin(){
                Label successLabel = new Label(By.xpath("//android.widget.TextView[@text='Hello world!']"));
                return successLabel.isControlDisplayed();
        }



}
