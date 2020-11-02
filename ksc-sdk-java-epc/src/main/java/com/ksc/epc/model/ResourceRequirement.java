package com.ksc.epc.model;


public class ResourceRequirement {

    /**
     * 资源需求ID
     */
    private String resourceRequirementId;
    /**
     * 主机机型
     */
    private String hostType;
    /**
     * 机房
     */
    private String region;
    /**
     * 可用区
     */
    private String availabilityZone;
    /**
     * 服务器需求数量
     */
    private Integer requirementCount;
    /**
     * 实例SN
     */
    private Integer reserveCount;
    /**
     * 远程管理密码
     */
    private String projectName;
    /**
     * 期望交付时间
     */
    private String usageDate;
    /**
     * 备注
     */
    private String description;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 工单进展
     */
    private String progress;

    public void setResourceRequirementId(String resourceRequirementId) {
        this.resourceRequirementId = resourceRequirementId;
    }
    public String getResourceRequirementId() {
        return resourceRequirementId;
    }
    public void setHostType(String hostType) {
        this.hostType = hostType;
    }
    public String getHostType() {
        return hostType;
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
    public void setRequirementCount(Integer requirementCount) {
        this.requirementCount = requirementCount;
    }
    public Integer getRequirementCount() {
        return requirementCount;
    }
    public void setReserveCount(Integer reserveCount) {
        this.reserveCount = reserveCount;
    }
    public Integer getReserveCount() {
        return reserveCount;
    }
    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }
    public String getProjectName() {
        return projectName;
    }
    public void setUsageDate(String usageDate) {
        this.usageDate = usageDate;
    }
    public String getUsageDate() {
        return usageDate;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getDescription() {
        return description;
    }
    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }
    public String getCreateTime() {
        return createTime;
    }
    public void setProgress(String progress) {
        this.progress = progress;
    }
    public String getProgress() {
        return progress;
    }

}
