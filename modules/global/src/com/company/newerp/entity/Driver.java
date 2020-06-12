package com.company.newerp.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "NEWERP_DRIVER")
@Entity(name = "newerp_Driver")
public class Driver extends StandardEntity {
    private static final long serialVersionUID = 7936484937427191267L;

    @Column(name = "NAME")
    protected String name;
    @JoinTable(name = "NEWERP_CAR_DRIVER_LINK",
            joinColumns = @JoinColumn(name = "DRIVER_ID"),
            inverseJoinColumns = @JoinColumn(name = "CAR_ID"))
    @ManyToMany
    protected List<Car> cars;

    public List<Car> getCars() {
        return cars;
    }

    public void setCars(List<Car> cars) {
        this.cars = cars;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}