package com.fucheng.service;

import com.fucheng.annotation.ExcludeService;
import com.fucheng.dao.PlayerDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;

/**
 * Created by dell on 2017/2/5.
 */

public class RankService {
    
    @Autowired
    PlayerDAO playerDAO;

    public void setPlayerDAO(PlayerDAO playerDAO){
        this.playerDAO = playerDAO;
    }

    public void refreshRanking(int score){
        System.out.println("Refresh My Ranking " + score);
    }
    
}
