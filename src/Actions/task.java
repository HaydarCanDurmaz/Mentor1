package Actions;

import Utlity.BaseDriver;

import org.checkerframework.framework.qual.DefaultQualifier;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import java.util.List;

public class task extends BaseDriver {
    @Test
    public void senaryo1() {
        driver.get("https://www.browserstack.com/");

        Actions aksiyonlar = new Actions(driver);
        WebElement getStarted = driver.findElement(By.linkText("Get started free"));
        aksiyonlar.moveToElement(getStarted).click().build().perform();


    }

    @Test
    public void senaryo2() {
        driver.get("https://www.browserstack.com/");

        Actions aksiyonlar = new Actions(driver);
        WebElement live = driver.findElement(By.xpath("//a[@class='product-cards-wrapper--click--hoverclick product-card-live']"));
        aksiyonlar.moveToElement(live).build().perform();

        WebElement automat = driver.findElement(By.xpath("//a[@class='product-card-app-automate product-cards-wrapper--click--hoverclick']"));
        aksiyonlar.moveToElement(automat).click().build().perform();



    }
    @Test
    public void senaryo3() {
        driver.get("https://www.browserstack.com/");

        Actions aksiyonlar = new Actions(driver);
        WebElement freetrial = driver.findElement(By.xpath("//a[@class='btn-secondary-white btn-md']"));
        aksiyonlar.doubleClick(freetrial).build().perform();
    }
    @Test
    public void senaryo4() {
       driver.get("https://www.globalsqa.com/demo-site/draganddrop/");
       // WebElement iframe = driver.findElement(By.xpath("//iframe[@class='\"demo-frame lazyloaded\"]"));
       // driver.switchTo().frame(iframe);

        List<WebElement> images= (List<WebElement>) driver.findElement(By.xpath("//li[@class='ui-widget-content ui-corner-tr ui-draggable ui-draggable-handle']"));

        WebElement trash = driver.findElement(By.xpath("//*[@id=\"trash\"]"));
        for (WebElement image:images){
            Actions aksiyonlar=new Actions(driver);
            aksiyonlar.dragAndDrop(image,trash).build().perform();










        }









   
    }
}
