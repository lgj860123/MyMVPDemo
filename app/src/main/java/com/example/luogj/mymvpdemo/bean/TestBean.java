package com.example.luogj.mymvpdemo.bean;

/**
 * 测试bean
 * Created by Administrator on 2018/4/17.
 */

public class TestBean {
    private String name;
    private int number;
    private String time;

    public TestBean(String name, int number, String time) {
        this.name = name;
        this.number = number;
        this.time = time;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }
}
