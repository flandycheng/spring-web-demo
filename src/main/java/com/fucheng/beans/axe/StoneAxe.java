package com.fucheng.beans.axe;

import com.fucheng.myface.Axe;

import java.util.Date;

/**
 * Created by zhenggaoqi on 1/21/17.
 */
public class StoneAxe implements Axe {

    private Date createDate;
    public StoneAxe(){
        this.createDate = new Date();
    }
    public StoneAxe(Date createDate){
         this.createDate = createDate;
    }
    
    public String chop(){
        return " 石头斧子好烂.." + this.toString();
    }
}
