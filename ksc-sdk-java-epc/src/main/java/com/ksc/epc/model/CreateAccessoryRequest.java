package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.CreateAccessoryRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for CreateAccessory.
 * </p>
 */
public class CreateAccessoryRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<CreateAccessoryRequest> {

    /**
     * 配件类型
     */
    private String accessoryType;
    /**
     * 配件规格
     */
    private String accessorySuit;
    /**
     * 配件名称
     */
    private String accessoryName;
    /**
     * 计费类型
     */
    private String chargeType;
    /**
     * 可用区
     */
    private String availabilityZone;
    /**
     * 购买时长
     */
    private Integer purchaseTime;
    /**
     * 项目ID
     */
    private String projectId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        CreateAccessoryRequest that = (CreateAccessoryRequest) o;
        if (accessoryType != null ? !accessoryType.equals(that.accessoryType) : that.accessoryType != null)
            return false;
        if (accessorySuit != null ? !accessorySuit.equals(that.accessorySuit) : that.accessorySuit != null)
            return false;
        if (accessoryName != null ? !accessoryName.equals(that.accessoryName) : that.accessoryName != null)
            return false;
        if (chargeType != null ? !chargeType.equals(that.chargeType) : that.chargeType != null)
            return false;
        if (availabilityZone != null ? !availabilityZone.equals(that.availabilityZone) : that.availabilityZone != null)
            return false;
        if (purchaseTime != null ? !purchaseTime.equals(that.purchaseTime) : that.purchaseTime != null)
            return false;
        if (projectId != null ? !projectId.equals(that.projectId) : that.projectId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (accessoryType != null ? accessoryType.hashCode() : 0);
        result = 31 * result + (accessorySuit != null ? accessorySuit.hashCode() : 0);
        result = 31 * result + (accessoryName != null ? accessoryName.hashCode() : 0);
        result = 31 * result + (chargeType != null ? chargeType.hashCode() : 0);
        result = 31 * result + (availabilityZone != null ? availabilityZone.hashCode() : 0);
        result = 31 * result + (purchaseTime != null ? purchaseTime.hashCode() : 0);
        result = 31 * result + (projectId != null ? projectId.hashCode() : 0);
        return result;
    }

    public void setAccessoryType(String accessoryType) {
        this.accessoryType = accessoryType;
    }
    public String getAccessoryType() {
        return accessoryType;
    }
    public void setAccessorySuit(String accessorySuit) {
        this.accessorySuit = accessorySuit;
    }
    public String getAccessorySuit() {
        return accessorySuit;
    }
    public void setAccessoryName(String accessoryName) {
        this.accessoryName = accessoryName;
    }
    public String getAccessoryName() {
        return accessoryName;
    }
    public void setChargeType(String chargeType) {
        this.chargeType = chargeType;
    }
    public String getChargeType() {
        return chargeType;
    }
    public void setAvailabilityZone(String availabilityZone) {
        this.availabilityZone = availabilityZone;
    }
    public String getAvailabilityZone() {
        return availabilityZone;
    }
    public void setPurchaseTime(Integer purchaseTime) {
        this.purchaseTime = purchaseTime;
    }
    public Integer getPurchaseTime() {
        return purchaseTime;
    }
    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }
    public String getProjectId() {
        return projectId;
    }

    @Override
    public Request<CreateAccessoryRequest> getDryRunRequest() {
        Request<CreateAccessoryRequest> request = new CreateAccessoryRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public CreateAccessoryRequest clone() {
        return (CreateAccessoryRequest) super.clone();
    }
}

