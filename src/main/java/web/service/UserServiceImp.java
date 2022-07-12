package web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import web.dao.UserDAO;
import web.models.User;
import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
public class UserServiceImp implements UserService {

    @Autowired
    private UserDAO userDAOImp;

    @Override
    public List<User> index() {
        return userDAOImp.index();
    }

    @Override
    public User showUser(long id) {
        return userDAOImp.showUser(id);
    }

    @Override
    public void save(User user) {
        userDAOImp.save(user);
    }

    @Override
    public void update(User userUpdated) {
        userDAOImp.update(userUpdated);
    }

    @Override
    public void deleteUser(long id) {
        userDAOImp.deleteUser(id);
    }
}
