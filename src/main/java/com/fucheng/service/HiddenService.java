package com.fucheng.service;

import com.fucheng.annotation.ExcludeService;

/**
 * Created by dell on 2017/2/5.
 */
@ExcludeService
public class HiddenService {
    
    @Override
    public String toString(){
        return "This Service will not be discoverd by auto-scanner !!";
    }
}
