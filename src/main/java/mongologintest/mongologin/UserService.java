package mongologintest.mongologin;

import org.springframework.stereotype.Service;


public interface UserService {
    public User findByUsername(String username);
    public void saveUser(User user);
}
