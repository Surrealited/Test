package com.aimprosoft.steps.serenity;

import com.aimprosoft.pages.RozetkaBuy;
import net.thucydides.core.annotations.Step;

public class EndUserSteps {

    public boolean search;
    RozetkaBuy RozetkaIphone;

    @Step
    public void is_the_home_page() { RozetkaIphone.open();
    }

    @Step
    public void looks_for(String word){
        RozetkaIphone.looks_for(word);
    }

    @Step
    public void click_on_result()  {RozetkaIphone.clickOnIphoneXs();
    }

    @Step
    public void chooseIphoneXS() { RozetkaIphone.chooseIphone();
    }

    @Step
    public void choose_color() {RozetkaIphone.chooseGOLDIphone();
    }

    @Step
    public void choose_color_gray() {RozetkaIphone.chooseGrayIphone();
    }

    @Step
    public void add_phone()  {RozetkaIphone.addIphoneToBasket();
    }

    @Step
    public void searchBy(String word) {
        RozetkaIphone.lookFor(word);
    }



}