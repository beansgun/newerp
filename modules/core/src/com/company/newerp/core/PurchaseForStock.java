package com.company.newerp.core;

import com.company.newerp.entity.Purchase;
import com.company.newerp.entity.Stock;
import com.haulmont.cuba.core.TransactionalDataManager;
import com.haulmont.cuba.core.app.events.EntityChangedEvent;
import com.haulmont.cuba.core.entity.contracts.Id;
import com.haulmont.cuba.core.global.DataManager;
import org.springframework.stereotype.Component;
import org.springframework.transaction.event.TransactionPhase;
import org.springframework.transaction.event.TransactionalEventListener;

import javax.inject.Inject;
import java.util.UUID;

@Component("purchaseForStock")
public class PurchaseForStock {

    @Inject
    private DataManager dataManager;

    @TransactionalEventListener
    public void addStock(EntityChangedEvent<Purchase, UUID> event) {

        if (event.getType().equals(EntityChangedEvent.Type.CREATED)) {

            Id<Purchase, UUID> id = event.getEntityId();

            Purchase purchase = dataManager.load(Purchase.class).view("purchase-view").id(id.getValue()).one();

            String goodsName = purchase.getGoods().getName();

            try{
                Stock oldStock = dataManager.load(Stock.class)
                        .query("select e from newerp_Stock e where e.goods.name = :goodName")
                        .parameter("goodName",goodsName)
                        .view("stock-view_1")
                        .one();
            }catch (IllegalStateException e){
                Stock newstock = dataManager.create(Stock.class);
                newstock.setGoods(purchase.getGoods());
                newstock.setNumber(0);
                dataManager.commit(newstock);
            }finally{
                Stock newStock = dataManager.load(Stock.class)
                        .query("select e from newerp_Stock e where e.goods.name = :goodName")
                        .parameter("goodName",goodsName)
                        .view("stock-view_1")
                        .one();
                newStock.setNumber(purchase.getNumber()+newStock.getNumber());
                dataManager.commit(newStock);
            }











        }
    }

}
