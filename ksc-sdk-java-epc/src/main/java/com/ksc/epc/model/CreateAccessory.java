package com.ksc.epc.model;


public class CreateAccessory {

    /**
     * 配件类型
     */
    private String accessoryType;
    /**
     * 配件规格
     */
    private String accessorySuit;
    /**
     * 配件名称
     */
    private String accessoryName;
    /**
     * 计费类型
     */
    private String chargeType;
    /**
     * 可用区
     */
    private String availabilityZone;
    /**
     * 购买时长
     */
    private Integer purchaseTime;
    /**
     * 项目ID
     */
    private String projectId;

    public void setAccessoryType(String accessoryType) {
        this.accessoryType = accessoryType;
    }
    public String getAccessoryType() {
        return accessoryType;
    }
    public void setAccessorySuit(String accessorySuit) {
        this.accessorySuit = accessorySuit;
    }
    public String getAccessorySuit() {
        return accessorySuit;
    }
    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }
    public String getAccessoryName() {
        return accessoryName;
    }
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }
    public String getChargeType() {
        return chargeType;
    }
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    public void setPurchaseTime(Integer purchaseTime) {
        this.purchaseTime = purchaseTime;
    }
    public Integer getPurchaseTime() {
        return purchaseTime;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    public String getProjectId() {
        return projectId;
    }

}
