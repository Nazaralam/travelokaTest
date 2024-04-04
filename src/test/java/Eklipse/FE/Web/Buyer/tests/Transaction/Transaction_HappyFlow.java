package Eklipse.FE.Web.Buyer.tests.Transaction;

import Eklipse.FE.Web.LoginManager.Buyer.pageObjects.initializePageObjects.BuyerPageLoginInitializerBuyer;
import io.qameta.allure.Description;
import org.testng.annotations.Test;

public class Transaction_HappyFlow extends BuyerPageLoginInitializerBuyer {

    @Description("Transaction one item at JamTangan.com as a new user")
    @Test
    public void TransactionHappyFlow_Web()throws Exception{
//        //== Given ==//
//        //Login
//        LoginEklipse()
//                .closePopUp().clickMasukBtn()
//                .InputEmail().InputPassword().btnLogin();
//        //homepage
//        Homepage()
//                .searchProduct1().btnSearchroduct().btnLewatiPopUpSpecific().clickWatchBtn1();
//        //== When ==//
//        //Detail product 1
//        DetailProduct1Page()
//                .btnTambahkeranjangClick().btnPopUpTambahkeranjangClick().snackBarLihatKeranjangClick();
//        //Keranjang
//        KeranjangPage().btnLanjutkanClick().btnCreateAlamatNewClick();
//        //== And ==//
//        //Alamat
//        AlamatPage()
//                .txtboxAlamat().txtboxNamaPenerima().txtboxNoTelp()
//                .txtboxKotaorKecamatan().chooseKotaorKecamatan().txtboxKodePos()
//                .txtareaDetailAlamat().btnSimpanAlamatClick();
//        //== And ==//
//        //Shipping
//        ShippingPage()
//                .dropdownPilihPengirimanClick().btnPilihPembayaran().totalAmountProduct1()
//                .btnTrfBankClick();
//        //== Then ==//
//        //Assertion
//        ShippingPage()
//                .validateTrfFromBCA().verifyAmountProduct1();
    }
}
