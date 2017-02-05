package com.fucheng.dao;

import org.springframework.stereotype.Repository;

/**
 * Created by dell on 2017/2/5.
 */
@Repository
public class GearDAO {
    private String name;
    private String category;

    public GearDAO() {
        this.name = "Spear";
        this.category = "Weapon";
    }
}
