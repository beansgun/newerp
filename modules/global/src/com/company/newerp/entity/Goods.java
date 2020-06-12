package com.company.newerp.entity;

import com.haulmont.chile.core.annotations.NamePattern;
import com.haulmont.cuba.core.entity.StandardEntity;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.math.BigDecimal;
import java.util.List;

@NamePattern("%s|name")
@Table(name = "NEWERP_GOODS")
@Entity(name = "newerp_Goods")
public class Goods extends StandardEntity {
    private static final long serialVersionUID = 7183092030721390249L;

    @NotNull
    @Column(name = "NAME", nullable = false)
    protected String name;

    @OneToMany(mappedBy = "goods")
    protected List<Stock> stock;

    @NotNull
    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "SUPPLIER_ID")
    protected Supplier supplier;

    @Column(name = "IN_PRICE")
    protected BigDecimal inPrice;

    @Column(name = "OUT_PRICE")
    protected BigDecimal outPrice;

    public List<Stock> getStock() {
        return stock;
    }

    public void setStock(List<Stock> stock) {
        this.stock = stock;
    }

    public BigDecimal getOutPrice() {
        return outPrice;
    }

    public void setOutPrice(BigDecimal outPrice) {
        this.outPrice = outPrice;
    }

    public BigDecimal getInPrice() {
        return inPrice;
    }

    public void setInPrice(BigDecimal inPrice) {
        this.inPrice = inPrice;
    }

    public Supplier getSupplier() {
        return supplier;
    }

    public void setSupplier(Supplier supplier) {
        this.supplier = supplier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}