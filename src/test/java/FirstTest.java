import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Configuration;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Sleeper;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selectors.*;
import static com.codeborne.selenide.Condition.*;


public class FirstTest {

    @Test
    public void myFirstTest () {

        open("https://www.facebook.com/");

        SelenideElement createNewAccountBtn = $(By.linkText("Create new account"));
        createNewAccountBtn.click();
        $(byName("firstname")).setValue("Salome");
        $(byName("lastname")).setValue("Khubua");
        $(byName("reg_email__")).setValue("Salome123@gmail.com");
        $(byName("reg_passwd__")).setValue("Salome123!");

        $(byName("birthday_day")).selectOption(8);
        $(byName("birthday_month")).selectOption("Jun");
        $(byName("birthday_year")).shouldBe(visible).selectOption("1999");

        $(By.xpath("//label[text()='Custom']")).click();  //ვერ მივწვდი custom-ს სხვანაირად, რადგან სხვა ოფშენებსაც იგივე კლასი აიდი და value ჰქონდა. ვერაგერი ვიპოვე.
        $(byName("preferred_pronoun")).shouldBe(visible);
        $(byName("custom_gender")).shouldBe(visible);
        $(By.xpath("//label[text()='Female']")).click();
        $(byName("preferred_pronoun")).shouldNot(visible);
        $(byName("custom_gender")).shouldNot(visible);














    }
}
