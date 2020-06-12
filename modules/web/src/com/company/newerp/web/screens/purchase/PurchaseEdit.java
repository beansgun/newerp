package com.company.newerp.web.screens.purchase;

import com.haulmont.cuba.gui.screen.*;
import com.company.newerp.entity.Purchase;

@UiController("newerp_Purchase.edit")
@UiDescriptor("purchase-edit.xml")
@EditedEntityContainer("purchaseDc")
@LoadDataBeforeShow
public class PurchaseEdit extends StandardEditor<Purchase> {
}