package com.nopcommerce.demo.testsuite;

import com.nopcommerce.demo.pages.HomePage;
import com.nopcommerce.demo.testbase.BaseTest;
import org.testng.annotations.Test;

public class HomePageTest extends BaseTest {


    HomePage homepage = new HomePage();




   @Test
    public void verifyPageNavigation(){
      homepage.selectMenu("Computers");
   }

}
