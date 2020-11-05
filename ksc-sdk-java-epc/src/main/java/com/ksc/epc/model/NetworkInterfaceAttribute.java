package com.ksc.epc.model;

import java.util.List;
        
public class NetworkInterfaceAttribute {

    /**
     * 网卡的ID
     */
    private String networkInterfaceId;
    /**
     * 网卡的类型，主网卡(primary)、从网卡(extension)
     */
    private String networkInterfaceType;
    /**
     * 云物理主机的子网ID
     */
    private String subnetId;
    /**
     * 服务器的网卡在VPC中的IP
     */
    private String privateIpAddress;
    /**
     * DNS 1的值，当通过该接口进行修改网络配置时不填写此参数，保持与之前不变。
     */
    private String dNS1;
    /**
     * DNS 2的值，当通过该接口进行修改网络配置时不填写此参数，保持与之前不变。
     */
    private String dNS2;
    /**
     * 云物理服务器MAC
     */
    private String mac;
    /**
     * 安全组的信息
     */
    private List<SecurityGroup> securityGroupSet;

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    public void setNetworkInterfaceType(String networkInterfaceType) {
        this.networkInterfaceType = networkInterfaceType;
    }

    public String getNetworkInterfaceType() {
        return networkInterfaceType;
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

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getMac() {
        return mac;
    }

    public void addSecurityGroupSet(SecurityGroup... securityGroupSet) {
        if (this.securityGroupSet == null) {
            this.securityGroupSet = new com.ksc.internal.SdkInternalList<SecurityGroup>();
        }
        for (SecurityGroup value : securityGroupSet) {
            this.securityGroupSet.add(value);
        }
    }

    public void setSecurityGroupSet(List<SecurityGroup> securityGroupSet) {
        this.securityGroupSet = new com.ksc.internal.SdkInternalList<SecurityGroup>(securityGroupSet);
    }

    public  List<SecurityGroup> getSecurityGroupSet() {
        return securityGroupSet;
    }

    public String toString() {
        return "NetworkInterfaceAttribute(NetworkInterfaceId=" + this.getNetworkInterfaceId() + ",NetworkInterfaceType=" + this.getNetworkInterfaceType() + ",SubnetId=" + this.getSubnetId() + ",PrivateIpAddress=" + this.getPrivateIpAddress() + ",DNS1=" + this.getDNS1() + ",DNS2=" + this.getDNS2() + ",Mac=" + this.getMac() + ",SecurityGroupSet=" + this.getSecurityGroupSet() + ")";
    }

}
