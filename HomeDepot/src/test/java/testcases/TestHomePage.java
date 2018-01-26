package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;

public class TestHomePage extends HomePage {
        HomePage objHomePage;
        @BeforeMethod
        public void initializationOfObjets(){
            objHomePage = PageFactory.initElements(ad, HomePage.class);
        }
       //T3_HOM_HP_01 verify initial alert closed
       @Test
        public void testInitialAlert(){
            objHomePage.initialAlert();
            String expected  = "Sign In to Your Account";
            System.out.println("Successfully closed initial alert");
        }
       //T3_HOM_HP_02 verify zipcode entered
       @Test
        public void testZipcodeEnter(){
            objHomePage.initialAlert();
            objHomePage.enterZipCode();
        }
        //T3_HOM_HP_03 verify cities count under zipcoe 98029
        @Test
        public void testCountCitiesUnderZipcode(){
            objHomePage.initialAlert();
            objHomePage.enterZipCode();
            String actual = objHomePage.countCitiesUnderZipcode();
            String expected = "7";
            Assert.assertTrue(actual.contains(expected));
        }
        //T3_HOM_HP_04 verify Issaquah city page opens
        @Test
        public void testIssaquahCityPage() {
            objHomePage.initialAlert();
            System.out.println("initial alert closed");
            objHomePage.enterZipCode();
            System.out.println("zipcode entered");
            objHomePage.getIssaquahCity();
            System.out.println("Issaquah city");
        }
}
