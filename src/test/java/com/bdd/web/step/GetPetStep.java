package com.bdd.web.step;

import com.bdd.web.page.GetPetPage;
import org.openqa.selenium.WebDriver;

public class GetPetStep {

    private WebDriver driver;

    public GetPetStep(WebDriver driver){
        this.driver = driver;
    }

    private GetPetPage getPage(){
        return  new GetPetPage(driver);
    }

    public void ingresarGet(){
        getPage().TypeGet();

    }
    public void ingresarTry(){
        getPage().TypeButtonTry();
    }
    public void ingresarInput(String id){
        getPage().TypeInputId(id);
    }
    public void presionarExecute(){
        getPage().TypeButtonExecute();
    }
    public String getValueTitle(){
        return getPage().TypeStatus();
    }



}
