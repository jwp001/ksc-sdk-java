package com.ksc.epc.model;


public class Stock {

    /**
     * 机型
     */
    private String hostType;
    /**
     * 数量
     */
    private Integer instanceCount;
    /**
     * 可用区
     */
    private String availabilityZone;

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }
    public String getHostType() {
        return hostType;
    }
    public void setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
    }
    public Integer getInstanceCount() {
        return instanceCount;
    }
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    public String getAvailabilityZone() {
        return availabilityZone;
    }

}
