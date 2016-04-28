package com.louisgeek.louisshopcart.bean;

/**
 * Created by louisgeek on 2016/4/27.
 */
public class StoreBean {
    /** 店铺ID */
    private String id;
    /** 店铺名称 */
    private String name;

    private boolean isChecked;

    private boolean isEditing;

    public StoreBean(String id, String name,boolean isChecked,boolean isEditing) {
        this.id = id;
        this.name = name;
        this.isChecked = isChecked;
        this.isEditing = isEditing;
    }

    public StoreBean() {
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public boolean isEditing() {
        return isEditing;
    }

    public void setIsEditing(boolean isEditing) {
        this.isEditing = isEditing;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isChecked() {
        return isChecked;
    }

    public void setIsChecked(boolean isChecked) {
        this.isChecked = isChecked;
    }
}
