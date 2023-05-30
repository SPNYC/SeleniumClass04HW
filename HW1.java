package class04.Homework;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

/*
goto   http://practice.syntaxtechs.net/basic-select-dropdown-demo.php
select , tuesday, thursday and friday one by one

 */
public class HW1 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {


        String url = "http://practice.syntaxtechs.net/basic-select-dropdown-demo.php";
       String browser = "safari";
       openBrowserAndLaunchApplication(url, browser);



       WebElement weekday = driver.findElement(By.xpath("//select[@id='select-demo']"));
        weekday.click();
        Thread.sleep(2000);

        Select option = new Select(weekday);

        option.selectByValue("Tuesday");
        Thread.sleep(2000);

        option.selectByIndex(5);
        Thread.sleep(2000);

        option.selectByVisibleText("Friday");
        Thread.sleep(2000);

        driver.quit();

    }

    }

