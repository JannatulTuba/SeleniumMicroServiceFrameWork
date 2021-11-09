package testBase;

import base.BaseClass;
import pom.HomePage;

public class TestBase extends BaseClass {
    public HomePage getHomePage(){
        return new HomePage();
    }
}
