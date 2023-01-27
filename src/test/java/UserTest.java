import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserTest {
    @Test
    public void testGetUsername(){
        User user=new User("ammar","12345");
        assertEquals("Ali", user.getUsername());
    }

    @Test
    public void testGetPassword(){
        User user=new User("ammar", "password");
        assertEquals("123455", user.getPassword());
    }
}
