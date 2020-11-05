package com.ksc.epc.model;


public class CommunicationContent {

    /**
     * 配件售卖方式
     */
    private String remarks;
    /**
     * 配件类型
     */
    private String author;
    /**
     * 配件规格
     */
    private String createTime;

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String toString() {
        return "CommunicationContent(Remarks=" + this.getRemarks() + ",Author=" + this.getAuthor() + ",CreateTime=" + this.getCreateTime() + ")";
    }

}
