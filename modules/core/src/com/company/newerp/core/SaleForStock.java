package com.company.newerp.core;

import com.company.newerp.entity.Goods;
import com.company.newerp.entity.Sale;
import com.company.newerp.entity.Stock;
import com.haulmont.cuba.core.app.events.EntityChangedEvent;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.inject.Inject;
import java.util.UUID;

@Component("saleForStock")
public class SaleForStock {

    @Inject
    private DataManager dataManager;

    @TransactionalEventListener
    public void subStock(EntityChangedEvent<Sale, UUID> event){

        if (event.getType().equals(EntityChangedEvent.Type.CREATED)) {

            UUID id = event.getEntityId().getValue();

            Sale sale = dataManager.load(Sale.class).view("sale-view").id(id).one();

            String goodsName = sale.getGoods().getName();

            Stock stock = dataManager.load(Stock.class)
                                        .query("select e from newerp_Stock e where e.goods.name = :goodsName")
                                        .parameter("goodsName",goodsName)
                                        .view("stock-view_1")
                                        .one();

            stock.setNumber(stock.getNumber()-sale.getNumber());
            dataManager.commit(stock);
        }
    }
}
