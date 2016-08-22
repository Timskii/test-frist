package pack1.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import pack1.entity.User;
import pack1.repositories.UsersRepository;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Timur.Abdykarimov on 19.08.2016.
 */
@RestController
@RequestMapping("/users")
@PreAuthorize("hasRole('ADMIN')")
public class UserController {
    @Autowired
    UsersRepository users;

    @RequestMapping(method = RequestMethod.GET)
    public List<User> getUsers()
    {
        List<User> result = new ArrayList<>();
        users.findAll().forEach(result::add);
        return result;
    }
}
