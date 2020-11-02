package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.CreateRemoteManagementRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateRemoteManagement.
 * </p>
 */
public class CreateRemoteManagementRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateRemoteManagementRequest> {

    /**
     * 手机号
     */
    private String phoneNumber;
    /**
     * pin码
     */
    private String pin;
    /**
     * 名称
     */
    private String name;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateRemoteManagementRequest that = (CreateRemoteManagementRequest) o;
        if (phoneNumber != null ? !phoneNumber.equals(that.phoneNumber) : that.phoneNumber != null)
            return false;
        if (pin != null ? !pin.equals(that.pin) : that.pin != null)
            return false;
        if (name != null ? !name.equals(that.name) : that.name != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (phoneNumber != null ? phoneNumber.hashCode() : 0);
        result = 31 * result + (pin != null ? pin.hashCode() : 0);
        result = 31 * result + (name != null ? name.hashCode() : 0);
        return result;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public void setPin(String pin) {
        this.pin = pin;
    }
    public String getPin() {
        return pin;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    @Override
    public Request<CreateRemoteManagementRequest> getDryRunRequest() {
        Request<CreateRemoteManagementRequest> request = new CreateRemoteManagementRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateRemoteManagementRequest clone() {
        return (CreateRemoteManagementRequest) super.clone();
    }
}

