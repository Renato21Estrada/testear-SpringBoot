package com.bdd.web.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.json.Json;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PutPetPage {

    public PutPetPage(WebDriver driver){
    PageFactory.initElements(driver , this);
    }

    @FindBy(xpath ="//div[@id='operations-pet-updatePet']//button[1]")
    private WebElement buttonPUT;

    @FindBy(xpath="//div[@class='try-out']//button[1]")
    private WebElement buttonTry;

    @FindBy(xpath="//div[@class='body-param']//textarea")
    private WebElement jsonPut;

    @FindBy(xpath="//div[@class='execute-wrapper']//button")
    private WebElement btnExecute;

    @FindBy(xpath="//tr[@class='response']//td[1]")
    private WebElement estado;


    public void TypeButtonPut(){
        buttonPUT.click();
    }
    public void TypeButtonTry(){
        buttonTry.click();
    }
    public void TypeJsonPut(Json jsonp){
        jsonPut.sendKeys((CharSequence) jsonp);
    }
    public void TypeButtonExecute(){
        btnExecute.click();
    }
    public String TypeStatus(){
        return estado.getText();
    }

}
