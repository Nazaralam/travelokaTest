package Eklipse.FE.Web.Buyer.controllers;

import Eklipse.FE.Web.Buyer.utils.BuyerExcelUtils;
import org.testng.annotations.DataProvider;

import java.io.File;
import java.lang.reflect.Method;



public class BuyerExcelDataProvider extends BuyerInitMethod {
    @DataProvider(name = "multiSheetExcelRead", parallel = true)
    public static Object[][] multiSheetExcelRead(Method method) throws Exception {
        File file = new File("./src/test/resources/Excel Files/TestData.xlsx");
        String SheetName = method.getName();
        System.out.println(SheetName);
        return BuyerExcelUtils.getTableArray(file.getAbsolutePath(), SheetName);
    }

    @DataProvider(name = "excelSheetNameAsMethodName", parallel = true)
    public static Object[][] excelSheetNameAsMethodName(Method method) throws Exception {
        File file = new File("./src/test/resources/Excel Files/" + method.getName() + ".xlsx");
        return BuyerExcelUtils.getTableArray(file.getAbsolutePath());
    }
}
