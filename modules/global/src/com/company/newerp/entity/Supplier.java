package com.company.newerp.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@NamePattern("%s|name")
@Table(name = "NEWERP_SUPPLIER")
@Entity(name = "newerp_Supplier")
public class Supplier extends StandardEntity {
    private static final long serialVersionUID = -8861779648476989108L;

    @NotNull
    @Column(name = "NAME")
    protected String name;

    @Column(name = "TEL")
    protected String tel;

    @Column(name = "ADDRESS")
    protected String address;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}