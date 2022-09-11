package com.farhadi.fanapspringbootmodules.services;

import com.farhadi.fanapspringbootmodules.entities.UserEntity;
import com.farhadi.fanapspringbootmodules.repositories.UserReactiveRepository;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Mono;

import javax.transaction.Transactional;
import java.util.UUID;

@Service
public class UserServices {
    private final UserReactiveRepository userReactiveRepository;

    public UserServices(UserReactiveRepository userReactiveRepository) {
        this.userReactiveRepository = userReactiveRepository;
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public Mono<Void> deleteUser(UUID uuid) {
        return userReactiveRepository.deleteById(uuid);
    }

    @Transactional(Transactional.TxType.REQUIRED)
    public Mono<UserEntity> addUser(UserEntity userEntity) {
        return userReactiveRepository.save(userEntity);
    }

}
