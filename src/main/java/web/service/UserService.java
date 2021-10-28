package web.service;

import org.springframework.security.core.userdetails.UserDetailsService;
import web.models.User;

import java.util.List;

public interface UserService extends UserDetailsService {
    public void add(User user, String[] selectedRoles);
    public List<User> getAll();
    public User getOne(Long id);
    public User update(User updatedUser);
    public void delete(Long id);
    User getUserByUsername(String name);
}
