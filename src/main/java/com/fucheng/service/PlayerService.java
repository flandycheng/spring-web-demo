package com.fucheng.service;

import com.fucheng.dao.GearDAO;
import com.fucheng.dao.PlayerDAO;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by dell on 2017/2/5.
 */
public class PlayerService {
    @Autowired
    PlayerDAO playerDao;

    GearDAO gearDAO;

    private int loginCount = 0;

    public void login() {
        this.loginCount++;
        //return this.loginCount;
    }

    @Override
    public String toString() {
        return "ToString PlayerService [PlayerDao=" + playerDao + " , "
                + "GearDao=" + gearDAO
                + " ] ";
    }
}
