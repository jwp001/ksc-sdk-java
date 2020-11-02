package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ModifyHyperThreadingRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyHyperThreading.
 * </p>
 */
public class ModifyHyperThreadingRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyHyperThreadingRequest> {

    /**
     * 超线程状态
     */
    private String hyperThreadingStatus;
    /**
     * 实例ID
     */
    private String hostId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyHyperThreadingRequest that = (ModifyHyperThreadingRequest) o;
        if (hyperThreadingStatus != null ? !hyperThreadingStatus.equals(that.hyperThreadingStatus) : that.hyperThreadingStatus != null)
            return false;
        if (hostId != null ? !hostId.equals(that.hostId) : that.hostId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (hyperThreadingStatus != null ? hyperThreadingStatus.hashCode() : 0);
        result = 31 * result + (hostId != null ? hostId.hashCode() : 0);
        return result;
    }

    public void setHyperThreadingStatus(String hyperThreadingStatus) {
        this.hyperThreadingStatus = hyperThreadingStatus;
    }
    public String getHyperThreadingStatus() {
        return hyperThreadingStatus;
    }
    public void setHostId(String hostId) {
        this.hostId = hostId;
    }
    public String getHostId() {
        return hostId;
    }

    @Override
    public Request<ModifyHyperThreadingRequest> getDryRunRequest() {
        Request<ModifyHyperThreadingRequest> request = new ModifyHyperThreadingRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyHyperThreadingRequest clone() {
        return (ModifyHyperThreadingRequest) super.clone();
    }
}

