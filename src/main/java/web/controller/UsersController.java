package web.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import web.models.Role;
import web.models.User;
import web.service.RoleService;
import web.service.UserService;

import java.util.List;

@Controller
@RequestMapping("/users")
public class UsersController {

    private UserService userService;
    private RoleService roleService;
    private Role role;

    @Autowired
    public UsersController(UserService userService, RoleService roleService, Role role) {
        this.userService = userService;
        this.roleService = roleService;
        this.role = role;
    }

//    @GetMapping()
//    public String getAll(Model model) {
//        List<User> list = userService.getAll();
//        model.addAttribute("users", list);
//        return "admin/list";
//    }

    @GetMapping("/{id}")
    public String getUser(@PathVariable("id") Long id, Model model) {
        model.addAttribute("user", userService.getOne(id));
        return "/users/getOne";
    }

//    @GetMapping("/new")
//    public String newUser(@ModelAttribute("user") User user, Model model) {
//        model.addAttribute("role", role);
//        model.addAttribute("rolesList", roleService.getAllRoles());
//        return "admin/new";
//    }

//    @PostMapping()
//    public String create(@ModelAttribute("user") User user,
//                         @RequestParam("selectedRoles") String[] selectedRoles) {
//        userService.add(user, selectedRoles);
//        return "redirect:/users";
//    }

//    @GetMapping("/{id}/edit")
//    public String edit(@PathVariable("id") Long id, Model model) {
//        model.addAttribute("user", userService.getOne(id));
//        return "admin/edit";
//    }
//
//    @PatchMapping("/{id}")
//    public String update(@ModelAttribute("user") User user, @PathVariable("id") Long id) {
//        userService.update(user);
//        return "redirect:/users";
//    }
//
//    @DeleteMapping("/{id}")
//    public String delete(@PathVariable("id") Long id) {
//        userService.delete(id);
//        return "redirect:/users";
//    }
}



