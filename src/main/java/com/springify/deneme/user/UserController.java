package com.springify.deneme.user;

import com.springify.deneme.shared.GenericResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    //Interfaceleri implement edip bağımlılığı arttırmak yerine bu anotasyon tercih ediliyor ve bağımlılık azaltılıyor.
    @Autowired
    UserService userService;

    @PostMapping("/create-user")
    public GenericResponse createUser(@RequestBody User user) {
        userService.save(user);
        return new GenericResponse("user-created");
    }
}
