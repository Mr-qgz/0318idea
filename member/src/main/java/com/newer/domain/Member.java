package com.newer.domain;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.io.Serializable;
import java.sql.Date;

public class Member implements Serializable {

    private Integer id;
    private String name;
    private String phone;
    private Integer level;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    private Date time;
    private String card;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getLevel() {
        return level;
    }

    public void setLevel(Integer level) {
        this.level = level;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public String getCard() {
        return card;
    }

    public void setCard(String card) {
        this.card = card;
    }
}
