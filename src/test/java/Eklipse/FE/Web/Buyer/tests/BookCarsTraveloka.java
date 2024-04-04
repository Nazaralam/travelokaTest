package Eklipse.FE.Web.Buyer.tests;


import Eklipse.FE.Web.Buyer.PageObjects.BookCars;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class BookCarsTraveloka extends BookCars {

    @Description("book cars using Traveloka Car Rental")
    @Test
    public void Book_Cars()throws Exception{
        BookCarsTrave().
                btnCLickCarRental().
                inputLocationRental().
                inputDateStartRent().
                inputDateEndRent().
                inputTimeEndRent().
                btnClickSearch().
                btnContinueChooseCar1stList().
                btnContinueChooseProvider2ndList().
                btnContinueCar().
                inputBiodata().
                inputDriverDetail().
                inputNotes().
                lblRequirments().
                btnNextPaymentProcess();
    }




}
