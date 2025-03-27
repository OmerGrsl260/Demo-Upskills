package fr.upskills.pages;

import fr.upskills.utils.CommonUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private final WebDriver driver;
    private final By accCookiesButton = By.xpath("//button[@data-cky-tag='accept-button']");
    private final By accAdsButton = By.xpath("//a[@class='da-close evr-close']");
    private final By solutionsMenu = By.xpath("//a[normalize-space()='Nos solutions']");
    private final By cadresExpertsLink = By.xpath("//a[@href='/nos-solutions/recrutement-cadres-experts/']");
    private final By contactButton = By.xpath("//*[@href='/contactez-nous/']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public void acceptCookies() {
        WebElement acceptCookiesButton = CommonUtils.waitForElementClickable(accCookiesButton);
        acceptCookiesButton.click();
    }

    public void acceptAds() {
        WebElement acceptAdsButton = CommonUtils.waitForElementClickable(accAdsButton);
        acceptAdsButton.click();
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
} 