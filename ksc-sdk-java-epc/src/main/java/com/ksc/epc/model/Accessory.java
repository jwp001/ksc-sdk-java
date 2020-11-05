package com.ksc.epc.model;


public class Accessory {

    /**
     * 配件ID
     */
    private String accessoryId;
    /**
     * 配件售卖方式
     */
    private String accessorySalesType;
    /**
     * 配件类型
     */
    private String accessoryType;
    /**
     * 配件规格
     */
    private String accessorySuit;
    /**
     * 配件描述
     */
    private String accessoryDescription;
    /**
     * 所属实例ID
     */
    private String hostId;
    /**
     * 所属实例名称
     */
    private String hostName;
    /**
     * 所属实例SN
     */
    private String sn;
    /**
     * 配件名称
     */
    private String accessoryName;
    /**
     * 可用区名称
     */
    private String availabilityZone;
    /**
     * 状态
     */
    private String status;
    /**
     * 项目ID
     */
    private String projectId;
    /**
     * 创建时间
     */
    private String createTime;

    public void setAccessoryId(String accessoryId) {
        this.accessoryId = accessoryId;
    }

    public String getAccessoryId() {
        return accessoryId;
    }

    public void setAccessorySalesType(String accessorySalesType) {
        this.accessorySalesType = accessorySalesType;
    }

    public String getAccessorySalesType() {
        return accessorySalesType;
    }

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

    public void setAccessoryDescription(String accessoryDescription) {
        this.accessoryDescription = accessoryDescription;
    }

    public String getAccessoryDescription() {
        return accessoryDescription;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getSn() {
        return sn;
    }

    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }

    public String getAccessoryName() {
        return accessoryName;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public String toString() {
        return "Accessory(AccessoryId=" + this.getAccessoryId() + ",AccessorySalesType=" + this.getAccessorySalesType() + ",AccessoryType=" + this.getAccessoryType() + ",AccessorySuit=" + this.getAccessorySuit() + ",AccessoryDescription=" + this.getAccessoryDescription() + ",HostId=" + this.getHostId() + ",HostName=" + this.getHostName() + ",Sn=" + this.getSn() + ",AccessoryName=" + this.getAccessoryName() + ",AvailabilityZone=" + this.getAvailabilityZone() + ",Status=" + this.getStatus() + ",ProjectId=" + this.getProjectId() + ",CreateTime=" + this.getCreateTime() + ")";
    }

}
