package testSuite;

import activities.famous.CreateAccount;
import activities.famous.Login;
import activities.famous.MainActivity;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import singletonSession.Session;

public class TestBase {
    public MainActivity mainActivity;
    public CreateAccount createAccount;
    public Login login;

    @BeforeEach
    public void openApp(){
        mainActivity = new MainActivity();
        createAccount = new CreateAccount();
        login = new Login();
    }
    @AfterEach
    public void closeApp(){
        Session.getSession().closeSession();
    }

}
