package cssSelector;

import Utlity.BaseDriver;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import static org.junit.Assert.assertTrue;
public class Ornek extends BaseDriver {
    @Test
    public void Test() {


        driver.get("http://demo.nopcommerce.com/");



        WebElement regista = driver.findElement(By.cssSelector("[class='ico-register']"));
        regista.click();


        WebElement male = driver.findElement(By.cssSelector("[value = 'M']"));
        male.click();



        WebElement firstname = driver.findElement(By.cssSelector("[id='FirstName']"));
        firstname.sendKeys("haydarcan");


        WebElement lastname = driver.findElement(By.cssSelector("[id='LastName']"));
        lastname.sendKeys("durmaz");



        WebElement day = driver.findElement(By.cssSelector("[value='18']"));
        day.click();




        WebElement mou = driver.findElement(By.cssSelector("[value='6']"));
        mou.click();




        WebElement years = driver.findElement(By.cssSelector("[value='1995']"));
        years.click();



        WebElement email = driver.findElement(By.cssSelector("[id='Email']"));
        email.sendKeys("cdrhd@hotmail.com");




        WebElement comname = driver.findElement(By.cssSelector("[id='Company']"));
        comname.sendKeys("TeknoStudy");



        WebElement password = driver.findElement(By.cssSelector("[type='password']"));
        password.sendKeys("12345_");




        WebElement compassword = driver.findElement(By.cssSelector("[type='password'][id='ConfirmPassword']"));
        compassword.sendKeys("12345_");





        WebElement regist = driver.findElement(By.cssSelector("[id='register-button']"));
        regist.click();




        WebElement contine = driver.findElement(By.cssSelector("[class='button-1 register-continue-button']"));
        contine.click();



        WebElement Login = driver.findElement(By.cssSelector("[class='ico-login']"));
        Login.click();




        WebElement email2 = driver.findElement(By.cssSelector("[class='email']"));
        email2.sendKeys("cdrhd@hotmail.com");



        WebElement passwor2 = driver.findElement(By.cssSelector("[class='password']"));
        passwor2.sendKeys("12345_");



        WebElement loggin = driver.findElement(By.cssSelector("[class='button-1 login-button']"));
        loggin.click();




        WebElement logout = driver.findElement(By.cssSelector("[href='/logout']"));
        assertTrue(logout.isEnabled());








    }
}
