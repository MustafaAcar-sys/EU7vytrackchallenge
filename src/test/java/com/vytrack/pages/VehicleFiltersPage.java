package com.vytrack.pages;

import com.vytrack.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class VehicleFiltersPage extends BasePage {

    public VehicleFiltersPage(){PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//h1[@class='oro-subtitle']")
    public WebElement AllCars;

    @FindBy(xpath = "//a[@title='Filters']")
    public WebElement filter;

    @FindBy(xpath ="//a[@class='add-filter-button']")
    public WebElement manageFilters;

    @FindBy(id = "ui-multiselect-0-0-option-0")
     public WebElement filterTypes;

    @FindBy(xpath ="//div[@class='filter-container']")
    public WebElement filter_container;









}
