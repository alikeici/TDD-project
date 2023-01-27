public class LoginService {

    public boolean login(String username, String password){
        User user= getUserFromDatabase(username);
        if (user ==null){
            throw new IllegalArgumentException("User does not exist");
        }
        if (!password.equals(user.getPassword())){
            throw new IllegalArgumentException("Incorrect password");
        }
        return true;

    }

    private User getUserFromDatabase(String username){
        //mocked database call to retrieve user
        return new User(username, "password");
    }
}
