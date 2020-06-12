package com.company.newerp.web.screens.sale;

import com.company.newerp.entity.Goods;
import com.company.newerp.service.AddToService;
import com.haulmont.cuba.gui.Notifications;
import com.haulmont.cuba.gui.components.Action;
import com.haulmont.cuba.gui.components.LookupField;
import com.haulmont.cuba.gui.components.PickerField;
import com.haulmont.cuba.gui.components.TextField;
import com.haulmont.cuba.gui.screen.*;
import org.springframework.stereotype.Component;

import javax.inject.Inject;


@UiController("newerp_Addgoods")
@UiDescriptor("addGoods.xml")
public class Addgoods extends Screen {

    @Subscribe
    protected void onBeforeShow(BeforeShowEvent beforeShowEvent) {
        getScreenData().loadAll();
    }

    @Inject
    protected Notifications notifications;

    @Inject
    protected AddToService addToService;

    @Inject
    protected TextField<String> number;

    @Inject
    protected LookupField<Goods> goods;

    @Subscribe("commitAction")
    protected void commitGoods(Action.ActionPerformedEvent actionPerformedEvent){
        String num = number.getValue();
        addToService.add(goods.getValue(),Integer.valueOf(num));

        close(new StandardCloseAction(EditorScreen.WINDOW_COMMIT_AND_CLOSE)).then(() ->
                notifications.create()
                        .withCaption(" 补货完成")
                        .withType(Notifications.NotificationType.TRAY)
                        .show()
        );

    }


}