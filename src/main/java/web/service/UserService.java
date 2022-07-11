package web.service;

import web.models.User;

import java.util.List;

public interface UserService {


    List<User> index();

    User showUser(long id);

    void save(User user);

    void update(User userUpdated);

    void deleteUser(long id);
}
