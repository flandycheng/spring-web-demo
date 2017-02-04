package com.mkyong.beans.person;

import com.mkyong.myface.Axe;
import com.mkyong.myface.Person;

/**
 * Created by zhenggaoqi on 1/21/17.
 */
public class Japanese implements Person{
    private Axe axe;
    private String name;
    //默认构造器
    public Japanese(){

    }

    //构造注入所需的带参数构造器
    public Japanese(Axe axe){
        this.axe = axe;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void useAxe() {
        System.out.println(this.getClass().toString() + " が使ってんの " + axe.chop());
    }
}
