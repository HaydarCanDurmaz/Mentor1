package Actions;

import Utlity.Utlity.BaseDriver;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class task extends BaseDriver {
    @Test
    public void senaryo1(){
        driver.get("https://www.browserstack.com/");

        Actions aksiyonlar=new Actions(driver);
        WebElement getStarted= driver.findElement(By.linkText("Get started free"));
        aksiyonlar.moveToElement(getStarted).click().build().perform();










    } @Test
    public void senaryo2(){
        driver.get("https://www.browserstack.com/");

        Actions aksiyonlar=new Actions(driver);
        WebElement live= driver.findElement(By.xpath("//a[@class='product-cards-wrapper--click--hoverclick product-card-live']"));
        aksiyonlar.moveToElement(live).click().build().perform();









        BekleKapat();

}}
