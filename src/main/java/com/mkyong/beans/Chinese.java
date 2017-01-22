package com.mkyong.beans;

import com.mkyong.myface.Axe;
import com.mkyong.myface.Person;

/**
 * Created by zhenggaoqi on 1/21/17.
 */
public class Chinese implements Person {

    private Axe axe;
    private String name;

    public void useAxe() {
        System.out.println("I am " + this.name);
        System.out.println("I am using, " + this.axe.chop());
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public void setName(String name) {
        this.name = name;
    }
}
