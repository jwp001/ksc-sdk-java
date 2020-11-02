package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.CreateEpcRequestMarshaller;
import java.util.List;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateEpc.
 * </p>
 */
public class CreateEpcRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateEpcRequest> {

    /**
     * 机型
     */
    private String hostType;
    /**
     * 可用区
     */
    private String availabilityZone;
    /**
     * 数据盘Raid级别
     */
    private String raid;
    /**
     * 镜像ID
     */
    private String imageId;
    /**
     * 网卡模式
     */
    private String networkInterfaceMode;
    /**
     * 主网卡的子网ID
     */
    private String subnetId;
    /**
     * 网卡的内网IP
     */
    private String privateIpAddress;
    /**
     * 网卡的安全组ID
     */
    private com.ksc.internal.SdkInternalList<String> securityGroupIds;
    /**
     * 网卡的DNS1
     */
    private String dNS1;
    /**
     * 网卡的DNS2
     */
    private String dNS2;
    /**
     * 密钥ID
     */
    private String keyId;
    /**
     * 实例名称
     */
    private String hostName;
    /**
     * 计费方式
     */
    private String chargeType;
    /**
     * 购买时长
     */
    private Integer purchaseTime;
    /**
     * 密码
     */
    private String password;
    /**
     * 安全组件类型
     */
    private String securityAgent;
    /**
     * 监控组件类型
     */
    private String cloudMonitorAgent;
    /**
     * 从网卡的子网ID
     */
    private String extensionSubnetId;
    /**
     * 从网卡的内网IP
     */
    private String extensionPrivateIpAddress;
    /**
     * 从网卡的安全组ID
     */
    private com.ksc.internal.SdkInternalList<String> extensionSecurityGroupIds;
    /**
     * 从网卡的DNS1
     */
    private String extensionDNS1;
    /**
     * 从网卡的DNS2
     */
    private String extensionDNS2;
    /**
     * 项目ID
     */
    private String projectId;
    /**
     * 弹性IP的带宽
     */
    private Integer addressBandWidth;
    /**
     * 弹性IP的链路类型的ID
     */
    private String lineId;
    /**
     * 弹性IP的计费类型
     */
    private String addressChargeType;
    /**
     * 购买时长
     */
    private Integer addressPurchaseTime;
    /**
     * 弹性IP项目的ID
     */
    private String addressProjectId;
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

        CreateEpcRequest that = (CreateEpcRequest) o;
        if (hostType != null ? !hostType.equals(that.hostType) : that.hostType != null)
            return false;
        if (availabilityZone != null ? !availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null)
            return false;
        if (raid != null ? !raid.equals(that.raid) : that.raid != null)
            return false;
        if (imageId != null ? !imageId.equals(that.imageId) : that.imageId != null)
            return false;
        if (networkInterfaceMode != null ? !networkInterfaceMode.equals(that.networkInterfaceMode) : that.networkInterfaceMode != null)
            return false;
        if (subnetId != null ? !subnetId.equals(that.subnetId) : that.subnetId != null)
            return false;
        if (privateIpAddress != null ? !privateIpAddress.equals(that.privateIpAddress) : that.privateIpAddress != null)
            return false;
        if (securityGroupIds != null ? !securityGroupIds.equals(that.securityGroupIds) : that.securityGroupIds != null)
            return false;
        if (dNS1 != null ? !dNS1.equals(that.dNS1) : that.dNS1 != null)
            return false;
        if (dNS2 != null ? !dNS2.equals(that.dNS2) : that.dNS2 != null)
            return false;
        if (keyId != null ? !keyId.equals(that.keyId) : that.keyId != null)
            return false;
        if (hostName != null ? !hostName.equals(that.hostName) : that.hostName != null)
            return false;
        if (chargeType != null ? !chargeType.equals(that.chargeType) : that.chargeType != null)
            return false;
        if (purchaseTime != null ? !purchaseTime.equals(that.purchaseTime) : that.purchaseTime != null)
            return false;
        if (password != null ? !password.equals(that.password) : that.password != null)
            return false;
        if (securityAgent != null ? !securityAgent.equals(that.securityAgent) : that.securityAgent != null)
            return false;
        if (cloudMonitorAgent != null ? !cloudMonitorAgent.equals(that.cloudMonitorAgent) : that.cloudMonitorAgent != null)
            return false;
        if (extensionSubnetId != null ? !extensionSubnetId.equals(that.extensionSubnetId) : that.extensionSubnetId != null)
            return false;
        if (extensionPrivateIpAddress != null ? !extensionPrivateIpAddress.equals(that.extensionPrivateIpAddress) : that.extensionPrivateIpAddress != null)
            return false;
        if (extensionSecurityGroupIds != null ? !extensionSecurityGroupIds.equals(that.extensionSecurityGroupIds) : that.extensionSecurityGroupIds != null)
            return false;
        if (extensionDNS1 != null ? !extensionDNS1.equals(that.extensionDNS1) : that.extensionDNS1 != null)
            return false;
        if (extensionDNS2 != null ? !extensionDNS2.equals(that.extensionDNS2) : that.extensionDNS2 != null)
            return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null)
            return false;
        if (addressBandWidth != null ? !addressBandWidth.equals(that.addressBandWidth) : that.addressBandWidth != null)
            return false;
        if (lineId != null ? !lineId.equals(that.lineId) : that.lineId != null)
            return false;
        if (addressChargeType != null ? !addressChargeType.equals(that.addressChargeType) : that.addressChargeType != null)
            return false;
        if (addressPurchaseTime != null ? !addressPurchaseTime.equals(that.addressPurchaseTime) : that.addressPurchaseTime != null)
            return false;
        if (addressProjectId != null ? !addressProjectId.equals(that.addressProjectId) : that.addressProjectId != null)
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
        result = 31 * result + (hostType != null ? hostType.hashCode() : 0);
        result = 31 * result + (availabilityZone != null ? availabilityZone.hashCode() : 0);
        result = 31 * result + (raid != null ? raid.hashCode() : 0);
        result = 31 * result + (imageId != null ? imageId.hashCode() : 0);
        result = 31 * result + (networkInterfaceMode != null ? networkInterfaceMode.hashCode() : 0);
        result = 31 * result + (subnetId != null ? subnetId.hashCode() : 0);
        result = 31 * result + (privateIpAddress != null ? privateIpAddress.hashCode() : 0);
        result = 31 * result + (securityGroupIds != null ? securityGroupIds.hashCode() : 0);
        result = 31 * result + (dNS1 != null ? dNS1.hashCode() : 0);
        result = 31 * result + (dNS2 != null ? dNS2.hashCode() : 0);
        result = 31 * result + (keyId != null ? keyId.hashCode() : 0);
        result = 31 * result + (hostName != null ? hostName.hashCode() : 0);
        result = 31 * result + (chargeType != null ? chargeType.hashCode() : 0);
        result = 31 * result + (purchaseTime != null ? purchaseTime.hashCode() : 0);
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (securityAgent != null ? securityAgent.hashCode() : 0);
        result = 31 * result + (cloudMonitorAgent != null ? cloudMonitorAgent.hashCode() : 0);
        result = 31 * result + (extensionSubnetId != null ? extensionSubnetId.hashCode() : 0);
        result = 31 * result + (extensionPrivateIpAddress != null ? extensionPrivateIpAddress.hashCode() : 0);
        result = 31 * result + (extensionSecurityGroupIds != null ? extensionSecurityGroupIds.hashCode() : 0);
        result = 31 * result + (extensionDNS1 != null ? extensionDNS1.hashCode() : 0);
        result = 31 * result + (extensionDNS2 != null ? extensionDNS2.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        result = 31 * result + (addressBandWidth != null ? addressBandWidth.hashCode() : 0);
        result = 31 * result + (lineId != null ? lineId.hashCode() : 0);
        result = 31 * result + (addressChargeType != null ? addressChargeType.hashCode() : 0);
        result = 31 * result + (addressPurchaseTime != null ? addressPurchaseTime.hashCode() : 0);
        result = 31 * result + (addressProjectId != null ? addressProjectId.hashCode() : 0);
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

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }
    public String getHostType() {
        return hostType;
    }
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    public void setRaid(String raid) {
        this.raid = raid;
    }
    public String getRaid() {
        return raid;
    }
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    public String getImageId() {
        return imageId;
    }
    public void setNetworkInterfaceMode(String networkInterfaceMode) {
        this.networkInterfaceMode = networkInterfaceMode;
    }
    public String getNetworkInterfaceMode() {
        return networkInterfaceMode;
    }
    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }
    public String getSubnetId() {
        return subnetId;
    }
    public void setPrivateIpAddress(String privateIpAddress) {
        this.privateIpAddress = privateIpAddress;
    }
    public String getPrivateIpAddress() {
        return privateIpAddress;
    }
    public void addSecurityGroupIds(String... securityGroupIds){
        if (this.securityGroupIds == null) {
            this.securityGroupIds = new com.ksc.internal.SdkInternalList<String>();
        }
        for(String value : securityGroupIds){
            this.securityGroupIds.add(value);
        }
    }
    public void setSecurityGroupIds(List<String> securityGroupIds) {
        this.securityGroupIds = new com.ksc.internal.SdkInternalList<String>(securityGroupIds);
    }
    public  List<String> getSecurityGroupIds() {
        return securityGroupIds;
    }
    public void setDNS1(String dNS1) {
        this.dNS1 = dNS1;
    }
    public String getDNS1() {
        return dNS1;
    }
    public void setDNS2(String dNS2) {
        this.dNS2 = dNS2;
    }
    public String getDNS2() {
        return dNS2;
    }
    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }
    public String getKeyId() {
        return keyId;
    }
    public void setHostName(String hostName) {
        this.hostName = hostName;
    }
    public String getHostName() {
        return hostName;
    }
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }
    public String getChargeType() {
        return chargeType;
    }
    public void setPurchaseTime(Integer purchaseTime) {
        this.purchaseTime = purchaseTime;
    }
    public Integer getPurchaseTime() {
        return purchaseTime;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getPassword() {
        return password;
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
    public void setExtensionSubnetId(String extensionSubnetId) {
        this.extensionSubnetId = extensionSubnetId;
    }
    public String getExtensionSubnetId() {
        return extensionSubnetId;
    }
    public void setExtensionPrivateIpAddress(String extensionPrivateIpAddress) {
        this.extensionPrivateIpAddress = extensionPrivateIpAddress;
    }
    public String getExtensionPrivateIpAddress() {
        return extensionPrivateIpAddress;
    }
    public void addExtensionSecurityGroupIds(String... extensionSecurityGroupIds){
        if (this.extensionSecurityGroupIds == null) {
            this.extensionSecurityGroupIds = new com.ksc.internal.SdkInternalList<String>();
        }
        for(String value : extensionSecurityGroupIds){
            this.extensionSecurityGroupIds.add(value);
        }
    }
    public void setExtensionSecurityGroupIds(List<String> extensionSecurityGroupIds) {
        this.extensionSecurityGroupIds = new com.ksc.internal.SdkInternalList<String>(extensionSecurityGroupIds);
    }
    public  List<String> getExtensionSecurityGroupIds() {
        return extensionSecurityGroupIds;
    }
    public void setExtensionDNS1(String extensionDNS1) {
        this.extensionDNS1 = extensionDNS1;
    }
    public String getExtensionDNS1() {
        return extensionDNS1;
    }
    public void setExtensionDNS2(String extensionDNS2) {
        this.extensionDNS2 = extensionDNS2;
    }
    public String getExtensionDNS2() {
        return extensionDNS2;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    public String getProjectId() {
        return projectId;
    }
    public void setAddressBandWidth(Integer addressBandWidth) {
        this.addressBandWidth = addressBandWidth;
    }
    public Integer getAddressBandWidth() {
        return addressBandWidth;
    }
    public void setLineId(String lineId) {
        this.lineId = lineId;
    }
    public String getLineId() {
        return lineId;
    }
    public void setAddressChargeType(String addressChargeType) {
        this.addressChargeType = addressChargeType;
    }
    public String getAddressChargeType() {
        return addressChargeType;
    }
    public void setAddressPurchaseTime(Integer addressPurchaseTime) {
        this.addressPurchaseTime = addressPurchaseTime;
    }
    public Integer getAddressPurchaseTime() {
        return addressPurchaseTime;
    }
    public void setAddressProjectId(String addressProjectId) {
        this.addressProjectId = addressProjectId;
    }
    public String getAddressProjectId() {
        return addressProjectId;
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
    public Request<CreateEpcRequest> getDryRunRequest() {
        Request<CreateEpcRequest> request = new CreateEpcRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateEpcRequest clone() {
        return (CreateEpcRequest) super.clone();
    }
}

