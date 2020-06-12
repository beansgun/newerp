package com.company.newerp.web.screens.sale;

import com.company.newerp.entity.Goods;
import com.haulmont.cuba.core.global.DataManager;
import com.haulmont.cuba.core.global.Metadata;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.Screens;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.GroupTable;
import com.haulmont.cuba.gui.screen.*;
import com.company.newerp.entity.Sale;

import javax.inject.Inject;
import java.math.BigDecimal;

@UiController("newerp_Sale.browse")
@UiDescriptor("sale-browse.xml")
@LookupComponent("salesTable")
@LoadDataBeforeShow
public class SaleBrowse extends StandardLookup<Sale> {

    @Inject
    private Notifications notifications;

    @Inject
    private Metadata metadata;

    @Inject
    private GroupTable<Sale> salesTable;

    @Inject
    private DataManager dataManager;

    @Inject
    private Screens screens;




    @Subscribe("salesTable.profit")
    public void profitDisplay (Action.ActionPerformedEvent actionPerformedEvent){

        Sale sale = salesTable.getSingleSelected();

        Goods goods = sale.getGoods();

        Goods detailGoods = dataManager.load(Goods.class).id(goods.getUuid()).one();

        BigDecimal number = new BigDecimal(sale.getNumber());

        BigDecimal profit = detailGoods.getOutPrice().subtract(detailGoods.getInPrice()).multiply(number);

        notifications.create().withCaption("获得收益"+profit+"元").show();
    }

    @Subscribe("salesTable.addGoods")
    public void addGoods(Action.ActionPerformedEvent actionPerformedEvent){
        screens.create(Addgoods.class, OpenMode.DIALOG).show();
    }



}