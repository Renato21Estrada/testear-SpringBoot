package com.bdd.web.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class GetPetPage {

    public GetPetPage(WebDriver driver){
        PageFactory.initElements(driver , this);
    }
    @FindBy(xpath ="//div[@id='operations-pet-getPetById']//div[1]//button[1]")
    private WebElement buttonGet;

    @FindBy(xpath="//div[@id='operations-pet-getPetById']//div[2]//button")
    private WebElement buttonTry;

    @FindBy(xpath="//td[@class='parameters-col_description']//input")
    private WebElement InputId;

    @FindBy(xpath="//div[@class='execute-wrapper']//button")
    private WebElement buttonExecute;

    @FindBy(xpath="//*[contains(text(),200)]")
    private WebElement status;

    public void TypeGet(){
        buttonGet.click();
    }
    public void TypeButtonTry(){
        buttonTry.click();
    }
    public void TypeInputId(String inputId){
        InputId.sendKeys(inputId);
    }
    public void TypeButtonExecute(){
        buttonExecute.click();
    }
    public String TypeStatus(){
        return status.getText();
    }

}
