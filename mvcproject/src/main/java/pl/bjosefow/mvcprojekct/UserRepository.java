package pl.bjosefow.mvcprojekct;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {
    private final List<User> userList = new ArrayList<>();

    public void addUserToList(User user) {
        userList.add(user);
    }

    public List<User> getAllUsers() {
        return userList;
    }
}
