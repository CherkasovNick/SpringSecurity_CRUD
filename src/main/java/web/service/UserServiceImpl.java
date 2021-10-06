package web.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import web.dao.UserDao;
import web.models.User;

import java.util.List;

@Service
@Transactional
public class UserServiceImpl implements UserService{

    @Autowired
    private UserDao userDao;

    @Override
    public void add(User user) {
        userDao.add(user);
    }

    @Override
    @Transactional(readOnly = true)
    public List<User> getAll() {
        return userDao.getAll();
    }

    @Override
    @Transactional(readOnly = true)
    public User getOne(Long id) {
        return userDao.getOne(id);
    }

    @Override
    public User update(User updatedUser) {
        return userDao.update(updatedUser);
    }

    @Override
    public void delete(Long id) {
        userDao.delete(id);
    }
}

