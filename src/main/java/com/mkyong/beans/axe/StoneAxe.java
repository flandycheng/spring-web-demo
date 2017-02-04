package com.mkyong.beans.axe;

import com.mkyong.myface.Axe;

/**
 * Created by zhenggaoqi on 1/21/17.
 */
public class StoneAxe implements Axe {

    public String chop(){
        return " 石头斧子好烂.." + this.toString();
    }
}
