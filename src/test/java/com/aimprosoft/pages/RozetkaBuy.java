package com.aimprosoft.pages;

import com.aimprosoft.steps.serenity.Locators;
import net.thucydides.core.annotations.DefaultUrl;
import net.thucydides.core.pages.PageObject;
import org.junit.Assert;



@DefaultUrl("http://rozetka.com.ua/")
public class RozetkaBuy extends PageObject implements Locators {


    public void looks_for(String keywords)  {
        waitABit(1000);
        $(SEARCH_FIELD).type(keywords);

    }

    public void clickOnIphoneXs() {
        waitABit(1000);
        $(CLICK_ON_IPHONE_XS).click();



    }

    public void chooseIphone(){
        waitABit(1000);
        $(CLICK_ON).click();

    }

    public void chooseGOLDIphone(){
        waitABit(1000);
        $(COLOR_SILVER).click();

    }

    public void chooseGrayIphone(){
        waitABit(1000);
        $(COLOR_GRAY).click();
    }

    public void addIphoneToBasket()  {
        waitABit(1000);
        $(ADD_TO_BASKET).click();

    }
    public void lookFor(String word){
        String nameButton = $(CHECK_THE_VISIBLE_BASKET).getText();
        Assert.assertEquals(nameButton, "Оформить заказ");
    }
}




















//@FindBy(name = "search")
// private WebElementFacade searchTerms;

//@FindBy(className = "search-suggest__item")
//private WebElement lookupButton;



//public void enter_keywords(String keyword) throws InterruptedException {
// searchTerms.type(keyword);
// Thread.sleep(2000);
// }

//public void lookup_terms() throws InterruptedException {
//lookupButton.click();
//.sleep(2000);
// }
//}

//public void looku_terms() {
//lookupButto.click();
//}

    /*public List<String> getName() {
        WebElementFacade definitionList = find(By.tagName("ol"));
        return definitionList.findElements(By.tagName("li")).stream()
                             .map( element -> element.getText() )
                             .collect(Collectors.toList());*/

