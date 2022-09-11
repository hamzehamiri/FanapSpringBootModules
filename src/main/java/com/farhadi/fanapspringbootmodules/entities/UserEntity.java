package com.farhadi.fanapspringbootmodules.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.*;
import java.util.List;
import java.util.UUID;

@Data
@Builder
@Table(name = "user")
public class UserEntity {
    @Id
    private UUID id;
    @Column(name = "username")
    private String username;
    @Column(name = "first_name")
    private String firstName;
    @Column(name = "last_name")
    private String lastName;
    @OneToMany(fetch = FetchType.LAZY,
            cascade = CascadeType.ALL/*,
            orphanRemoval = true*/)
    private List<AddressEntity> addressEntityList;
}
