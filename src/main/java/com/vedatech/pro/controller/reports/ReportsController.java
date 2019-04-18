package com.vedatech.pro.controller.reports;


import com.vedatech.pro.model.bank.Bank;
import com.vedatech.pro.model.invoice.SalesByProduct;
import com.vedatech.pro.repository.invoice.InvoiceItemsDao;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("api/reports")
public class ReportsController {

    public final InvoiceItemsDao invoiceItemsDao;

    public ReportsController(InvoiceItemsDao invoiceItemsDao) {
        this.invoiceItemsDao = invoiceItemsDao;
    }

    //-------------------Retrieve All Bank Accounts--------------------------------------------------------

    @RequestMapping(value = "/getSalesByProduct", method = RequestMethod.GET)
    public ResponseEntity<List<SalesByProduct>> listAllUsers() {
        HttpHeaders headers = new HttpHeaders();
        List<SalesByProduct> salesByProductList = invoiceItemsDao.getDataSales();

        if (salesByProductList.isEmpty()) {
            headers.set("error", "no existen cuentas bancarias");
            return new ResponseEntity<List<SalesByProduct>>(headers, HttpStatus.NO_CONTENT);//You many decide to return HttpStatus.NOT_FOUND
        }

        return new ResponseEntity<List<SalesByProduct>>(salesByProductList, HttpStatus.OK);
    }

}
