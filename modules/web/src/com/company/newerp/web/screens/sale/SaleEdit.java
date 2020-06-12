package com.company.newerp.web.screens.sale;

import com.haulmont.cuba.gui.screen.*;
import com.company.newerp.entity.Sale;

@UiController("newerp_Sale.edit")
@UiDescriptor("sale-edit.xml")
@EditedEntityContainer("saleDc")
@LoadDataBeforeShow
public class SaleEdit extends StandardEditor<Sale> {
}