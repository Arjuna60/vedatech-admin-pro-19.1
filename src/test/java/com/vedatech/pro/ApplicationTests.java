package com.vedatech.pro;

import com.vedatech.pro.model.bank.Bank;
import com.vedatech.pro.model.bank.BankTransaction;
import com.vedatech.pro.model.invoice.Invoice;
import com.vedatech.pro.repository.bank.BankDao;
import com.vedatech.pro.repository.invoice.InvoiceDao;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.validation.constraints.Max;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class ApplicationTests {

    @Autowired
    public InvoiceDao invoiceDao;
    public BankDao bankDao;
//
//    public ApplicationTests(InvoiceDao invoiceDao, BankDao bankDao) {
//        this.invoiceDao = invoiceDao;
//        this.bankDao = bankDao;
//    }

    @Test
    public void contextLoads() {
    }


    @Test
    public void testM2MAddDeposit() {

        List<BankTransaction> bankTransactions = new ArrayList<>();
        Bank bank = new Bank();
        bank.setId((long) 1);
        bank.setNameBank("Banorte");
        bank.setBalance(BigDecimal.valueOf(10000));
        bankDao.save(bank);
//        Invoice invoice = new Invoice();
//        BankTransaction bankTransaction = new BankTransaction();
//        bankTransaction.setBank(bank);
//        bankTransaction.setDeposito(Double.valueOf(10000));
//        invoice.setCustomerName("Soriana");
//        invoice.setFolio("222222");
//        bankTransactions.add(bankTransaction);
//        invoice.setTotal(BigDecimal.valueOf(12000.00));
//        invoice.setBankTransactionList(bankTransactions);
//        invoiceDao.save(invoice);
    }

}

