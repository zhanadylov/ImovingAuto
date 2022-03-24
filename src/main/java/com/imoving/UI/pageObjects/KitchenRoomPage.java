package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class KitchenRoomPage {
    public KitchenRoomPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
