package com.company.newerp.web.screens.driver;

import com.haulmont.cuba.gui.screen.*;
import com.company.newerp.entity.Driver;

@UiController("newerp_Driver.edit")
@UiDescriptor("driver-edit.xml")
@EditedEntityContainer("driverDc")
@LoadDataBeforeShow
public class DriverEdit extends StandardEditor<Driver> {
}