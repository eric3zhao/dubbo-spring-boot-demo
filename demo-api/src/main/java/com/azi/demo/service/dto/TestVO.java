package com.azi.demo.service.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * @author azizwz@aliyun.com
 * Function: 
 */
public class TestVO implements Serializable{
    
    private String id;
    private String name;
    private Date time;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }
}
