package com.ksc.epc.model;


public class PhysicalDiskDevice {

    /**
     * 硬盘属性
     */
    private String diskAttribute;
    /**
     * 数量
     */
    private String diskCount;
    /**
     * 空间
     */
    private String space;

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

    public String toString() {
        return "PhysicalDiskDevice(DiskAttribute=" + this.getDiskAttribute() + ",DiskCount=" + this.getDiskCount() + ",Space=" + this.getSpace() + ")";
    }

}
