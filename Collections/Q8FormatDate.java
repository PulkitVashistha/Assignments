package com.ttnd.extra.Collections;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Q8FormatDate {
    public static void main(String[] args) {
        Date d = new Date();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MMMM-YYYY");
        String date = simpleDateFormat.format(d);
        System.out.println(date);
    }
}
