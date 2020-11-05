package com.ksc.epc.model;


public class SecurityGroup {

    /**
     * 安全组ID
     */
    private String securityGroupId;

    public void setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
    }

    public String getSecurityGroupId() {
        return securityGroupId;
    }

    public String toString() {
        return "SecurityGroup(SecurityGroupId=" + this.getSecurityGroupId() + ")";
    }

}
