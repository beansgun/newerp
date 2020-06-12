package com.company.newerp.web.screens.stock;

import com.haulmont.cuba.gui.screen.*;
import com.company.newerp.entity.Stock;

@UiController("newerp_Stock.edit")
@UiDescriptor("stock-edit.xml")
@EditedEntityContainer("stockDc")
@LoadDataBeforeShow
public class StockEdit extends StandardEditor<Stock> {
}