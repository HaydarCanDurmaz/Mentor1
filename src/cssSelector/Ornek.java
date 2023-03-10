package cssSelector;

import Utlity.Utlity.BaseDriver;
import Utlity.Utlity.MyFunc;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;
public class Ornek extends BaseDriver {
    @Test
    public void Test() {


        driver.get("http://demo.nopcommerce.com/");


        MyFunc.Bekle(2);
        WebElement regista = driver.findElement(By.cssSelector("[class='ico-register']"));
        regista.click();

        MyFunc.Bekle(2);
        WebElement male = driver.findElement(By.cssSelector("[value = 'M']"));
        male.click();


        MyFunc.Bekle(2);
        WebElement firstname = driver.findElement(By.cssSelector("[id='FirstName']"));
        firstname.sendKeys("haydarcan");

        MyFunc.Bekle(2);
        WebElement lastname = driver.findElement(By.cssSelector("[id='LastName']"));
        lastname.sendKeys("durmaz");


        MyFunc.Bekle(2);
        WebElement day = driver.findElement(By.cssSelector("[value='18']"));
        day.click();



        MyFunc.Bekle(2);
        WebElement mou = driver.findElement(By.cssSelector("[value='6']"));
        mou.click();



        MyFunc.Bekle(2);
        WebElement years = driver.findElement(By.cssSelector("[value='1995']"));
        years.click();


        MyFunc.Bekle(2);
        WebElement email = driver.findElement(By.cssSelector("[id='Email']"));
        email.sendKeys("cdrhd@hotmail.com");



        MyFunc.Bekle(2);
        WebElement comname = driver.findElement(By.cssSelector("[id='Company']"));
        comname.sendKeys("TeknoStudy");


        MyFunc.Bekle(2);
        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        password.sendKeys("12345_");



        MyFunc.Bekle(2);
        WebElement compassword = driver.findElement(By.cssSelector("[type='password'][id='ConfirmPassword']"));
        compassword.sendKeys("12345_");




        MyFunc.Bekle(2);
        WebElement regist = driver.findElement(By.cssSelector("[id='register-button']"));
        regist.click();



        MyFunc.Bekle(2);
        WebElement contine = driver.findElement(By.cssSelector("[class='button-1 register-continue-button']"));
        contine.click();


        MyFunc.Bekle(2);
        WebElement Login = driver.findElement(By.cssSelector("[class='ico-login']"));
        Login.click();



        MyFunc.Bekle(2);
        WebElement email2 = driver.findElement(By.cssSelector("[class='email']"));
        email2.sendKeys("cdrhd@hotmail.com");


        MyFunc.Bekle(2);
        WebElement passwor2 = driver.findElement(By.cssSelector("[class='password']"));
        passwor2.sendKeys("12345_");


        MyFunc.Bekle(2);
        WebElement loggin = driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        loggin.click();




        WebElement logout = driver.findElement(By.cssSelector("[href='/logout']"));
        assertTrue(logout.isEnabled());



        BekleKapat();




    }
}
