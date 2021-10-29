package web.dao;

import web.models.Role;

import java.util.List;
import java.util.Set;

public interface RoleDao {

    List<Role> getAllRoles();

    Role getRoleById(Long id);

    Set<Role> getSetRolesToUser(String[] selectedRoles);
}
