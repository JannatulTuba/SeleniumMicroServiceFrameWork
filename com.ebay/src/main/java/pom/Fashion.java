package pom;

import base.BaseClass;
import org.openqa.selenium.support.PageFactory;

public class Fashion extends BaseClass {

    public Fashion(){
        PageFactory.initElements(driver,this);
    }
}
