package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ResetPasswordRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ResetPassword.
 * </p>
 */
public class ResetPasswordRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ResetPasswordRequest> {

    /**
     * 密码
     */
    private String password;
    /**
     * 实例ID
     */
    private String hostId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ResetPasswordRequest that = (ResetPasswordRequest) o;
        if (password != null ? !password.equals(that.password) : that.password != null)
            return false;
        if (hostId != null ? !hostId.equals(that.hostId) : that.hostId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (password != null ? password.hashCode() : 0);
        result = 31 * result + (hostId != null ? hostId.hashCode() : 0);
        return result;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public String getHostId() {
        return hostId;
    }


    @Override
    public Request<ResetPasswordRequest> getDryRunRequest() {
        Request<ResetPasswordRequest> request = new ResetPasswordRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ResetPasswordRequest clone() {
        return (ResetPasswordRequest) super.clone();
    }

    public String toString() {
        return "ResetPasswordRequest(Password=" + this.getPassword() + ",HostId=" + this.getHostId() + ")";
    }
}

