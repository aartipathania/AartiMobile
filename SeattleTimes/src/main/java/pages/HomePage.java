package pages;

import base.MobileAPI;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

public class HomePage extends MobileAPI {
    @FindBy(className="android.widget.ImageButton")
    public static WebElement burgerButton;
    @FindBy(xpath="//android.widget.TextView[@text='MY READING LIST']")
    public static MobileElement myreadingListLink;
    @FindBy(xpath="//android.widget.TextView[@text='LOCAL NEWS']")
    public static MobileElement localNewsLink;
    @FindBy(xpath="//android.widget.TextView[@text='BUSINESS/TECH']")
    public static MobileElement businessLink;
    @FindBy(xpath="//android.widget.TextView[@text='SPORTS']")
    public static WebElement sportsLink;
    @FindBy(xpath="//android.widget.TextView[@text='NATION & WORLD']")
    public static WebElement nationWorldLink;
    @FindBy(xpath="//android.widget.TextView[@text='OPINION']")
    public static WebElement opinionLink;
    @FindBy(xpath="//android.widget.TextView[@text='ENTERTAINMENT']")
    public static WebElement entertainmentLink;
    @FindBy(xpath="//android.widget.TextView[@text='LIFE']")
    public static WebElement lifeLink;
    @FindBy(xpath="//android.widget.TextView[@text='PNW MAGAZINE']")
    public static WebElement pnwMagazineLink;
    @FindBy(id="com.seattletimes.android.SeattleTimesMobileNews:id/design_navigation_view")
    List<WebElement> mainMenu = new ArrayList<>();

    String[] menuListArray = {"MY READING LIST","LOCAL NEWS","BUSINESS/TECH","SPORTS","NATION & WORLD","OPINION","ENTERTAINMENT","LIFE","PNW MAGAZINE"};

    //T3_SEA_HP_01 Check Burger button
    public void clickBurgerButton() {
        ad.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        burgerButton.click();
    }
    //T3_SEA_HP_02 Verify Burger Menu list
    public void getMenuItems(){
        List<WebElement> items = ad.findElements(By.className("android.widget.ImageButton"));
        for (WebElement item: items){
            System.out.println("Item: "+item.getText());
            ad.manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        }
    }
    //Scrolldown to 'My Reading List' link and click
    public void getMyreadingList(){
        clickBurgerButton();
        scrollAndClickByName("MY READING LIST");
        System.out.println("My Reading List clicked");
    }
    //T3_SEA_HP_03 Verify 'My Reading List' link and click
    public void getMyreadingList1(){
        clickBurgerButton();
        ad.tap(1,336,340,1);
        System.out.println("My Reading List clicked");
    }
    //T3_SEA_HP_04 Verify 'Local News' link
    public void getLocalNews(){
        clickBurgerButton();
        ad.tap(1,340,340,1);
        System.out.println("Local News clicked");
    }
    //T3_SEA_HP_05 Verify 'Business/Tech' link and click
    public void getBusinessTech(){
        clickBurgerButton();
        ad.tap(1,361,475,1);
        System.out.println("Business/Tech clicked");
    }
    //T3_SEA_HP_06 Verify 'Sports' link and click
    public void getSports(){
        clickBurgerButton();
        ad.tap(1,273,668,1);
        System.out.println("Sports clicked");
    }
    //scroll to Nation & World and click
    public void getNationWorld(){
        clickBurgerButton();
        ad.tap(1,265,824,1);
        System.out.println("'Nation & World' clicked");
    }
    //scroll to Opinion and click
    public void getOpinion(){
        clickBurgerButton();
        ad.tap(1,261,979,1);
        System.out.println("Opinion clicked");
    }
    //scroll to Entertainment and click
    public void getEntertainment(){
        clickBurgerButton();
        ad.tap(1,256,1151,1);
        System.out.println("Entertainment clicked");
    }
    //scroll to Life and click
    public void getLife(){
        clickBurgerButton();
        ad.tap(1,256,1324,1);
        System.out.println("Life clicked");
    }
    //T3_SEA_HP_07 Verify 'PNW Magazine' link and click
    public void getPnwMagazine(){
        clickBurgerButton();
        ad.tap(1,256,1479,1);
        System.out.println("PNW Magazine page return back to home page");
    }
    public void scrollUpDownMenuList() {
        clickBurgerButton();
        scrollToElementByWebElement(ad, myreadingListLink);
        scrollToElementByWebElement(ad, localNewsLink);
        scrollToElementByWebElement(ad, businessLink);
    }
    //scroll to Myreading List and check
    public void scrollMenuList(){
        clickBurgerButton();
        scrollToElement(ad, "MY READING LIST");
        scrollToElement(ad, "BUSINESS/TECH");
        scrollToElement(ad, "ENTERTAINMENT");
        scrollToElement(ad, "PNW MAGAZINE");
        scrollToElement(ad, "LOCAL NEWS");
        scrollToElement(ad, "SPORTS");
        scrollToElement(ad, "LOCAL NEWS");
        scrollToElement(ad, "LIFE");
        scrollToElement(ad, "NATION & WORLD");
        scrollToElement(ad, "OPINION");
        System.out.println("Scroll down of My Reading List clicked");
    }
}
