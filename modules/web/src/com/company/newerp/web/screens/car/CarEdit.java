package com.company.newerp.web.screens.car;

import com.haulmont.cuba.gui.screen.*;
import com.company.newerp.entity.Car;

@UiController("newerp_Car.edit")
@UiDescriptor("car-edit.xml")
@EditedEntityContainer("carDc")
@LoadDataBeforeShow
public class CarEdit extends StandardEditor<Car> {
}