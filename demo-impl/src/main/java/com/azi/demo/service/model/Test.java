
package com.azi.demo.service.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @author azizwz@aliyun.com
 *         Function:
 */
public class Test implements Serializable {


    private String name;
    private Date time;

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

    @Override
    public String toString() {
        return "Test{" +
                "name='" + name + '\'' +
                ", time=" + time +
                '}';
    }
}
