package com.farhadi.fanapspringbootmodules.entities;

import lombok.Builder;
import lombok.Data;

import javax.persistence.Column;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.UUID;

@Data
@Builder
@Table(name = "address")
public class AddressEntity {
    @Id
    private UUID id;
    @Column(name = "address")
    private String address;
    @Column(name = "user_id")
    private UUID userId;

}
