package com.mkyong.beans.axe;

import com.mkyong.myface.Axe;

/**
 * Created by dell on 2017/2/5.
 */
public class GoldenAxe implements Axe {


    public String chop(){
        return " 这是一把金斧子! "+ this.toString();
    }
}
