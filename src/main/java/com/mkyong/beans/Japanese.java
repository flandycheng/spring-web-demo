package com.mkyong.beans;

import com.mkyong.myface.Axe;
import com.mkyong.myface.Person;

/**
 * Created by zhenggaoqi on 1/21/17.
 */
public class Japanese implements Person{
    private Axe axe;
    //默认构造器
    public Japanese(){

    }

    //构造注入所需的带参数构造器
    public Japanese(Axe axe){
        this.axe = axe;
    }

    public void useAxe() {
        System.out.println(this.getClass()+" using "+axe.chop());
    }
}
