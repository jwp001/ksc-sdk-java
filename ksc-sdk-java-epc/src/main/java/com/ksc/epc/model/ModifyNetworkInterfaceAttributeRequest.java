package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ModifyNetworkInterfaceAttributeRequestMarshaller;
import java.util.List;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyNetworkInterfaceAttribute.
 * </p>
 */
public class ModifyNetworkInterfaceAttributeRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyNetworkInterfaceAttributeRequest> {

    /**
     * 安全组ID
     */
    private com.ksc.internal.SdkInternalList<String> securityGroupIds;
    /**
     * 网卡ID
     */
    private String networkInterfaceId;
    /**
     * 子网ID
     */
    private String subnetId;
    /**
     * IP地址
     */
    private String ipAddress;
    /**
     * 实例ID
     */
    private String hostId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyNetworkInterfaceAttributeRequest that = (ModifyNetworkInterfaceAttributeRequest) o;
        if (securityGroupIds != null ? !securityGroupIds.equals(that.securityGroupIds) : that.securityGroupIds != null)
            return false;
        if (networkInterfaceId != null ? !networkInterfaceId.equals(that.networkInterfaceId) : that.networkInterfaceId != null)
            return false;
        if (subnetId != null ? !subnetId.equals(that.subnetId) : that.subnetId != null)
            return false;
        if (ipAddress != null ? !ipAddress.equals(that.ipAddress) : that.ipAddress != null)
            return false;
        if (hostId != null ? !hostId.equals(that.hostId) : that.hostId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (securityGroupIds != null ? securityGroupIds.hashCode() : 0);
        result = 31 * result + (networkInterfaceId != null ? networkInterfaceId.hashCode() : 0);
        result = 31 * result + (subnetId != null ? subnetId.hashCode() : 0);
        result = 31 * result + (ipAddress != null ? ipAddress.hashCode() : 0);
        result = 31 * result + (hostId != null ? hostId.hashCode() : 0);
        return result;
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

    public void setNetworkInterfaceId(String networkInterfaceId) {
        this.networkInterfaceId = networkInterfaceId;
    }

    public String getNetworkInterfaceId() {
        return networkInterfaceId;
    }

    public void setSubnetId(String subnetId) {
        this.subnetId = subnetId;
    }

    public String getSubnetId() {
        return subnetId;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public String getIpAddress() {
        return ipAddress;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getHostId() {
        return hostId;
    }


    @Override
    public Request<ModifyNetworkInterfaceAttributeRequest> getDryRunRequest() {
        Request<ModifyNetworkInterfaceAttributeRequest> request = new ModifyNetworkInterfaceAttributeRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyNetworkInterfaceAttributeRequest clone() {
        return (ModifyNetworkInterfaceAttributeRequest) super.clone();
    }

    public String toString() {
        return "ModifyNetworkInterfaceAttributeRequest(SecurityGroupIds=" + this.getSecurityGroupIds() + ",NetworkInterfaceId=" + this.getNetworkInterfaceId() + ",SubnetId=" + this.getSubnetId() + ",IpAddress=" + this.getIpAddress() + ",HostId=" + this.getHostId() + ")";
    }
}

