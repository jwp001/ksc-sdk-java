package com.ksc.epc.model;


public class Gpu {

    /**
     * GPU型号
     */
    private String model;
    /**
     * 显存大小，此参数新版本后展示为None
     */
    private String frequence;
    /**
     * CUDA核心数，此参数新版本后展示为None
     */
    private Integer count;
    /**
     * 计算能力，此参数新版本后展示为None
     */
    private Integer coreCount;
    /**
     * GPU的数量
     */
    private Integer gpuCount;

    public void setModel(String model) {
        this.model = model;
    }
    public String getModel() {
        return model;
    }
    public void setFrequence(String frequence) {
        this.frequence = frequence;
    }
    public String getFrequence() {
        return frequence;
    }
    public void setCount(Integer count) {
        this.count = count;
    }
    public Integer getCount() {
        return count;
    }
    public void setCoreCount(Integer coreCount) {
        this.coreCount = coreCount;
    }
    public Integer getCoreCount() {
        return coreCount;
    }
    public void setGpuCount(Integer gpuCount) {
        this.gpuCount = gpuCount;
    }
    public Integer getGpuCount() {
        return gpuCount;
    }

}
