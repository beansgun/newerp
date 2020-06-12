package com.company.newerp.web.screens.supplier;

import com.haulmont.cuba.gui.screen.*;
import com.company.newerp.entity.Supplier;

@UiController("newerp_Supplier.edit")
@UiDescriptor("supplier-edit.xml")
@EditedEntityContainer("supplierDc")
@LoadDataBeforeShow
public class SupplierEdit extends StandardEditor<Supplier> {
}