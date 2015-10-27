/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.epam.spring.core.htask.cinema.models;

import java.util.Date;

/**
 *
 * @author Oleksandr_Plakushchy
 */
public class User extends BaseModel{
    private Date dateBirth;
    private int state; //статус VIP и т.д.

    public User(int id, String name, Date dateBirth, int state) {
        super.id = id;
        super.name = name;
        this.dateBirth = dateBirth;
        this.state = state;
        
    }

    public Date getDateBirth() {
        return dateBirth;
    }

    public String getName() {
        return name;
    }
    
    
}
