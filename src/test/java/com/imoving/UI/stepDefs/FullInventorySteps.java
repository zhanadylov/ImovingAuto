package com.imoving.UI.stepDefs;

import com.imoving.UI.methods.CustomAssertions;
import com.imoving.UI.methods.Helper;
import com.imoving.UI.methods.SelectRandom;
import com.imoving.UI.pageObjects.*;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;

public class FullInventorySteps {
    TheseAreRecommendedRoomsForAPopUpText recButtonRoom = new TheseAreRecommendedRoomsForAPopUpText();
    Hints hints = new Hints();
    FullInventoryPage fullInventoryPage = new FullInventoryPage();
    LivingRoomPage livingRoom = new LivingRoomPage();
    BedRoomPage BedRoomPage = new BedRoomPage();
    DiningRoomPage diningRoomPage = new DiningRoomPage();

    @Then("User should see new pop-up window {string}")
    public void user_should_see_new_pop_up_window(String RecommendRoomText) {
        Assertions.assertEquals(RecommendRoomText, Helper.getTextValue(recButtonRoom.TheseAreRecommendedRoomsForAPopUpText));
    }
    @When("use clicks on Continue button in These are recommended rooms for a popup")
    public void use_clicks_on_continue_button_in_these_are_recommended_rooms_for_a_popup() {
        Helper.click(recButtonRoom.TheseAreRecommendedRoomsForAPopUpContinueButton);
    }
    @Then("Boxes pop up should appear with text {string} button")
    public void user_boxes_pop_up_should_appear_with_button(String boxPopUpBoxesText) {
        Assertions.assertEquals(boxPopUpBoxesText, Helper.getTextValue(hints.hintBoxesGotItText));
    }
    @When("user clicks on {string} button in boxes pop up")
    public void user_clicks_on_button_in_boxes_pop_up(String boxButton) {
        Helper.click(hints.hintBoxesGotItButton);
    }
    @Then("user should see hint in {string}")
    public void user_should_see_hint(String hintText) {
        CustomAssertions.assertText("These popup text", hintText, hints.hintHereYouCanSeeAllYourRoomsAndStarMovingText);
    }
    @When("user clicks to next button in Here you can see all your rooms and start moving!")
    public void user_clicks_to_next_button_in_here_you_can_see_all_your_rooms_and_start_moving() {
        Helper.click(hints.hintHereYouCanSeeAllYourRoomsAndStarMovingNextButton);
    }
    @Then("user clicks to next button in Here you can see inventory items for selected rooms!")
    public void user_clicks_to_next_button_in_here_you_can_see_inventory_items_for_selected_rooms() {
        Helper.click(hints.HereYouCanSeeInventoryItemsForSelectedRoomsButton);
    }
    @When("user should see hint {string}")
    public void user_clicks_to_next_button_in(String string) {
        CustomAssertions.assertText("These popup text", string, hints.PressThisButtonToSaveChoosedItemsText);
    }
    @Then("user should click OK button in Press this button to save choosed items and move to the next room!")
    public void user_should_click_ok_button_in_press_this_button_to_save_choosed_items_and_move_to_the_next_room() {
        Helper.click(hints.PressThisButtonToSaveChoosedItemsButton);
    }
    // Adding items. Living room
    @Then("user should click add to inventory Sofa in living room")
    public void user_should_click_add_to_inventory_sofa_in_living_room() {
        Helper.navigateToElement(livingRoom.sofaPicture);
        Helper.click(livingRoom.addToInventorySofa);
    }
    @Then("user should click add to inventory TV in living room")
    public void user_should_click_add_to_inventory_tv_in_living_room() {
        Helper.navigateToElement(livingRoom.tvPicture);
        Helper.click(livingRoom.addToInventoryTV);
    }
    @Then("user clicks on save and go to next button")
    public void user_clicks_on_save_and_go_to_next_button() {
        Helper.click(fullInventoryPage.SaveAndGoToNextButton);
    }
    @Then("user should click add to inventory Dresser in Bedroom room")
    public void user_should_click_add_to_inventory_dresser_in_bedroom_room() {
//        Helper.navigateToElement(BedRoomPage.dresserPicture);
//        Helper.click(BedRoomPage.addDresser);
        SelectRandom.randomChooseItems(BedRoomPage.elements, 3);
    }
    @Then("user should click add to inventory Bed in Bedroom room")
    public void user_should_click_add_to_inventory_bed_in_bedroom_room() {
//        Helper.navigateToElement(BedRoomPage.bedPicture);
        SelectRandom.randomChooseItems(BedRoomPage.elements, 3);
        Helper.click(BedRoomPage.addBed);
    }
    @Then("user should click add to inventory Rug in Dining room")
    public void user_should_click_add_to_inventory_rug_in_dining_room() {
//        Helper.navigateToElement(diningRoomPage.allinWEb);
        SelectRandom.randomChooseItems(diningRoomPage.allBlin, 3);
//        Helper.click(diningRoomPage.addDining);
//        Helper.click(diningRoomPage.addDining);
    }
    @Then("user should click add to inventory Bench in Dining room")
    public void user_should_click_add_to_inventory_bench_in_dining_room() {
//        Helper.navigateToElement(BedRoomPage.mirrorPicture);
//        SelectRandom.randomChooseItems(diningRoomPage.elements, 2);
//        Helper.click(diningRoomPage.addBed);
        SelectRandom.randomChooseItems(diningRoomPage.elements, 3);
        Helper.click(diningRoomPage.addDining);
//        Helper.click(diningRoomPage.addInventory);
    }
    @Then("user should click add to inventory Kitchen\\/Dining Chairs in Kitchen room")
    public void user_should_click_add_to_inventory_kitchen_dining_chairs_in_kitchen_room() {
//        Helper.navigateToElement(BedRoomPage.lampPicture);
//        SelectRandom.randomChooseItems(BedRoomPage.elements, 3);
//        Helper.click(BedRoomPage.addBed);
    }
    @Then("user should click add to inventory Kitchen\\/Dining Table in Kitchen room")
    public void user_should_click_add_to_inventory_kitchen_dining_table_in_kitchen_room() {
//        Helper.navigateToElement(BedRoomPage.tvPicture);
//        SelectRandom.randomChooseItems(BedRoomPage.elements, 3);
//        Helper.click(BedRoomPage.addInventory);
    }
    @Then("user should click add to inventory Basket\\/Hamper in Bathroom room")
    public void user_should_click_add_to_inventory_basket_hamper_in_bathroom_room() {
//        Helper.navigateToElement(BedRoomPage.deskPicture);
//        SelectRandom.randomChooseItems(BedRoomPage.elements, 3);
//        Helper.click(BedRoomPage.addInventory);
    }
    @Then("user should click add to inventory Trash Can in Bathroom room")
    public void user_should_click_add_to_inventory_trash_can_in_bathroom_room() {
//        SelectRandom.randomChooseItems(BedRoomPage.elements, 3);
//        Helper.click(BedRoomPage.addInventory);
    }
    @Then("user should click add to inventory Outdoor Chair in Patio room")
    public void user_should_click_add_to_inventory_outdoor_chair_in_patio_room() {
//        SelectRandom.randomChooseItems(BedRoomPage.elements, 3);
//        Helper.click(BedRoomPage.addInventory);
    }
    @Then("user should click add to inventory Outdoors Table in Patio room")
    public void user_should_click_add_to_inventory_outdoors_table_in_patio_room() {
//        SelectRandom.randomChooseItems(BedRoomPage.elements, 3);
//        Helper.click(BedRoomPage.addInventory);
    }
    @Then("user should see new pop-up window boxes {string}")
    public void user_should_see_new_pop_up_window_boxes (String string) {
    }
    @Then("user clicks on Add and Continue button")
    public void user_clicks_on_add_and_continue_button() {
    }
}
