package com.imoving.UI.pageObjects;

import com.imoving.UI.utils.Driver;
import org.openqa.selenium.support.PageFactory;

public class BathRoomPage {
    public BathRoomPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }
}
