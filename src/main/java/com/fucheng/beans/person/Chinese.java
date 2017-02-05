package com.fucheng.beans.person;

import com.fucheng.myface.Axe;
import com.fucheng.myface.Person;

/**
 * Created by zhenggaoqi on 1/21/17.
 */
public class Chinese implements Person {

    private Axe axe;
    private String name;

    public void useAxe() {
        System.out.println(this.getClass().toString() + " 在使用 " + axe.chop());
    }

    public void setAxe(Axe axe) {
        this.axe = axe;
    }

    public void setName(String name) {
        this.name = name;
    }
}
