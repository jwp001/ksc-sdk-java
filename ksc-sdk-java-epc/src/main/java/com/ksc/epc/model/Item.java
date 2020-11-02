package com.ksc.epc.model;


public class Item {

    /**
     * 类型
     */
    private String item;
    /**
     * 状态
     */
    private String status;

    public void setItem(String item) {
        this.item = item;
    }
    public String getItem() {
        return item;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public String getStatus() {
        return status;
    }

}
