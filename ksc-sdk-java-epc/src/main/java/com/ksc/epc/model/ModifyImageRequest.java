package com.ksc.epc.model;

import com.ksc.KscWebServiceRequest;
import com.ksc.Request;
import com.ksc.model.DryRunSupportedRequest;
import com.ksc.epc.model.transform.ModifyImageRequestMarshaller;

import java.io.Serializable;

/**
 * <p>
 * Contains the parameters for ModifyImage.
 * </p>
 */
public class ModifyImageRequest extends KscWebServiceRequest implements
        Serializable, Cloneable, DryRunSupportedRequest<ModifyImageRequest> {

    /**
     * 镜像名称
     */
    private String imageName;
    /**
     * 镜像ID
     */
    private String imageId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ModifyImageRequest that = (ModifyImageRequest) o;
        if (imageName != null ? !imageName.equals(that.imageName) : that.imageName != null)
            return false;
        if (imageId != null ? !imageId.equals(that.imageId) : that.imageId != null)
            return false;
        return true;
    }

    @Override
    public int hashCode() {
        int result = super.hashCode();
        result = 31 * result + (imageName != null ? imageName.hashCode() : 0);
        result = 31 * result + (imageId != null ? imageId.hashCode() : 0);
        return result;
    }

    public void setImageName(String imageName) {
        this.imageName = imageName;
    }
    public String getImageName() {
        return imageName;
    }
    public void setImageId(String imageId) {
        this.imageId = imageId;
    }
    public String getImageId() {
        return imageId;
    }

    @Override
    public Request<ModifyImageRequest> getDryRunRequest() {
        Request<ModifyImageRequest> request = new ModifyImageRequestMarshaller()
                .marshall(this);
        request.addParameter("DryRun", Boolean.toString(true));
        return request;
    }

    @Override
    public ModifyImageRequest clone() {
        return (ModifyImageRequest) super.clone();
    }
}

