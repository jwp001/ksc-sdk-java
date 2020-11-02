package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.DeleteResourceRequirementRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for DeleteResourceRequirement.
 * </p>
 */
public class DeleteResourceRequirementRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<DeleteResourceRequirementRequest> {

    /**
     * 资源需求的ID
     */
    private String resourceRequirementId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        DeleteResourceRequirementRequest that = (DeleteResourceRequirementRequest) o;
        if (resourceRequirementId != null ? !resourceRequirementId.equals(that.resourceRequirementId) : that.resourceRequirementId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (resourceRequirementId != null ? resourceRequirementId.hashCode() : 0);
        return result;
    }

    public void setResourceRequirementId(String resourceRequirementId) {
        this.resourceRequirementId = resourceRequirementId;
    }
    public String getResourceRequirementId() {
        return resourceRequirementId;
    }

    @Override
    public Request<DeleteResourceRequirementRequest> getDryRunRequest() {
        Request<DeleteResourceRequirementRequest> request = new DeleteResourceRequirementRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public DeleteResourceRequirementRequest clone() {
        return (DeleteResourceRequirementRequest) super.clone();
    }
}

