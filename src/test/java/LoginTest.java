import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class LoginTest {
    private Login login;

    @BeforeEach
    void setUp() {
        login = new Login();
        login.setMembers();
    }

    @Test
    void verifyLoginCorrectToken() throws WrongLoginException {

        assertEquals("123Aba#", login.verify("anna", "losen"));
    }

    @Test //expected=WrongLoginException.class
    void verifyLoginCorrectAuthorization() throws WrongLoginException {

        assertEquals("READ", login.verifyTjanst(login.verify("anna", "losen"), "ACCOUNT"));
    }

    @Test
    void verifyLoginWrongToken()  {

        assertEquals("does not exist", login.verifyTjanst("ACCOUNT", "PROVISION_CALC"));
    }

    @Test
    void verifyLoginFalsePassword() {

        WrongLoginException wrongLoginException = assertThrows(WrongLoginException.class, () ->
                login.verify("anna", "los"));
        assertEquals("Wrong password!", wrongLoginException.getMessage());
    }

    @Test
    void verifyLoginFalseName() throws WrongLoginException {

        WrongLoginException wrongLoginException = assertThrows(WrongLoginException.class, () ->
                login.verify("annaa", "losen"));
        assertEquals("Wrong name!", wrongLoginException.getMessage());
    }

}
