package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDao;
import web.models.User;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDaoImpl;

    @Override
    public List<User> index() {
        return userDaoImpl.index();
    }

    @Override
    public User showUser(long id) {
        return userDaoImpl.showUser(id);
    }

    @Override
    public void save(User user) {
        userDaoImpl.save(user);
    }

    @Override
    public void update(User userUpdated) {
        userDaoImpl.update(userUpdated);
    }

    @Override
    public void deleteUser(long id) {
        userDaoImpl.deleteUser(id);
    }
}
