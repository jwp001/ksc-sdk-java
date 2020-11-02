package com.ksc.epc.model;


public class Inspection {

    /**
     * 实例ID
     */
    private String hostId;
    /**
     * Sn
     */
    private String sn;
    /**
     * 机房
     */
    private String region;
    /**
     * 可用区
     */
    private String availabilityZone;
    /**
     * 告警状态
     */
    private String status;
    /**
     * 告警类型
     */
    private String alarmType;
    /**
     * 告警描述
     */
    private String alarmDescription;
    /**
     * 创建时间
     */
    private String createTime;

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }
    public String getHostId() {
        return hostId;
    }
    public void setSn(String sn) {
        this.sn = sn;
    }
    public String getSn() {
        return sn;
    }
    public void setRegion(String region) {
        this.region = region;
    }
    public String getRegion() {
        return region;
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
    public void setAlarmType(String alarmType) {
        this.alarmType = alarmType;
    }
    public String getAlarmType() {
        return alarmType;
    }
    public void setAlarmDescription(String alarmDescription) {
        this.alarmDescription = alarmDescription;
    }
    public String getAlarmDescription() {
        return alarmDescription;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getCreateTime() {
        return createTime;
    }

}
