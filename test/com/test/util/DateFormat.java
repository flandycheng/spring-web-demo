package com.test.util;

import com.mkyong.beans.person.Chinese;
import org.junit.BeforeClass;
import org.junit.Test;

import java.util.Date;

/**
 * Created by dell on 2017/2/3.
 */
public class DateFormat {

    @BeforeClass
    public static void prepare() {
        System.out.println("Preparing for date format test !!!");
    }

    @Test
    public void printDate() {
        Date date1 = new Date();
        long timeStamp = date1.getTime();
        System.out.println(date1);
    }

}
