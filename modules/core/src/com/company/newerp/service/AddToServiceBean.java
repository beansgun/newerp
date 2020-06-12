package com.company.newerp.service;

import com.company.newerp.entity.Goods;
import com.company.newerp.entity.Stock;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Service;

import javax.inject.Inject;

@Service(AddToService.NAME)
public class AddToServiceBean implements AddToService {

    @Inject
    private DataManager datamanager;

    public void add(Goods goods, Integer number) {

        Stock stock = datamanager.create(Stock.class);

        stock.setGoods(goods);

        stock.setNumber(number);

        datamanager.commit(stock);
    }
}