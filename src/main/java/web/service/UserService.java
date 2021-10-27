package web.service;

import web.models.User;

import java.util.List;

public interface UserService {
    public void add(User user, String[] selectedRoles);
    public List<User> getAll();
    public User getOne(Long id);
    public User update(User updatedUser);
    public void delete(Long id);
}
