package com.pentalog.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name="flight")
public class FlightEntity extends AbstractBaseEntity {

    public FlightEntity(String name) {
        this.name = name;
    }

    public FlightEntity() {
    }

    @Column(name="name")
    private String name;

    @ManyToMany(targetEntity = UserEntity.class)
    private List<UserEntity> passangers = new ArrayList<UserEntity>();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<UserEntity> getPassangers() {
        return passangers;
    }

    public void setPassangers(List<UserEntity> passangers) {
        this.passangers = passangers;
    }
}
