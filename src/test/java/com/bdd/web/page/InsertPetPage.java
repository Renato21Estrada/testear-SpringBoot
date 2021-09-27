package com.bdd.web.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class InsertPetPage {

    public InsertPetPage(WebDriver driver){
        PageFactory.initElements(driver,this);
    }

    @FindBy(xpath = "button.opblock-summary-control")
    private WebElement opcionPost;

    @FindBy(xpath = "button.try-out__btn")
    private WebElement opcionTry;

    @FindBy(xpath = "//div[@class='body-param']//textarea")
    private WebElement codigo;

    @FindBy(xpath = "//div[@class='execute-wrapper']//button")
    private WebElement buttonExecute;

    @FindBy(xpath = "//tr(@class='response')//td[1]")
    private WebElement estado;

    public void typeOpcionPost(){
        opcionPost.click();
    }
    public void typebuttonTry(){
        opcionTry.click();
    }
    public void typeingresar(Json data){
        codigo.sendKeys((CharSequence) data);
    }
    public void typeButtonExecute(){
        buttonExecute.click();
    }
    public String TypeStatus(){
        return estado.getText();
    }

}
