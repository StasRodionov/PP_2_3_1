package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {

    List<User> index();

    User showUser(long id);

    void save(User user);

    void update(User userUpdated);

    void deleteUser(long id);
}