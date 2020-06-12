package com.company.newerp.entity;

import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;

@Table(name = "NEWERP_STOCK")
@Entity(name = "newerp_Stock")
public class Stock extends StandardEntity {
    private static final long serialVersionUID = 6770689790539972141L;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "GOODS_ID")
    protected Goods goods;

    @Column(name = "NUMBER_")
    protected Integer number;

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public Goods getGoods() {
        return goods;
    }

    public void setGoods(Goods goods) {
        this.goods = goods;
    }
}