package com.driving.model;

/**
 * Created by pxq on 2017/11/24.
 * ground实体类
 */
public class Ground {

    private String id;
    private String name;
    private String addr;
    private String longitude;
    private String latitude;

    public Ground() {
        super();
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAddr(String addr) {
        this.addr = addr;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getAddr() {
        return addr;
    }

    public String getLongitude() {
        return longitude;
    }

    public String getLatitude() {
        return latitude;
    }

    @Override
    public String toString() {
        return "Ground{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", addr='" + addr + '\'' +
                ", longitude='" + longitude + '\'' +
                ",latitude='" + latitude + '\'' +
                '}';
    }
}
