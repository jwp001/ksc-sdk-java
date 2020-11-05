package com.ksc.epc.model;


public class EpcManagement {

    /**
     * 远程管理ID
     */
    private String epcManagementId;
    /**
     * 远程管理IP
     */
    private String epcManagementIp;
    /**
     * 远程管理用户名
     */
    private String epcManagementUserName;
    /**
     * 远程管理密码
     */
    private String password;
    /**
     * 实例名称
     */
    private String hostName;
    /**
     * 实例SN
     */
    private String sn;

    public void setEpcManagementId(String epcManagementId) {
        this.epcManagementId = epcManagementId;
    }

    public String getEpcManagementId() {
        return epcManagementId;
    }

    public void setEpcManagementIp(String epcManagementIp) {
        this.epcManagementIp = epcManagementIp;
    }

    public String getEpcManagementIp() {
        return epcManagementIp;
    }

    public void setEpcManagementUserName(String epcManagementUserName) {
        this.epcManagementUserName = epcManagementUserName;
    }

    public String getEpcManagementUserName() {
        return epcManagementUserName;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
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

    public String toString() {
        return "EpcManagement(EpcManagementId=" + this.getEpcManagementId() + ",EpcManagementIp=" + this.getEpcManagementIp() + ",EpcManagementUserName=" + this.getEpcManagementUserName() + ",Password=" + this.getPassword() + ",HostName=" + this.getHostName() + ",Sn=" + this.getSn() + ")";
    }

}
