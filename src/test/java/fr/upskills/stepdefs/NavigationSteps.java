package fr.upskills.stepdefs;

import fr.upskills.config.DriverConfig;
import fr.upskills.pages.HomePage;
import fr.upskills.utils.CommonUtils;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.fr.Alors;
import io.cucumber.java.fr.Etantdonné;
import io.cucumber.java.fr.Quand;
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

    @Etantdonné("je suis sur la page d'accueil")
    public void jeSuisSurLaPageDAccueil() {
        driver.get("https://upskills.fr");
        CommonUtils.waitForPageLoad(driver);
    }

    @Quand("je clique sur le menu Solutions")
    public void jeCliqueSurLeMenuSolutions() {
        homePage.navigateToSolutions();
    }

    @Quand("je clique sur Cadres & Experts")
    public void jeCliqueSurCadresExperts() {
        homePage.clickCadresExperts();
    }

    @Quand("je clique sur le bouton Contact")
    public void jeCliqueSurLeBoutonContact() {
        homePage.clickContact();
    }

    @Alors("je devrais être sur la page Cadres & Experts")
    public void jeDevraisEtreSurLaPageCadresExperts() {
        Assert.assertTrue(driver.getCurrentUrl().contains("cadres-experts"));
    }

    @Alors("je devrais être sur la page Contact")
    public void jeDevraisEtreSurLaPageContact() {
        Assert.assertTrue(driver.getCurrentUrl().contains("contact"));
    }

    @After
    public void tearDown() {
        DriverConfig.quitDriver();
    }
} 