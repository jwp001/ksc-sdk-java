package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ReinstallEpcRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ReinstallEpc.
 * </p>
 */
public class ReinstallEpcRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ReinstallEpcRequest> {

    /**
     * 实例ID
     */
    private String hostId;
    /**
     * 镜像ID
     */
    private String imageId;
    /**
     * 密钥ID
     */
    private String keyId;
    /**
     * 密码
     */
    private String password;
    /**
     * 网卡模式
     */
    private String networkInterfaceMode;
    /**
     * 安全组件类型
     */
    private String securityAgent;
    /**
     * 监控组件类型
     */
    private String cloudMonitorAgent;
    /**
     * 数据盘Raid级别
     */
    private String raid;
    /**
     * 实例名称
     */
    private String hostName;
    /**
     * 系统盘文件格式
     */
    private String systemFileType;
    /**
     * 数据盘文件格式
     */
    private String dataFileType;
    /**
     * 数据盘目录
     */
    private String dataDiskCatalogue;
    /**
     * 数据盘目录后缀属性
     */
    private String dataDiskCatalogueSuffix;
    /**
     * 对超线程的变更
     */
    private String hyperThreading;
    /**
     * NVME数据盘类型
     */
    private String nvmeDataFileType;
    /**
     * NVME数据盘目录
     */
    private String nvmeDataDiskCatalogue;
    /**
     * NVME数据盘目录后缀属性
     */
    private String nvmeDataDiskCatalogueSuffix;
    /**
     * 网卡bond的属性
     */
    private String bondAttribute;
    /**
     * 容器引擎组件类型
     */
    private String containerAgent;
    /**
     * KES组件类型
     */
    private String kesAgent;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ReinstallEpcRequest that = (ReinstallEpcRequest) o;
        if (hostId != null ? !hostId.equals(that.hostId) : that.hostId != null)
            return false;
        if (imageId != null ? !imageId.equals(that.imageId) : that.imageId != null)
            return false;
        if (keyId != null ? !keyId.equals(that.keyId) : that.keyId != null)
            return false;
        if (password != null ? !password.equals(that.password) : that.password != null)
            return false;
        if (networkInterfaceMode != null ? !networkInterfaceMode.equals(that.networkInterfaceMode) : that.networkInterfaceMode != null)
            return false;
        if (securityAgent != null ? !securityAgent.equals(that.securityAgent) : that.securityAgent != null)
            return false;
        if (cloudMonitorAgent != null ? !cloudMonitorAgent.equals(that.cloudMonitorAgent) : that.cloudMonitorAgent != null)
            return false;
        if (raid != null ? !raid.equals(that.raid) : that.raid != null)
            return false;
        if (hostName != null ? !hostName.equals(that.hostName) : that.hostName != null)
            return false;
        if (systemFileType != null ? !systemFileType.equals(that.systemFileType) : that.systemFileType != null)
            return false;
        if (dataFileType != null ? !dataFileType.equals(that.dataFileType) : that.dataFileType != null)
            return false;
        if (dataDiskCatalogue != null ? !dataDiskCatalogue.equals(that.dataDiskCatalogue) : that.dataDiskCatalogue != null)
            return false;
        if (dataDiskCatalogueSuffix != null ? !dataDiskCatalogueSuffix.equals(that.dataDiskCatalogueSuffix) : that.dataDiskCatalogueSuffix != null)
            return false;
        if (hyperThreading != null ? !hyperThreading.equals(that.hyperThreading) : that.hyperThreading != null)
            return false;
        if (nvmeDataFileType != null ? !nvmeDataFileType.equals(that.nvmeDataFileType) : that.nvmeDataFileType != null)
            return false;
        if (nvmeDataDiskCatalogue != null ? !nvmeDataDiskCatalogue.equals(that.nvmeDataDiskCatalogue) : that.nvmeDataDiskCatalogue != null)
            return false;
        if (nvmeDataDiskCatalogueSuffix != null ? !nvmeDataDiskCatalogueSuffix.equals(that.nvmeDataDiskCatalogueSuffix) : that.nvmeDataDiskCatalogueSuffix != null)
            return false;
        if (bondAttribute != null ? !bondAttribute.equals(that.bondAttribute) : that.bondAttribute != null)
            return false;
        if (containerAgent != null ? !containerAgent.equals(that.containerAgent) : that.containerAgent != null)
            return false;
        if (kesAgent != null ? !kesAgent.equals(that.kesAgent) : that.kesAgent != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (hostId != null ? hostId.hashCode() : 0);
        result = 31 * result + (imageId != null ? imageId.hashCode() : 0);
        result = 31 * result + (keyId != null ? keyId.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (networkInterfaceMode != null ? networkInterfaceMode.hashCode() : 0);
        result = 31 * result + (securityAgent != null ? securityAgent.hashCode() : 0);
        result = 31 * result + (cloudMonitorAgent != null ? cloudMonitorAgent.hashCode() : 0);
        result = 31 * result + (raid != null ? raid.hashCode() : 0);
        result = 31 * result + (hostName != null ? hostName.hashCode() : 0);
        result = 31 * result + (systemFileType != null ? systemFileType.hashCode() : 0);
        result = 31 * result + (dataFileType != null ? dataFileType.hashCode() : 0);
        result = 31 * result + (dataDiskCatalogue != null ? dataDiskCatalogue.hashCode() : 0);
        result = 31 * result + (dataDiskCatalogueSuffix != null ? dataDiskCatalogueSuffix.hashCode() : 0);
        result = 31 * result + (hyperThreading != null ? hyperThreading.hashCode() : 0);
        result = 31 * result + (nvmeDataFileType != null ? nvmeDataFileType.hashCode() : 0);
        result = 31 * result + (nvmeDataDiskCatalogue != null ? nvmeDataDiskCatalogue.hashCode() : 0);
        result = 31 * result + (nvmeDataDiskCatalogueSuffix != null ? nvmeDataDiskCatalogueSuffix.hashCode() : 0);
        result = 31 * result + (bondAttribute != null ? bondAttribute.hashCode() : 0);
        result = 31 * result + (containerAgent != null ? containerAgent.hashCode() : 0);
        result = 31 * result + (kesAgent != null ? kesAgent.hashCode() : 0);
        return result;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getHostId() {
        return hostId;
    }

    public void setImageId(String imageId) {
        this.imageId = imageId;
    }

    public String getImageId() {
        return imageId;
    }

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setNetworkInterfaceMode(String networkInterfaceMode) {
        this.networkInterfaceMode = networkInterfaceMode;
    }

    public String getNetworkInterfaceMode() {
        return networkInterfaceMode;
    }

    public void setSecurityAgent(String securityAgent) {
        this.securityAgent = securityAgent;
    }

    public String getSecurityAgent() {
        return securityAgent;
    }

    public void setCloudMonitorAgent(String cloudMonitorAgent) {
        this.cloudMonitorAgent = cloudMonitorAgent;
    }

    public String getCloudMonitorAgent() {
        return cloudMonitorAgent;
    }

    public void setRaid(String raid) {
        this.raid = raid;
    }

    public String getRaid() {
        return raid;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setSystemFileType(String systemFileType) {
        this.systemFileType = systemFileType;
    }

    public String getSystemFileType() {
        return systemFileType;
    }

    public void setDataFileType(String dataFileType) {
        this.dataFileType = dataFileType;
    }

    public String getDataFileType() {
        return dataFileType;
    }

    public void setDataDiskCatalogue(String dataDiskCatalogue) {
        this.dataDiskCatalogue = dataDiskCatalogue;
    }

    public String getDataDiskCatalogue() {
        return dataDiskCatalogue;
    }

    public void setDataDiskCatalogueSuffix(String dataDiskCatalogueSuffix) {
        this.dataDiskCatalogueSuffix = dataDiskCatalogueSuffix;
    }

    public String getDataDiskCatalogueSuffix() {
        return dataDiskCatalogueSuffix;
    }

    public void setHyperThreading(String hyperThreading) {
        this.hyperThreading = hyperThreading;
    }

    public String getHyperThreading() {
        return hyperThreading;
    }

    public void setNvmeDataFileType(String nvmeDataFileType) {
        this.nvmeDataFileType = nvmeDataFileType;
    }

    public String getNvmeDataFileType() {
        return nvmeDataFileType;
    }

    public void setNvmeDataDiskCatalogue(String nvmeDataDiskCatalogue) {
        this.nvmeDataDiskCatalogue = nvmeDataDiskCatalogue;
    }

    public String getNvmeDataDiskCatalogue() {
        return nvmeDataDiskCatalogue;
    }

    public void setNvmeDataDiskCatalogueSuffix(String nvmeDataDiskCatalogueSuffix) {
        this.nvmeDataDiskCatalogueSuffix = nvmeDataDiskCatalogueSuffix;
    }

    public String getNvmeDataDiskCatalogueSuffix() {
        return nvmeDataDiskCatalogueSuffix;
    }

    public void setBondAttribute(String bondAttribute) {
        this.bondAttribute = bondAttribute;
    }

    public String getBondAttribute() {
        return bondAttribute;
    }

    public void setContainerAgent(String containerAgent) {
        this.containerAgent = containerAgent;
    }

    public String getContainerAgent() {
        return containerAgent;
    }

    public void setKesAgent(String kesAgent) {
        this.kesAgent = kesAgent;
    }

    public String getKesAgent() {
        return kesAgent;
    }


    @Override
    public Request<ReinstallEpcRequest> getDryRunRequest() {
        Request<ReinstallEpcRequest> request = new ReinstallEpcRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ReinstallEpcRequest clone() {
        return (ReinstallEpcRequest) super.clone();
    }

    public String toString() {
        return "ReinstallEpcRequest(HostId=" + this.getHostId() + ",ImageId=" + this.getImageId() + ",KeyId=" + this.getKeyId() + ",Password=" + this.getPassword() + ",NetworkInterfaceMode=" + this.getNetworkInterfaceMode() + ",SecurityAgent=" + this.getSecurityAgent() + ",CloudMonitorAgent=" + this.getCloudMonitorAgent() + ",Raid=" + this.getRaid() + ",HostName=" + this.getHostName() + ",SystemFileType=" + this.getSystemFileType() + ",DataFileType=" + this.getDataFileType() + ",DataDiskCatalogue=" + this.getDataDiskCatalogue() + ",DataDiskCatalogueSuffix=" + this.getDataDiskCatalogueSuffix() + ",HyperThreading=" + this.getHyperThreading() + ",NvmeDataFileType=" + this.getNvmeDataFileType() + ",NvmeDataDiskCatalogue=" + this.getNvmeDataDiskCatalogue() + ",NvmeDataDiskCatalogueSuffix=" + this.getNvmeDataDiskCatalogueSuffix() + ",BondAttribute=" + this.getBondAttribute() + ",ContainerAgent=" + this.getContainerAgent() + ",KesAgent=" + this.getKesAgent() + ")";
    }
}

