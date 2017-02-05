package com.fucheng.teststh;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

/**
 * Created by dell on 2017/2/5.
 */
@Component
public class ELTest {
    //Relational operators
    @Value("#{1 == 1}") //true
    private boolean testEqual;
    @Value("#{1 != 1}") //false
    private boolean testNotEqual;
    @Value("#{1 < 1}") //false
    private boolean testLessThan;
    @Value("#{1 <= 1}") //true
    private boolean testLessThanOrEqual;
    @Value("#{1 > 1}") //false
    private boolean testGreaterThan;
    @Value("#{1 >= 1}") //true
    private boolean testGreaterThanOrEqual;
    //Mathematical operators @Value("#{1 + 1}") //2.0
    private double testAdd;
    @Value("#{'1' + '@' + '1'}") //1@1
    private String testAddString;
    @Value("#{1 - 1}") //0.0
    private double testSubtraction;
    @Value("#{1 * 1}") //1.0
    private double testMultiplication;
    @Value("#{10 / 2}") //5.0
    private double testDivision;
    @Value("#{10 % 10}") //0.0
    private double testModulus ;
    @Value("#{2 ^ 2}") //4.0
    private double testExponentialPower;
    @Override
    public String toString() {
        return "Customer [testEqual=" + testEqual + ", testNotEqual=" 
                + testNotEqual + ", testLessThan=" + testLessThan + ", testLessThanOrEqual="
                + testLessThanOrEqual + ", testGreaterThan=" + testGreaterThan + ", testGreaterThanOrEqual=" 
                + testGreaterThanOrEqual 
                + ", testAdd=" + testAdd + ", testAddString=" + testAddString 
                + ", testSubtraction=" + testSubtraction + ", testMultiplication="
                + testMultiplication + ", testDivision=" + testDivision + ", testModulus=" 
                + testModulus + ", testExponentialPower=" + testExponentialPower + "]";
    }
}
