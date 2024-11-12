package testSuite;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.util.Date;

public class FamousTest extends TestBase{

@Test
//user registration automation
    public void verifyCreateAccount(){
       String name = "user"+new Date().getTime();
       mainActivity.createButton.click();
       Assertions.assertTrue(createAccount.isAccountPage());
       createAccount.nameTextBox.setText(name);
       createAccount.addressTextBox.setText("Calle de las Flores 123");
       createAccount.emailTextBox.setText("email123@gmail.com");
       createAccount.mobileTextBox.setText("785543899");
       createAccount.passwordTextBox.setText("12345678");
       createAccount.reEnterPasswordTextBox.setText("12345678");
       createAccount.createAccountButton.click();
       Assertions.assertTrue(login.isSuccessLogin());

    }

@Test
//login automation
    public void verifyLogin(){
    login.inputEmailTextBox.setText("email123@gmail.com");
    login.inputPasswordTextBox.setText("12345678");
    login.btnLoginButton.click();
    Assertions.assertTrue(login.isSuccessLogin());
    }
}
