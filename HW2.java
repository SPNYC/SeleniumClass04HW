package class04.Homework;

import Utils.CommonMethods;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class HW2 extends CommonMethods {
    public static void main(String[] args) throws InterruptedException {

        String url="https://www.facebook.com";
        String browser="safari";
        openBrowserAndLaunchApplication(url,browser);

        WebElement newAcc = driver.findElement(By.xpath("//a[contains(text(),'Create new account')]"));
        newAcc.click();
        Thread.sleep(2000);

        WebElement month = driver.findElement(By.xpath("//select[@name='birthday_month']"));
        month.click();

        Select birthdayMonth = new Select(month);
        birthdayMonth.selectByVisibleText("Aug");
        Thread.sleep(2000);

        WebElement day = driver.findElement(By.xpath("//select[@name='birthday_day']"));
        day.click();

        Select birthday = new Select(day);
        birthday.selectByValue("3");
        Thread.sleep(2000);

        WebElement year = driver.findElement(By.xpath("//select[@name='birthday_year']"));

        Select birthdayYear = new Select(year);
        birthdayYear.selectByValue("1984");
        Thread.sleep(2000);

        driver.quit();
    }
    }

