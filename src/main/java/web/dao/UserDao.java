package web.dao;

import web.models.User;

import java.util.List;

public interface UserDao {
    public void add(User user);
    public List<User> getAll();
    public User getOne(Long id);
    public User update(User updatedUser);
    public void delete(Long id);
}
