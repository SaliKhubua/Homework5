package AmazonTest;

import StepObject.homePageSteps;
import Utils.ChromeRunner;
import com.codeborne.selenide.Condition;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.Assert;
import org.testng.annotations.Test;

public class homePageTest extends ChromeRunner {
    homePageSteps homePageSteps = new homePageSteps();

    @Test
    @Description("Clicking on search button to make sure it works")
    @Severity(SeverityLevel.CRITICAL)
    public void amazonhmptest () {
        homePageSteps
                .ClickOnSearch();

        Assert.assertTrue(homePageSteps.searchBar.is(Condition.enabled));

    }

    @Test
    @Description("Checking that Amazon Logo is visible on the website")
    @Severity(SeverityLevel.CRITICAL)

    public void amazonhmptest1() {
        homePageSteps.CheckIfLogoIsVisible();

        Assert.assertTrue(homePageSteps.amazonLogo.is(Condition.visible));

    }

}
