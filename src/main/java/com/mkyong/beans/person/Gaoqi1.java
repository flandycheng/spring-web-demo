package com.mkyong.beans.person;

/**
 * Created by zhenggaoqi on 1/21/17.
 */
public class Gaoqi1 {

    public static final double PI = 3.1415;
    public static String API_URL = "/requestbaidu/bilibli";

    public String name ;
    public int age;

    public Gaoqi1(){
        this.name = "GaoqiDefault";
        this.age = 1;
    }

    public Gaoqi1(String name, int age){
        this.name = name;
        this.age = age;
    }



}
