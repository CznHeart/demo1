package com.example.demo1.entity;

import java.util.Date;


/**
 * @author: Heart❤
 * @Time: 2021/4/21  10:33
 * @purpose:
 */

public class Announce {
    /**
     * id
     */
    private Integer announceId;

    /**
     * user
     */
    private Integer userId;

    /**
     * 物品名称
     */
    private String itemName;

    /**
     * 发布类型（0失物招领1寻物启事）
     */
    private Boolean announceType;

    /**
     * 照片
     */
    private String itemPhoto;

    /**
     * 标签
     */
    private String tagName;

    /**
     * 特征描述
     */
    private String itemDescription;

    /**
     * 时间
     */
    private Date itemTime;

    /**
     * 发现地点、丢失地点
     */
    private String itemPlace;

    /**
     * 联系方式
     */
    private String contact;

    /**
     * 0未确认1已确认2删除
     */
    private Integer isStatus;

    public Integer getAnnounceId() {
        return announceId;
    }

    public void setAnnounceId(Integer announceId) {
        this.announceId = announceId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public Boolean getAnnounceType() {
        return announceType;
    }

    public void setAnnounceType(Boolean announceType) {
        this.announceType = announceType;
    }

    public String getItemPhoto() {
        return itemPhoto;
    }

    public void setItemPhoto(String itemPhoto) {
        this.itemPhoto = itemPhoto;
    }

    public String getTagName() {
        return tagName;
    }

    public void setTagName(String tagName) {
        this.tagName = tagName;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public void setItemDescription(String itemDescription) {
        this.itemDescription = itemDescription;
    }

    public Date getItemTime() {
        return itemTime;
    }

    public void setItemTime(Date itemTime) {
        this.itemTime = itemTime;
    }

    public String getItemPlace() {
        return itemPlace;
    }

    public void setItemPlace(String itemPlace) {
        this.itemPlace = itemPlace;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Integer getIsStatus() {
        return isStatus;
    }

    public void setIsStatus(Integer isStatus) {
        this.isStatus = isStatus;
    }
}