package fr.upskills.pages;

import fr.upskills.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final WebDriver driver;
    private final By solutionsMenu = By.cssSelector("a[href*='solutions']");
    private final By cadresExpertsLink = By.cssSelector("a[href*='cadres-experts']");
    private final By contactButton = By.cssSelector("a[href*='contact']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void navigateToSolutions() {
        WebElement solutionsElement = CommonUtils.waitForElementClickable(solutionsMenu);
        solutionsElement.click();
    }

    public void clickCadresExperts() {
        WebElement cadresExpertsElement = CommonUtils.waitForElementClickable(cadresExpertsLink);
        cadresExpertsElement.click();
    }

    public void clickContact() {
        WebElement contactElement = CommonUtils.waitForElementClickable(contactButton);
        contactElement.click();
    }

    public String getPageTitle() {
        return driver.getTitle();
    }
} 