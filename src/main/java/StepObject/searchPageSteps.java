package StepObject;

import PageObject.SearchPage;
import io.qameta.allure.Step;

public class searchPageSteps extends SearchPage {


    @Step ("Type product in search bar")
    public searchPageSteps TypeProductInSearch (String product) {
        searchbar1.click();
        searchbar1.setValue(product);
        search.click();


        return this;
    }

}
