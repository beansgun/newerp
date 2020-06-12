package com.company.newerp.web.screens.goods;

import com.haulmont.cuba.gui.screen.*;
import com.company.newerp.entity.Goods;

@UiController("newerp_Goods.browse")
@UiDescriptor("goods-browse.xml")
@LookupComponent("goodsesTable")
@LoadDataBeforeShow
public class GoodsBrowse extends StandardLookup<Goods> {
}