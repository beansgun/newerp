package com.company.newerp.web.screens.car;

import com.haulmont.cuba.gui.screen.*;
import com.company.newerp.entity.Car;

@UiController("newerp_Car.browse")
@UiDescriptor("car-browse.xml")
@LookupComponent("carsTable")
@LoadDataBeforeShow
public class CarBrowse extends StandardLookup<Car> {
}