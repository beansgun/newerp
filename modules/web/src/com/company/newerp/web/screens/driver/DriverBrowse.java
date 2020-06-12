package com.company.newerp.web.screens.driver;

import com.haulmont.cuba.gui.screen.*;
import com.company.newerp.entity.Driver;

@UiController("newerp_Driver.browse")
@UiDescriptor("driver-browse.xml")
@LookupComponent("driversTable")
@LoadDataBeforeShow
public class DriverBrowse extends StandardLookup<Driver> {
}