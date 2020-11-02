package com.ksc.epc.model;


public class Cabinet {

    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 机柜名称
     */
    private String cabinetName;
    /**
     * 机柜类型
     */
    private String cabinetType;
    /**
     * 机柜ID
     */
    private String cabinetId;
    /**
     * 项目ID
     */
    private String projectId;

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getCreateTime() {
        return createTime;
    }
    public void setCabinetName(String cabinetName) {
        this.cabinetName = cabinetName;
    }
    public String getCabinetName() {
        return cabinetName;
    }
    public void setCabinetType(String cabinetType) {
        this.cabinetType = cabinetType;
    }
    public String getCabinetType() {
        return cabinetType;
    }
    public void setCabinetId(String cabinetId) {
        this.cabinetId = cabinetId;
    }
    public String getCabinetId() {
        return cabinetId;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    public String getProjectId() {
        return projectId;
    }

}
