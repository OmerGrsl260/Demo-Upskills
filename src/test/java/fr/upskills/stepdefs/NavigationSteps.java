package fr.upskills.stepdefs;

import fr.upskills.config.DriverConfig;
import fr.upskills.pages.HomePage;
import fr.upskills.utils.CommonUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.When;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

public class NavigationSteps {
    private WebDriver driver;
    private HomePage homePage;

    @Before
    public void setup() {
        DriverConfig.initializeDriver();
        driver = DriverConfig.getDriver();
        CommonUtils.setWait(DriverConfig.getWait());
        homePage = new HomePage(driver);
    }

    @Given("je suis sur la page d'accueil")
    public void jeSuisSurLaPageDAccueil() {
        String url = DriverConfig.getProperties().getProperty("base.url").trim();
        driver.get(url);
        CommonUtils.waitForPageLoad(driver);
        homePage.acceptCookies();
        homePage.acceptAds();
    }

    @When("je clique sur le menu Solutions")
    public void jeCliqueSurLeMenuSolutions() {
        homePage.navigateToSolutions();
    }

    @When("je clique sur Cadres & Experts")
    public void jeCliqueSurCadresExperts() {
        homePage.clickCadresExperts();
    }

    @When("je clique sur le bouton Contact")
    public void jeCliqueSurLeBoutonContact() {
        homePage.clickContact();
    }

    @Then("je devrais être sur la page Cadres & Experts")
    public void jeDevraisEtreSurLaPageCadresExperts() {
        Assert.assertTrue(driver.getCurrentUrl().contains("cadres-experts"));
    }

    @Then("je devrais être sur la page Contact")
    public void jeDevraisEtreSurLaPageContact() {
        Assert.assertTrue(driver.getCurrentUrl().contains("contact"));
    }

    @After
    public void tearDown() {
        DriverConfig.quitDriver();
    }
} 