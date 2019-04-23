package com.vedatech.pro.model.reports;

import lombok.Getter;
import lombok.Setter;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.GregorianCalendar;

@Getter
@Setter
public class FormDate {

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private GregorianCalendar startDate;

    @DateTimeFormat(pattern = "dd/MM/yyyy")
    private GregorianCalendar finalDate;
}
