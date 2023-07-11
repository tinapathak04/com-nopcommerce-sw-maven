package com.nopcommerce.demo.pages;

import com.nopcommerce.demo.utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {

    public void selectMenu(String menu){
        clickOnElement(By.linkText(menu));
    }





}
