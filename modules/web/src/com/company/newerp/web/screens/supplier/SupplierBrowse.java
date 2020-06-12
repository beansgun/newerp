package com.company.newerp.web.screens.supplier;

import com.haulmont.cuba.gui.screen.*;
import com.company.newerp.entity.Supplier;

@UiController("newerp_Supplier.browse")
@UiDescriptor("supplier-browse.xml")
@LookupComponent("suppliersTable")
@LoadDataBeforeShow
public class SupplierBrowse extends StandardLookup<Supplier> {
}