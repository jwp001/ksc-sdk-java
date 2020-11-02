package com.ksc.epc.model;


public class Disk {

    /**
     * 磁盘类型
     */
    private String diskType;
    /**
     * 系统盘大小，单位G，仅在磁盘类型
     */
    private String systemDiskSpace;
    /**
     * Raid等级
     */
    private String raid;
    /**
     * 磁盘属性
     */
    private String diskAttribute;
    /**
     * 磁盘数量
     */
    private String diskCount;
    /**
     * 磁盘可用容量，单位G
     */
    private String space;

    public void setDiskType(String diskType) {
        this.diskType = diskType;
    }
    public String getDiskType() {
        return diskType;
    }
    public void setSystemDiskSpace(String systemDiskSpace) {
        this.systemDiskSpace = systemDiskSpace;
    }
    public String getSystemDiskSpace() {
        return systemDiskSpace;
    }
    public void setRaid(String raid) {
        this.raid = raid;
    }
    public String getRaid() {
        return raid;
    }
    public void setDiskAttribute(String diskAttribute) {
        this.diskAttribute = diskAttribute;
    }
    public String getDiskAttribute() {
        return diskAttribute;
    }
    public void setDiskCount(String diskCount) {
        this.diskCount = diskCount;
    }
    public String getDiskCount() {
        return diskCount;
    }
    public void setSpace(String space) {
        this.space = space;
    }
    public String getSpace() {
        return space;
    }

}
