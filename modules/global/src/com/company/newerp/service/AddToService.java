package com.company.newerp.service;

import com.company.newerp.entity.Goods;

public interface AddToService {
    String NAME = "newerp_AddToService";

    public void add(Goods goods, Integer number);
}