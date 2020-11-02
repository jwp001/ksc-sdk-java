package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ModifyRemoteManagementRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyRemoteManagement.
 * </p>
 */
public class ModifyRemoteManagementRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyRemoteManagementRequest> {

    /**
     * 带外管理ID
     */
    private String remoteManagementId;
    /**
     * 原手机号
     */
    private String dynamicCode;
    /**
     * 新手机号
     */
    private String newPhoneNumber;
    /**
     * 原PIN码
     */
    private String pin;
    /**
     * 新的PIN码
     */
    private String newPin;
    /**
     * 名称
     */
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyRemoteManagementRequest that = (ModifyRemoteManagementRequest) o;
        if (remoteManagementId != null ? !remoteManagementId.equals(that.remoteManagementId) : that.remoteManagementId != null)
            return false;
        if (dynamicCode != null ? !dynamicCode.equals(that.dynamicCode) : that.dynamicCode != null)
            return false;
        if (newPhoneNumber != null ? !newPhoneNumber.equals(that.newPhoneNumber) : that.newPhoneNumber != null)
            return false;
        if (pin != null ? !pin.equals(that.pin) : that.pin != null)
            return false;
        if (newPin != null ? !newPin.equals(that.newPin) : that.newPin != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (remoteManagementId != null ? remoteManagementId.hashCode() : 0);
        result = 31 * result + (dynamicCode != null ? dynamicCode.hashCode() : 0);
        result = 31 * result + (newPhoneNumber != null ? newPhoneNumber.hashCode() : 0);
        result = 31 * result + (pin != null ? pin.hashCode() : 0);
        result = 31 * result + (newPin != null ? newPin.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public void setRemoteManagementId(String remoteManagementId) {
        this.remoteManagementId = remoteManagementId;
    }
    public String getRemoteManagementId() {
        return remoteManagementId;
    }
    public void setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
    }
    public String getDynamicCode() {
        return dynamicCode;
    }
    public void setNewPhoneNumber(String newPhoneNumber) {
        this.newPhoneNumber = newPhoneNumber;
    }
    public String getNewPhoneNumber() {
        return newPhoneNumber;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    public String getPin() {
        return pin;
    }
    public void setNewPin(String newPin) {
        this.newPin = newPin;
    }
    public String getNewPin() {
        return newPin;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public Request<ModifyRemoteManagementRequest> getDryRunRequest() {
        Request<ModifyRemoteManagementRequest> request = new ModifyRemoteManagementRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyRemoteManagementRequest clone() {
        return (ModifyRemoteManagementRequest) super.clone();
    }
}

