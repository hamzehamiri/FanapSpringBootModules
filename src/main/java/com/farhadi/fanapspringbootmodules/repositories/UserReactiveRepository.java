package com.farhadi.fanapspringbootmodules.repositories;

import com.farhadi.fanapspringbootmodules.entities.UserEntity;
import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface UserReactiveRepository extends ReactiveCrudRepository<UserEntity, UUID> {

}
