package com.vytrack.step_definitions;
import com.vytrack.pages.ContactsPage;
import com.vytrack.pages.DashboardPage;
import com.vytrack.pages.VehicleFiltersPage;
import com.vytrack.utilities.BrowserUtils;
import com.vytrack.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class VehiclePageStepDefs {
    VehicleFiltersPage vehicleFiltersPage=new VehicleFiltersPage();
//1
    @When("the user navigates to  {string} {string} page")
    public void the_user_navigates_to_page(String tab, String module) {
      DashboardPage dashboardPage=new DashboardPage();
        dashboardPage.navigateToModule(tab, module);
        BrowserUtils.waitFor(3);}
    @Then("the title verified as {string}")
    public void the_title_verified_as(String pageName) {
        System.out.println("pageName = " + pageName);
        Assert.assertEquals(pageName, vehicleFiltersPage.AllCars.getText());}

//2
    @Given("the user is on the Vehicles page")
    public void the_user_is_on_the_Vehicles_page() {
          }
    @When("the user clicks the filters icon")
    public void the_user_clicks_the_filters_icon() {
        vehicleFiltersPage.filter.click();
        BrowserUtils.waitFor(3);
            }
    @Then("the {string} button  should be displayed")
    public void the_button_should_be_displayed(String string) {
        Assert.assertTrue("Manage Filters is displayed", vehicleFiltersPage.manageFilters.isDisplayed());
        BrowserUtils.waitFor(3);
               }

//3
    @When("the user clicks the Manage filters button")
    public void the_user_clicks_the_Manage_filters_button() {
       vehicleFiltersPage.manageFilters.click();
       BrowserUtils.waitFor(3);
    }
    @When("the user clicks on filters")
    public void the_user_clicks_on_filter() {

       vehicleFiltersPage.selectFilterBox();
       BrowserUtils.waitFor(2);
        }



    @Then("the filters should be displayed")
    public void the_filter_should_be_displayed() {

        List<String> file = BrowserUtils.getElementsText(vehicleFiltersPage.filter_container);
        for (String s : file) {
            System.out.println(s);

        }
        BrowserUtils.waitFor(3);
       Assert.assertTrue(Driver.get().findElement(By.xpath("//div[@class='filter-item oro-drop']")).isDisplayed());

        }


//4
    @When("the user clicking the Manage filters button")
    public void the_user_clicking_the_Manage_filters_button() {
        vehicleFiltersPage.manageFilters.click();
        BrowserUtils.waitFor(3);
    }
    @Then("the user types a {string} on a filter type")
    public void the_user_types_a_on_a_filter_type(String filterName) {

           vehicleFiltersPage.filterName.sendKeys("License Plate");
            vehicleFiltersPage.licencePlate.click();
            vehicleFiltersPage.filterName.clear();


    }
    @Then("the written {string} should be displayed")
    public void the_written_should_be_displayed(String filterName) {

        Assert.assertTrue(Driver.get().findElement(By.xpath("//input[@type='search']")).isDisplayed());


    }

    //5
    @Given("the user selected filters")
    public void the_user_selected_filters() {


    }

    @When("the user clicks the reset button")
    public void the_user_clicks_the_reset_button() {

    }

    @Then("all the selected filters should be removed")
    public void all_the_selected_filters_should_be_removed() {


    }}