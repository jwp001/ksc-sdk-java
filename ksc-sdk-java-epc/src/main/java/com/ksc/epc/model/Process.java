package com.ksc.epc.model;

import java.util.List;
        
public class Process {

    /**
     * 问题属性
     */
    private String attribute;
    /**
     * 操作流程ID
     */
    private String operationProcessId;
    /**
     * 工单ID
     */
    private String processId;
    /**
     * 状态
     */
    private String status;
    /**
     * 实例SN
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
     * 确认是否可以重启
     */
    private String confirm;
    /**
     * 操作类型
     */
    private String type;
    /**
     * 标题
     */
    private String title;
    /**
     * 服务器数量
     */
    private Integer machineCount;
    /**
     * 内容
     */
    private String content;
    /**
     * 创建时间
     */
    private String createTime;
    /**
     * 回复信息
     */
    private List<CommunicationContent> communicationContentSet;

    public void setAttribute(String attribute) {
        this.attribute = attribute;
    }

    public String getAttribute() {
        return attribute;
    }

    public void setOperationProcessId(String operationProcessId) {
        this.operationProcessId = operationProcessId;
    }

    public String getOperationProcessId() {
        return operationProcessId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public String getProcessId() {
        return processId;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getStatus() {
        return status;
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

    public void setConfirm(String confirm) {
        this.confirm = confirm;
    }

    public String getConfirm() {
        return confirm;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setMachineCount(Integer machineCount) {
        this.machineCount = machineCount;
    }

    public Integer getMachineCount() {
        return machineCount;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void addCommunicationContentSet(CommunicationContent... communicationContentSet) {
        if (this.communicationContentSet == null) {
            this.communicationContentSet = new com.ksc.internal.SdkInternalList<CommunicationContent>();
        }
        for (CommunicationContent value : communicationContentSet) {
            this.communicationContentSet.add(value);
        }
    }

    public void setCommunicationContentSet(List<CommunicationContent> communicationContentSet) {
        this.communicationContentSet = new com.ksc.internal.SdkInternalList<CommunicationContent>(communicationContentSet);
    }

    public  List<CommunicationContent> getCommunicationContentSet() {
        return communicationContentSet;
    }

    public String toString() {
        return "Process(Attribute=" + this.getAttribute() + ",OperationProcessId=" + this.getOperationProcessId() + ",ProcessId=" + this.getProcessId() + ",Status=" + this.getStatus() + ",Sn=" + this.getSn() + ",Region=" + this.getRegion() + ",AvailabilityZone=" + this.getAvailabilityZone() + ",Confirm=" + this.getConfirm() + ",Type=" + this.getType() + ",Title=" + this.getTitle() + ",MachineCount=" + this.getMachineCount() + ",Content=" + this.getContent() + ",CreateTime=" + this.getCreateTime() + ",CommunicationContentSet=" + this.getCommunicationContentSet() + ")";
    }

}
