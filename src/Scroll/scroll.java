package Scroll;

import Utlity.BaseDriver;

import Utlity.Tools;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptException;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class scroll extends BaseDriver {
    @Test
    public void ScrollDown(){
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        WebElement username= driver.findElement(By.cssSelector("[name='username']"));
        username.sendKeys("Admin");
        WebElement password= driver.findElement(By.name("password"));
        password.sendKeys("admin123");
        WebElement btn=driver.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--main orangehrm-login-button']"));
        btn.click();

        Tools.Bekle(3);
        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
        Tools.Bekle(3);

        js.executeScript("window.scrollTo(document.body.scrollHeight,0)");
    }
    @Test
    public void scrollByElementVisibility(){
        driver.get("https://www.lambdatest.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;

        WebElement element = driver.findElement(By.xpath("//h2[text()='Ready to Get Started?']"));

        js.executeScript("arguments[0].scrollIntoView",element);








    }
    @Test
    public void scrollByPixel(){
        driver.get("https://www.lambdatest.com/");

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(0,3000)");



    }
    @Test
    public void horizontalLeft(){
        driver.get("https://www.album.alexflueras.ro/index.php");

        JavascriptExecutor js=(JavascriptExecutor) driver;

        js.executeScript("window.scrollBy(6000,0)");

        Tools.Bekle(3);

        js.executeScript("window.scrollBy(-3000,0)");








    }
    @Test
    public void dynamicScroll(){

    }
}
