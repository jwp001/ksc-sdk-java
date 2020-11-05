package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ReplyResourceRequirementRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ReplyResourceRequirement.
 * </p>
 */
public class ReplyResourceRequirementRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ReplyResourceRequirementRequest> {

    /**
     * 资源需求的ID
     */
    private String resourceRequirementId;
    /**
     * 备注
     */
    private String remarks;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ReplyResourceRequirementRequest that = (ReplyResourceRequirementRequest) o;
        if (resourceRequirementId != null ? !resourceRequirementId.equals(that.resourceRequirementId) : that.resourceRequirementId != null)
            return false;
        if (remarks != null ? !remarks.equals(that.remarks) : that.remarks != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (resourceRequirementId != null ? resourceRequirementId.hashCode() : 0);
        result = 31 * result + (remarks != null ? remarks.hashCode() : 0);
        return result;
    }

    public void setResourceRequirementId(String resourceRequirementId) {
        this.resourceRequirementId = resourceRequirementId;
    }

    public String getResourceRequirementId() {
        return resourceRequirementId;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public String getRemarks() {
        return remarks;
    }


    @Override
    public Request<ReplyResourceRequirementRequest> getDryRunRequest() {
        Request<ReplyResourceRequirementRequest> request = new ReplyResourceRequirementRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ReplyResourceRequirementRequest clone() {
        return (ReplyResourceRequirementRequest) super.clone();
    }

    public String toString() {
        return "ReplyResourceRequirementRequest(ResourceRequirementId=" + this.getResourceRequirementId() + ",Remarks=" + this.getRemarks() + ")";
    }
}

