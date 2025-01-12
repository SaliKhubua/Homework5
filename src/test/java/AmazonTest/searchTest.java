package AmazonTest;

import StepObject.searchPageSteps;
import Utils.ChromeRunner;
import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import org.testng.annotations.Test;
import com.codeborne.selenide.Condition;
import org.testng.Assert;
import org.testng.annotations.Test;

public class searchTest extends ChromeRunner {
    searchPageSteps searchPageSteps = new searchPageSteps();

    @Test
    @Severity(SeverityLevel.CRITICAL)
    @Description ("Checking if search button works and redirects to a new page")
    public void searchtest () {
        searchPageSteps
                .TypeProductInSearch("Laptop");

        Assert.assertTrue(searchPageSteps.search.is(Condition.enabled));
    }
}
