package pages;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import base.MobileAPI;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.internal.TouchAction;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class HomePage extends MobileAPI{
    @FindBy(className = "android.widget.Button")
    public WebElement items;
    @FindBy(xpath = "//*[@class='android.widget.Button'][2]")
    public WebElement donotAllowButton;
    @FindBy(xpath = "//*[@class='android.widget.Button'][2]")
    public WebElement donotAllowButtonNext;
    @FindBy(id = "com.android.packageinstaller:id/permission_deny_button")
    public WebElement denyButton;
    @FindBy(id = "com.thehomedepot:id/loc_options_title_tv")
    public WebElement findAndChooseStore;
    @FindBy(id = "com.thehomedepot:id/loc_option_store_search_et")
    public WebElement textBox;
    @FindBy(className = "android.widget.RelativeLayout")
    List<WebElement> zipcodeList = new ArrayList<>();
    @FindBy(id = "com.thehomedepot:id/tutorial_pages_btn_skip")
    public WebElement skipButton;
    @FindBy(id="com.thehomedepot:id/storeTV")
    public WebElement issaquahText;
    @FindBy(xpath = "//android.widget.EditText[@bounds='[316,655][1369,796]']")
    public WebElement textBoxBound;
    @FindBy(id = "com.thehomedepot:id/loc_option_signin_btn")
    public WebElement signInButton;
    @FindBy(xpath = "//android.widget.EditText[@text='Enter City, State or Zip']")
    public WebElement enterZipcodeBox;
    @FindBy(id ="com.thehomedepot:id/header_store_IV")
    public WebElement enterClick;
    @FindBy(id = "android:id/search_button")
    public WebElement searchButton;
    List<WebElement> elements = new ArrayList<>();
    public void page(){
    elements = ad.findElements(By.className("android.widget.Button"));
    }

    //T3_HOM_HP_01 verify initial alert closed
    public void initialAlert() {
        donotAllowButton.click();
        ad.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        donotAllowButtonNext.click();
        ad.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        //  denyButton.click();                     // This option was available in higher API version
    }
    //T3_HOM_HP_02 verify zipcode entered
    public void enterZipCode() {
        textBox.sendKeys("98029");
        ad.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        ad.tap(1,980,1673,1);
        System.out.println("Enter the zipcode page");
    }
    //T3_HOM_HP_03 verify cities count under zipcoe 98029
    public String countCitiesUnderZipcode() {
        int count = zipcodeList.size();
        String ret = String.valueOf(count);  //convert int to string
        System.out.println("Total cities under zipcode: " + count);
        return ret;
    }
    //T3_HOM_HP_04 verify Issaquah city page opens
    public String getIssaquahCity() {
        //ad.hideKeyboard();
        zipcodeList.get(1).click();
        skipButton.click();
        ad.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        String text = issaquahText.getAttribute("text");
        return text;
    }
}
