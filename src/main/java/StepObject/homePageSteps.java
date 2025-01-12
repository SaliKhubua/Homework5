package StepObject;

import PageObject.homePage;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Step;

import static com.codeborne.selenide.Selenide.$;

public class homePageSteps extends homePage {


    @Step ("Clicking on search button")
    public homePageSteps ClickOnSearch () {
        searchBar.click();
        searchBar.setValue("laptop");
        searchBar.shouldNot(Condition.empty);

        return this;

    }

    @Step ("Checking if logo is visible")
    public homePageSteps CheckIfLogoIsVisible() {
        amazonLogo.click();
        amazonLogo.shouldBe(Condition.visible);

        return this;
    }
}
