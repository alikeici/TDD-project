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


}
