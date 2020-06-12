package com.company.newerp.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.List;

@Table(name = "NEWERP_CAR")
@Entity(name = "newerp_Car")
public class Car extends StandardEntity {
    private static final long serialVersionUID = -2541352628204779271L;

    @NotNull(message = "{msg://newerp_Car.volume.validation.NotNull}")
    @Column(name = "VOLUME")
    protected Double volume;

    @NotNull(message = "不能为空啊傻子")
    @Column(name = "STATUS")
    protected Boolean status;

    @Column(name = "CODE")
    protected String code;

    @JoinTable(name = "NEWERP_CAR_DRIVER_LINK",
            joinColumns = @JoinColumn(name = "CAR_ID"),
            inverseJoinColumns = @JoinColumn(name = "DRIVER_ID"))
    @ManyToMany
    protected List<Driver> driver;

    public List<Driver> getDriver() {
        return driver;
    }

    public void setDriver(List<Driver> driver) {
        this.driver = driver;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Double getVolume() {
        return volume;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}