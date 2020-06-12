package com.company.newerp.web.screens.goods;

import com.haulmont.cuba.gui.screen.*;
import com.company.newerp.entity.Goods;

@UiController("newerp_Goods.edit")
@UiDescriptor("goods-edit.xml")
@EditedEntityContainer("goodsDc")
@LoadDataBeforeShow
public class GoodsEdit extends StandardEditor<Goods> {
}