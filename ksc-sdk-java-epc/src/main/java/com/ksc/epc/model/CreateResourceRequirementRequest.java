package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.CreateResourceRequirementRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateResourceRequirement.
 * </p>
 */
public class CreateResourceRequirementRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateResourceRequirementRequest> {

    /**
     * 可用区
     */
    private String availabilityZone;
    /**
     * 服务器需求数量
     */
    private Integer requirementCount;
    /**
     * 项目名称
     */
    private String projectName;
    /**
     * 期望交付时间
     */
    private String usageDate;
    /**
     * 备注
     */
    private String description;
    /**
     * 机型
     */
    private String hostType;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateResourceRequirementRequest that = (CreateResourceRequirementRequest) o;
        if (availabilityZone != null ? !availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null)
            return false;
        if (requirementCount != null ? !requirementCount.equals(that.requirementCount) : that.requirementCount != null)
            return false;
        if (projectName != null ? !projectName.equals(that.projectName) : that.projectName != null)
            return false;
        if (usageDate != null ? !usageDate.equals(that.usageDate) : that.usageDate != null)
            return false;
        if (description != null ? !description.equals(that.description) : that.description != null)
            return false;
        if (hostType != null ? !hostType.equals(that.hostType) : that.hostType != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (availabilityZone != null ? availabilityZone.hashCode() : 0);
        result = 31 * result + (requirementCount != null ? requirementCount.hashCode() : 0);
        result = 31 * result + (projectName != null ? projectName.hashCode() : 0);
        result = 31 * result + (usageDate != null ? usageDate.hashCode() : 0);
        result = 31 * result + (description != null ? description.hashCode() : 0);
        result = 31 * result + (hostType != null ? hostType.hashCode() : 0);
        return result;
    }

    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }

    public String getAvailabilityZone() {
        return availabilityZone;
    }

    public void setRequirementCount(Integer requirementCount) {
        this.requirementCount = requirementCount;
    }

    public Integer getRequirementCount() {
        return requirementCount;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setUsageDate(String usageDate) {
        this.usageDate = usageDate;
    }

    public String getUsageDate() {
        return usageDate;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public void setHostType(String hostType) {
        this.hostType = hostType;
    }

    public String getHostType() {
        return hostType;
    }


    @Override
    public Request<CreateResourceRequirementRequest> getDryRunRequest() {
        Request<CreateResourceRequirementRequest> request = new CreateResourceRequirementRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateResourceRequirementRequest clone() {
        return (CreateResourceRequirementRequest) super.clone();
    }

    public String toString() {
        return "CreateResourceRequirementRequest(AvailabilityZone=" + this.getAvailabilityZone() + ",RequirementCount=" + this.getRequirementCount() + ",ProjectName=" + this.getProjectName() + ",UsageDate=" + this.getUsageDate() + ",Description=" + this.getDescription() + ",HostType=" + this.getHostType() + ")";
    }
}

