package com.fucheng.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by dell on 2017/2/5.
 */
@Repository
public class PlayerDAO {
    private String name;
    private String address;
    private String email;

    public PlayerDAO() {
        this.name = "DefaultPlayer-0";
        this.address = "Peking, China";
        this.email = "defaultplayer@gmail.com";
    }
}
