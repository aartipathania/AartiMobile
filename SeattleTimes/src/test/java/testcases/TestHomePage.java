package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.HomePage;
import reporting.TestLogger;

public class TestHomePage extends HomePage{
    HomePage objHomePage;
    @BeforeMethod
    public void initialize(){
        objHomePage = PageFactory.initElements(ad, HomePage.class);
    }
   //T3_SEA_HP_01 Check Burger button
/*   @Test
    public void test1BurgerButton(){
        TestLogger.log("Seattle Times app is launched ...");
        objHomePage.clickBurgerButton();
        System.out.println("testBurgerButton passed");
    }
    //T3_SEA_HP_02 Verify Burger Menu list
    @Test (enabled = false)
    public void test2scrollMenuList(){
        TestLogger.log("Menu list opened ...");
        objHomePage.clickBurgerButton();
        objHomePage.getMenuItems();
        System.out.println("scrollMenuList passed");
    }
    //T3_SEA_HP_03 Verify 'My Reading List' link
    @Test
    public void test3scrollToMyReadingList() {
        TestLogger.log("Menu list opened ...");
        objHomePage.getMyreadingList1();
        System.out.println("scrollMenuList for Myreading passed");
    }
    //T3_SEA_HP_04 Verify 'Local News' link
    @Test
    public void test4scrollToLocal(){
        TestLogger.log("Menu list opened ...");
        objHomePage.getLocalNews();
        System.out.println("scrollMenuList for LocalNews passed");
    }
    //T3_SEA_HP_05 Verify 'Business/Tech' link and click
    @Test
    public void test5scrollToBusiness(){
        TestLogger.log("Menu list opened ...");
        objHomePage.getBusinessTech();
        System.out.println("scrollMenuList for Business/Tech passed");
    }
    //T3_SEA_HP_06 Verify 'Sports' link and click
    @Test
    public void test6scrollToSports(){
        TestLogger.log("Menu list opened ...");
        objHomePage.getBusinessTech();
        System.out.println("scrollMenuList for Sports passed");
    }*/
    //T3_SEA_HP_07 Verify 'PNW Magazine' link and click
   // @Test
    public void test7scrollPNWMagazine(){
        TestLogger.log("Menu list opened ...");
        objHomePage.getPnwMagazine();
        System.out.println("scrollMenuList for PNW Magazine passed");
    }
    //T3_SEA_HP_08 Verify scroll Up/Down links in Menu list
    @Test
    public void test8scrollUpDownMenuList(){
        TestLogger.log("Menu list opened ...");
        objHomePage.scrollUpDownMenuList();
        System.out.println("test8scrollUpDownMenuList passed");
    }

}
