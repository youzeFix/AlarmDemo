package com.lius.alarmdemo;

/**
 * Created by Administrator on 2017/4/25 0025.
 */

public class Alarm {

    public static final int ONCE=0;
    public static final int EVERYDAY=1;

    private int id;
    private int hour;
    private int minute;
    private int type;
    private String stringTime;

    public Alarm(int hour,int minute,int type){
        this.hour=hour;
        this.minute=minute;
        this.type=type;
        stringTime=getStringNumber(hour)+":"+getStringNumber(minute);
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinute() {
        return minute;
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    private String getStringNumber(int n){
        if(n<10)return "0"+n;
        else return String.valueOf(n);
    }

    public String getStringTime() {
        return stringTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}