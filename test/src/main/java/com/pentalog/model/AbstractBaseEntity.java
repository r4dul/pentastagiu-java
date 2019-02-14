package com.pentalog.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class AbstractBaseEntity {
    @Id
    @GeneratedValue
    private long id;

    public AbstractBaseEntity() {
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }
}
