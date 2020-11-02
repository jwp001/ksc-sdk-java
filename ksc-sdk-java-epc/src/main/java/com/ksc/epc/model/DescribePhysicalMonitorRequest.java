package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DescribePhysicalMonitorRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DescribePhysicalMonitor.
 * </p>
 */
public class DescribePhysicalMonitorRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DescribePhysicalMonitorRequest> {

    /**
     * 实例ID
     */
    private String hostId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DescribePhysicalMonitorRequest that = (DescribePhysicalMonitorRequest) o;
        if (hostId != null ? !hostId.equals(that.hostId) : that.hostId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (hostId != null ? hostId.hashCode() : 0);
        return result;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }
    public String getHostId() {
        return hostId;
    }

    @Override
    public Request<DescribePhysicalMonitorRequest> getDryRunRequest() {
        Request<DescribePhysicalMonitorRequest> request = new DescribePhysicalMonitorRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DescribePhysicalMonitorRequest clone() {
        return (DescribePhysicalMonitorRequest) super.clone();
    }
}

