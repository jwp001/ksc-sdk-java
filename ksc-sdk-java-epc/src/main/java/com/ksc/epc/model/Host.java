package com.ksc.epc.model;

import java.util.List;
        
public class Host {

    /**
     * 裸金属服务器的创建时间
     */
    private String createTime;
    /**
     * 裸金属服务器的ID
     */
    private String hostId;
    /**
     * 云物理主机机型
     */
    private String hostType;
    /**
     * 允许开启关闭超线程
     */
    private String allowModifyHyperThreading;
    /**
     * 裸金属服务器的名称
     */
    private String hostName;
    /**
     * 可释放的时间
     */
    private String releasableTime;
    /**
     * 上联交换机信息
     */
    private String torName;
    /**
     * 机柜信息
     */
    private String cabinetName;
    /**
     * 机架位
     */
    private String rackName;
    /**
     * 机架位的ID
     */
    private String rackId;
    /**
     * 云物理主机序列号
     */
    private String sn;
    /**
     * 托管机柜ID
     */
    private String cabinetId;
    /**
     * 可用区的名称
     */
    private String availabilityZone;
    /**
     * 数据盘Raid级别,枚举值为：Raid0, Raid10, Raid5, Raid1，单盘raid0
     */
    private String raid;
    /**
     * 镜像资源ID
     */
    private String imageId;
    /**
     * 用户密钥对的资源ID
     */
    private String keyId;
    /**
     * 网卡的模式
     */
    private String networkInterfaceMode;
    /**
     * 网卡bond的属性，只有在bond4的模式下才生效
     */
    private String bondAttribute;
    /**
     * 是否支持
     */
    private Boolean enableBond;
    /**
     * 安全组件类型
     */
    private String securityAgent;
    /**
     * 监控组件类型
     */
    private String cloudMonitorAgent;
    /**
     * 是否支持EBS
     */
    private String supportEbs;
    /**
     * 查询的云物理主机产品服务类型，租赁(lease)、客户托管（customer）
     */
    private String productType;
    /**
     * 操作系统名称
     */
    private String osName;
    /**
     * 内存大小，单位：G。
     */
    private String memory;
    /**
     * 云物理主机状态
     */
    private String hostStatus;
    /**
     * 容器ID
     */
    private String clusterId;
    /**
     * 是否支持容器
     */
    private Boolean enableContainer;
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
     * KES组件类型
     */
    private String kesAgent;
    /**
     * KPL组件类型
     */
    private String kplAgent;
    /**
     * KMR组件类型
     */
    private String kmrAgent;
    /**
     * 项目ID
     */
    private String projectId;
    /**
     * CPU信息
     */
    private Cpu cpu;
    /**
     * GPU信息
     */
    private Gpu gpu;
    /**
     * 磁盘信息
     */
    private List<Disk> diskSet;
    /**
     * 关联的网卡信息
     */
    private List<NetworkInterfaceAttribute> networkInterfaceAttributeSet;

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getHostId() {
        return hostId;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    public String getHostType() {
        return hostType;
    }

    public void setAllowModifyHyperThreading(String allowModifyHyperThreading) {
        this.allowModifyHyperThreading = allowModifyHyperThreading;
    }

    public String getAllowModifyHyperThreading() {
        return allowModifyHyperThreading;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public String getHostName() {
        return hostName;
    }

    public void setReleasableTime(String releasableTime) {
        this.releasableTime = releasableTime;
    }

    public String getReleasableTime() {
        return releasableTime;
    }

    public void setTorName(String torName) {
        this.torName = torName;
    }

    public String getTorName() {
        return torName;
    }

    public void setCabinetName(String cabinetName) {
        this.cabinetName = cabinetName;
    }

    public String getCabinetName() {
        return cabinetName;
    }

    public void setRackName(String rackName) {
        this.rackName = rackName;
    }

    public String getRackName() {
        return rackName;
    }

    public void setRackId(String rackId) {
        this.rackId = rackId;
    }

    public String getRackId() {
        return rackId;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    public String getSn() {
        return sn;
    }

    public void setCabinetId(String cabinetId) {
        this.cabinetId = cabinetId;
    }

    public String getCabinetId() {
        return cabinetId;
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

    public void setKeyId(String keyId) {
        this.keyId = keyId;
    }

    public String getKeyId() {
        return keyId;
    }

    public void setNetworkInterfaceMode(String networkInterfaceMode) {
        this.networkInterfaceMode = networkInterfaceMode;
    }

    public String getNetworkInterfaceMode() {
        return networkInterfaceMode;
    }

    public void setBondAttribute(String bondAttribute) {
        this.bondAttribute = bondAttribute;
    }

    public String getBondAttribute() {
        return bondAttribute;
    }

    public void setEnableBond(Boolean enableBond) {
        this.enableBond = enableBond;
    }

    public Boolean getEnableBond() {
        return enableBond;
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

    public void setSupportEbs(String supportEbs) {
        this.supportEbs = supportEbs;
    }

    public String getSupportEbs() {
        return supportEbs;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getProductType() {
        return productType;
    }

    public void setOsName(String osName) {
        this.osName = osName;
    }

    public String getOsName() {
        return osName;
    }

    public void setMemory(String memory) {
        this.memory = memory;
    }

    public String getMemory() {
        return memory;
    }

    public void setHostStatus(String hostStatus) {
        this.hostStatus = hostStatus;
    }

    public String getHostStatus() {
        return hostStatus;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public String getClusterId() {
        return clusterId;
    }

    public void setEnableContainer(Boolean enableContainer) {
        this.enableContainer = enableContainer;
    }

    public Boolean getEnableContainer() {
        return enableContainer;
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

    public void setKesAgent(String kesAgent) {
        this.kesAgent = kesAgent;
    }

    public String getKesAgent() {
        return kesAgent;
    }

    public void setKplAgent(String kplAgent) {
        this.kplAgent = kplAgent;
    }

    public String getKplAgent() {
        return kplAgent;
    }

    public void setKmrAgent(String kmrAgent) {
        this.kmrAgent = kmrAgent;
    }

    public String getKmrAgent() {
        return kmrAgent;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public String getProjectId() {
        return projectId;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setGpu(Gpu gpu) {
        this.gpu = gpu;
    }

    public Gpu getGpu() {
        return gpu;
    }

    public void addDiskSet(Disk... diskSet) {
        if (this.diskSet == null) {
            this.diskSet = new com.ksc.internal.SdkInternalList<Disk>();
        }
        for (Disk value : diskSet) {
            this.diskSet.add(value);
        }
    }

    public void setDiskSet(List<Disk> diskSet) {
        this.diskSet = new com.ksc.internal.SdkInternalList<Disk>(diskSet);
    }

    public  List<Disk> getDiskSet() {
        return diskSet;
    }

    public void addNetworkInterfaceAttributeSet(NetworkInterfaceAttribute... networkInterfaceAttributeSet) {
        if (this.networkInterfaceAttributeSet == null) {
            this.networkInterfaceAttributeSet = new com.ksc.internal.SdkInternalList<NetworkInterfaceAttribute>();
        }
        for (NetworkInterfaceAttribute value : networkInterfaceAttributeSet) {
            this.networkInterfaceAttributeSet.add(value);
        }
    }

    public void setNetworkInterfaceAttributeSet(List<NetworkInterfaceAttribute> networkInterfaceAttributeSet) {
        this.networkInterfaceAttributeSet = new com.ksc.internal.SdkInternalList<NetworkInterfaceAttribute>(networkInterfaceAttributeSet);
    }

    public  List<NetworkInterfaceAttribute> getNetworkInterfaceAttributeSet() {
        return networkInterfaceAttributeSet;
    }

    public String toString() {
        return "Host(CreateTime=" + this.getCreateTime() + ",HostId=" + this.getHostId() + ",HostType=" + this.getHostType() + ",AllowModifyHyperThreading=" + this.getAllowModifyHyperThreading() + ",HostName=" + this.getHostName() + ",ReleasableTime=" + this.getReleasableTime() + ",TorName=" + this.getTorName() + ",CabinetName=" + this.getCabinetName() + ",RackName=" + this.getRackName() + ",RackId=" + this.getRackId() + ",Sn=" + this.getSn() + ",CabinetId=" + this.getCabinetId() + ",AvailabilityZone=" + this.getAvailabilityZone() + ",Raid=" + this.getRaid() + ",ImageId=" + this.getImageId() + ",KeyId=" + this.getKeyId() + ",NetworkInterfaceMode=" + this.getNetworkInterfaceMode() + ",BondAttribute=" + this.getBondAttribute() + ",EnableBond=" + this.getEnableBond() + ",SecurityAgent=" + this.getSecurityAgent() + ",CloudMonitorAgent=" + this.getCloudMonitorAgent() + ",SupportEbs=" + this.getSupportEbs() + ",ProductType=" + this.getProductType() + ",OsName=" + this.getOsName() + ",Memory=" + this.getMemory() + ",HostStatus=" + this.getHostStatus() + ",ClusterId=" + this.getClusterId() + ",EnableContainer=" + this.getEnableContainer() + ",SystemFileType=" + this.getSystemFileType() + ",DataFileType=" + this.getDataFileType() + ",DataDiskCatalogue=" + this.getDataDiskCatalogue() + ",DataDiskCatalogueSuffix=" + this.getDataDiskCatalogueSuffix() + ",KesAgent=" + this.getKesAgent() + ",KplAgent=" + this.getKplAgent() + ",KmrAgent=" + this.getKmrAgent() + ",ProjectId=" + this.getProjectId() + ",Cpu=" + this.getCpu() + ",Gpu=" + this.getGpu() + ",DiskSet=" + this.getDiskSet() + ",NetworkInterfaceAttributeSet=" + this.getNetworkInterfaceAttributeSet() + ")";
    }

}
