package com.company.newerp.web.screens.stock;

import com.haulmont.cuba.gui.screen.*;
import com.company.newerp.entity.Stock;

@UiController("newerp_Stock.browse")
@UiDescriptor("stock-browse.xml")
@LookupComponent("stocksTable")
@LoadDataBeforeShow
public class StockBrowse extends StandardLookup<Stock> {
}