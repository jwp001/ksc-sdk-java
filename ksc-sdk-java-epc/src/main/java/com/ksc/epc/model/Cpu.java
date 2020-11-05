package com.ksc.epc.model;


public class Cpu {

    /**
     * CPU型号
     */
    private String model;
    /**
     * CPU主频，此参数新版本后展示为None
     */
    private String frequence;
    /**
     * CPU个数
     */
    private Integer count;
    /**
     * CPU核数
     */
    private Integer coreCount;

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

    public String toString() {
        return "Cpu(Model=" + this.getModel() + ",Frequence=" + this.getFrequence() + ",Count=" + this.getCount() + ",CoreCount=" + this.getCoreCount() + ")";
    }

}
