package com.company.newerp.web.screens.purchase;

import com.haulmont.cuba.gui.screen.*;
import com.company.newerp.entity.Purchase;

@UiController("newerp_Purchase.browse")
@UiDescriptor("purchase-browse.xml")
@LookupComponent("purchasesTable")
@LoadDataBeforeShow
public class PurchaseBrowse extends StandardLookup<Purchase> {
}