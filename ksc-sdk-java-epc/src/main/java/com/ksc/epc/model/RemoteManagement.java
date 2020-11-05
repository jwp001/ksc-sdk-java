package com.ksc.epc.model;


public class RemoteManagement {

    /**
     * 带外管理ID
     */
    private String remoteManagementId;
    /**
     * 手机号
     */
    private String phoneNumber;
    /**
     * 名称
     */
    private String name;

    public void setRemoteManagementId(String remoteManagementId) {
        this.remoteManagementId = remoteManagementId;
    }

    public String getRemoteManagementId() {
        return remoteManagementId;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "RemoteManagement(RemoteManagementId=" + this.getRemoteManagementId() + ",PhoneNumber=" + this.getPhoneNumber() + ",Name=" + this.getName() + ")";
    }

}
