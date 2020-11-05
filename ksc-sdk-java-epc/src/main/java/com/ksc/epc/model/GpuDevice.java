package com.ksc.epc.model;


public class GpuDevice {

    /**
     * GPU型号
     */
    private String gpuModel;
    /**
     * 数量
     */
    private String gpuCount;

    public void setGpuModel(String gpuModel) {
        this.gpuModel = gpuModel;
    }

    public String getGpuModel() {
        return gpuModel;
    }

    public void setGpuCount(String gpuCount) {
        this.gpuCount = gpuCount;
    }

    public String getGpuCount() {
        return gpuCount;
    }

    public String toString() {
        return "GpuDevice(GpuModel=" + this.getGpuModel() + ",GpuCount=" + this.getGpuCount() + ")";
    }

}
