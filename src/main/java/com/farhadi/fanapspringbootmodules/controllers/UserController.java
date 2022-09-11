package com.farhadi.fanapspringbootmodules.controllers;

import com.farhadi.fanapspringbootmodules.entities.UserEntity;
import com.farhadi.fanapspringbootmodules.services.UserServices;
import org.springframework.web.bind.annotation.*;
import reactor.core.publisher.Mono;

import java.util.UUID;

@RestController
@RequestMapping("/api/user")
public class UserController {

    private final UserServices userServices;

    public UserController(UserServices userServices) {
        this.userServices = userServices;
    }

    @PostMapping("/create")
    public Mono<UserEntity> createUser(@RequestBody final UserEntity userEntity) {
        return userServices.addUser(userEntity);
    }

    @DeleteMapping("/delete")
    public Mono<Void> deleteUser(@RequestBody final UUID uuid) {
        return userServices.deleteUser(uuid);
    }
}
